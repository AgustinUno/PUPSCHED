<?php
session_start();

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

// Check if student_id is set in session
if (!isset($_SESSION['student_id'])) {
    die("You are not logged in. Please log in first.");
}

// Fetch user data
$student_id = $_SESSION['student_id'];
$sql = "SELECT STUDNAME, EMAIL FROM studinfo WHERE STUDNUM = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("s", $student_id);
$stmt->execute();
$result = $stmt->get_result();

if ($result->num_rows > 0) {
    $user_data = $result->fetch_assoc();
} else {
    die("No user data found.");
}

$stmt->close();
$conn->close();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PUPSCHED - Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #510101;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
        }
        .logo {
            display: flex;
            align-items: center;
        }
        .logo img {
            width: 40px;
            height: 40px;
            margin-right: 10px;
        }
        .logo span {
            font-size: 24px;
            font-weight: bold;
            color: #510101;
        }
        h2 {
            color: #333;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #666;
        }
        input[type="text"],
        input[type="email"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .back-btn {
            background-color: #00bfff;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            text-decoration: none;
            display: inline-block;
            margin-top: 20px;
        }
        .back-btn:hover {
            background-color: #0099cc;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <div class="logo">
                <img src="pup logo.png" alt="PUP Logo">
                <span>PUPSCHED</span>
            </div>
        </div>
        <h2>Personal Data</h2>
        <form>
            <div class="form-group">
                <label for="student-name">Student name</label>
                <input type="text" id="student-name" value="<?php echo htmlspecialchars($user_data['STUDNAME']); ?>" readonly>
            </div>
            <div class="form-group">
                <label for="email">Email Address</label>
                <input type="email" id="email" value="<?php echo htmlspecialchars($user_data['EMAIL']); ?>" readonly>
            </div>
        </form>
        <a href="calendar.html" class="back-btn">Back to Calendar</a>
    </div>
</body>
</html>