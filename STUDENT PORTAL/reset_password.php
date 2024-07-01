<?php
// Database connection details
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "admin_info";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die(json_encode(['success' => false, 'message' => "Connection failed: " . $conn->connect_error]));
}

$action = $_POST['action'];

switch ($action) {
    case 'verify_student_id':
        verifyStudentId($conn);
        break;
    case 'verify_security_answers':
        verifySecurityAnswers($conn);
        break;
    case 'reset_password':
        resetPassword($conn);
        break;
    default:
        echo json_encode(['success' => false, 'message' => 'Invalid action']);
}

function verifyStudentId($conn) {
    $student_id = $_POST['username'];
    $sql = "SELECT * FROM studinfo WHERE STUDNUM = ?";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("s", $student_id);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows > 0) {
        echo json_encode(['success' => true, 'message' => 'Student ID found']);
    } else {
        echo json_encode(['success' => false, 'message' => 'Student ID not found']);
    }
    $stmt->close();
}

function verifySecurityAnswers($conn) {
    $student_id = $_POST['student-id'];
    $father_name = $_POST['father-name'];
    $pet_name = $_POST['pet-name'];

    $sql = "SELECT * FROM studinfo WHERE STUDNUM = ? AND SEC_Q1 = ? AND SEC_Q2 = ?";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("sss", $student_id, $father_name, $pet_name);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows > 0) {
        echo json_encode(['success' => true, 'message' => 'Security answers verified']);
    } else {
        echo json_encode(['success' => false, 'message' => 'Incorrect security answers']);
    }
    $stmt->close();
}

function resetPassword($conn) {
    $student_id = $_POST['student-id'];
    $new_password = $_POST['new-password'];

  
    $sql = "UPDATE studinfo SET PASSWORD = ? WHERE STUDNUM = ?";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("ss", $new_password, $student_id);

    if ($stmt->execute()) {
        echo json_encode(['success' => true, 'message' => 'Password reset successful. Redirecting to login page...']);
    } else {
        echo json_encode(['success' => false, 'message' => 'Error resetting password']);
    }
    $stmt->close();
}

$conn->close();
?>