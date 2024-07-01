<?php

// Retrieve answers from form submission
$father_name = $_POST['father-name'];
$pet_name = $_POST['pet-name'];

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
$sql = "SELECT SEC_Q1, SEC_Q2 FROM studinfo WHERE SEC_Q1 = ? AND SEC_Q2 = ?";
$stmt = $conn->prepare($sql);

// Bind parameters and execute SQL statement
$stmt->bind_param("ss", $father_name, $pet_name);
$stmt->execute();

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
