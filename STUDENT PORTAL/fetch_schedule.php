<?php
$servername = "localhost";
$username = "root";
$password = ""; 
$dbname = "sched";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$week_id = $_GET['week_id'];

$sql = "SELECT course, room, time, note FROM schedule WHERE week_id = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("i", $week_id);
$stmt->execute();
$result = $stmt->get_result();

$data = array();
while($row = $result->fetch_assoc()) {
    $data[] = $row;
}

echo json_encode($data);

$stmt->close();
$conn->close();
?>