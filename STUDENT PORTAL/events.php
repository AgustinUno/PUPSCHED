<?php
// Database connection details
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "sample_sched";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Fetch events from MySQL database
$sql = "SELECT title, DATE_FORMAT(date, '%Y-%m-%d') AS start FROM sched_samp";
$result = $conn->query($sql);

$events = array();
if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        $events[] = array(
            'title' => $row['title'],
            'start' => $row['start'] // Ensure the date format is yyyy-mm-dd
        );
    }
}

// Convert the array to JSON format
header('Content-Type: application/json');
echo json_encode($events);

// Close the connection
$conn->close();
?>
