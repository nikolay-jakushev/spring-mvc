<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<body>

<h2>All employee</h2>
<br>
<br>
<table>

    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmployee}">
        <c:url var="button" value="/updateInfo">
            <c:param name="employeeID" value="${emp.id}"/>
        </c:url>
        <c:url var="buttonDelete" value="/deleteEmployee">
            <c:param name="employeeID" value="${emp.id}"/>
        </c:url>
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${button}'"/>
                <input type="button" value="Delete" onclick="window.location.href = '${buttonDelete}'"/>
            </td>
        </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="Add" onclick="window.location.href = 'addNewEmployee'"/>

</body>
</html>