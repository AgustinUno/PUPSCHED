<?php

// Retrieve answers from form submission
$father_name = $_POST['father-name'];
$pet_name = $_POST['pet-name'];
$username = $_POST['username']; // Retrieve username from hidden input

// Database connection details
$servername = "localhost";
$username_db = "root";
$password_db = "";
$dbname = "admin_info";

// Create connection
$conn = new mysqli($servername, $username_db, $password_db, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Prepare SQL statement
$sql = "SELECT SEC_Q1, SEC_Q2 FROM studinfo WHERE STUDNUM = ? AND SEC_Q1 = ? AND SEC_Q2 = ?";
$stmt = $conn->prepare($sql);

if (!$stmt) {
    die("Prepare failed: (" . $conn->errno . ") " . $conn->error);
}

// Bind parameters and execute SQL statement
$stmt->bind_param("sss", $username, $father_name, $pet_name);
$stmt->execute();

if ($stmt->error) {
    die("Execute failed: (" . $stmt->errno . ") " . $stmt->error);
}

// Get result
$result = $stmt->get_result();

// Check if query was successful
if ($result->num_rows > 0) {
    // Answers match, proceed with verification
    echo "<script>
            alert('Security answers verified successfully');
            window.location.href = 'reset.html'; // Redirect to password reset form
          </script>";
} else {
    // Answers do not match
    echo "<script>
            alert('Incorrect security answers');
            window.history.back();
          </script>";
}

// Close statement and connection
$stmt->close();
$conn->close();

?>
