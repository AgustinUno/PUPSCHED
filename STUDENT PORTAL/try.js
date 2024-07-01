let currentMonth = 1; // May
let currentWeek = 1;  // Week 1
let currentDay = 1;   // Sunday

function toggleDropdown(id) {
    document.getElementById(id + "Dropdown").classList.toggle("show");
}

function updateDropdownValue(type, value) {
    document.getElementById(type).getElementsByTagName('button')[0].textContent = value + ' ▼';
    if (type === 'month') {
        currentMonth = value === 'May' ? 1 : (value === 'June' ? 2 : 3);
    } else if (type === 'week') {
        currentWeek = parseInt(value.split(' ')[1]);
    }
    updateSchedule();
}

function displayValue(day) {
    switch(day) {
        case 'S': currentDay = 1; break;
        case 'M': currentDay = 2; break;
        case 'T': currentDay = 3; break;
        case 'W': currentDay = 4; break;
        case 'TH': currentDay = 5; break;
        case 'F': currentDay = 6; break;
        case 'SA': currentDay = 7; break;
    }
    updateSchedule();
}

function updateSchedule() {
    const weekId = currentMonth * 100 + currentWeek * 10 + currentDay;
    fetch(`fetch_schedule.php?week_id=${weekId}`)
        .then(response => response.json())
        .then(data => {
            let content = '';
            if (data.length > 0) {
                const courses = data[0].course ? data[0].course.split(';').map(course => course.trim()) : [];
                const rooms = data[0].room ? data[0].room.split(';').map(room => room.trim()) : [];
                const times = data[0].time ? data[0].time.split(';').map(time => time.trim()) : [];
                const notes = data[0].note ? data[0].note.split(';').map(note => note.trim()) : [];

                if (courses.length > 0) {
                    courses.forEach((course, index) => {
                        content += `
                            <br>
                            Course:\t${course}<br>
                            Room:\t${rooms[index] || ''}<br>
                            Time:\t${times[index] || ''}<br>
                            Note:\t${notes[index] || ''}<br>
                            <br>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                        `;
                    });
                } else {
                    content = 'No schedule for this day';
                }
            } else {
                content = 'No schedule for this day';
            }
            document.querySelector('.content').innerHTML = content;
        })
        .catch(error => {
            console.error('Error:', error);
            document.querySelector('.content').innerHTML = 'Error loading schedule';
        });
}



// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
    if (!event.target.matches('.dropdown button')) {
        var dropdowns = document.getElementsByClassName("dropdown-content");
        for (var i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}

// Initialize schedule on page load
updateSchedule();