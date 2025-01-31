<?php
session_start();

// Retrieve student ID from form submission
$student_id = $_POST['username'];

// Database connection details
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "admin_info";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Prepare SQL statement
$sql = "SELECT * FROM studinfo WHERE STUDNUM = ?";
$stmt = $conn->prepare($sql);

// Bind parameters and execute SQL statement
$stmt->bind_param("s", $student_id);
$stmt->execute();

// Get result
$result = $stmt->get_result();

// Check if query was successful
if ($result->num_rows > 0) {
    // Student ID exists in database, store it in session and proceed
    $_SESSION['reset_student_id'] = $student_id;
    echo "<script>
            window.location.href = 'securi.html';
          </script>";
} else {
    // Student ID does not exist in database
    echo "<script>
            alert('Student ID not found. Access denied.');
            window.history.back();
          </script>";
}

// Close statement and connection
$stmt->close();
$conn->close();
?>