<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>

    <h2>Student Registration Form</h2>

    <form action="student" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" required></td>
            </tr>

            <tr>
                <td>Email:</td>
                <td><input type="email" name="email" required></td>
            </tr>

            <tr>
                <td>Marks:</td>
                <td><input type="text" name="marks" required></td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save Student">
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
