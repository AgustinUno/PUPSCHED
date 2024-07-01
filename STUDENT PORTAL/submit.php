<?php
session_start();

$student_id = $_POST['name'];
$pass = $_POST['pass'];

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

// Prepare and execute SQL statement
$sql = "SELECT * FROM studinfo WHERE STUDNUM = ? AND PASSWORD = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("ss", $student_id, $pass);
$stmt->execute();
$result = $stmt->get_result();

// Check if query was successful
if ($result === false) {
    echo "<script>
            console.error('Error executing query');
            alert('Error executing query');
            window.history.back();
          </script>";
    error_log("Error executing query: " . $stmt->error);
} else {
    if ($result->num_rows > 0) {
        // Set session variable
        $_SESSION['student_id'] = $student_id;
        
        echo "<script>
                console.log('Login successful');
                alert('Login successful');
                window.location.href = 'calendar.html';
              </script>";
        error_log("Login successful for student ID: " . $student_id);
    } else {
        echo "<script>
                console.warn('Invalid student ID or password');
                alert('Invalid student ID or password');
                window.history.back();
              </script>";
        error_log("Invalid login attempt for student ID: " . $student_id);
    }
}

// Close statement and connection
$stmt->close();
$conn->close();
?>