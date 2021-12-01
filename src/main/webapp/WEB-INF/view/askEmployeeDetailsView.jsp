<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<body>

<form:form action = "showDetails" modelAttribute="employee">
        Name <form:input path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <br><br>
        Salary <form:input path="salary"/>
        <br><br>
        Department <form:select path="department">
        <form:option value="${employee.departments}"/>
        </form:select>
        <br><br>
        <input type="submit", value="OK">
</form:form>

</body>
</html>