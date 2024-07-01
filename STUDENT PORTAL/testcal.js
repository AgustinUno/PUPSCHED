$(document).ready(function() {
  $('#calendar').fullCalendar({
    header: {
      left: 'prev,next today',
      center: 'title',
      right: ''
    },
    defaultView: 'basicDay',
    defaultDate: '2023-06-15', // Set this to the desired date
    allDaySlot: false,
    height: 'auto',
    contentHeight: 'auto',
    editable: true,
    eventLimit: false,
    events: {
      url: 'events.php', // Path to your PHP script that outputs JSON
      method: 'GET'
    }
  });
});
