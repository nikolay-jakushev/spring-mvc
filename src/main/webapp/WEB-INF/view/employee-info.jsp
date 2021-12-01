<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<body>

<form:form action = "saveEmployee" modelAttribute="employee">

        Name <form:input path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <br><br>
        Department <form:select path="department"/>
        <br><br>
        Salary <form:input path="salary"/>
        <br><br>
        <input type="submit", value="OK">
</form:form>

</body>
</html>