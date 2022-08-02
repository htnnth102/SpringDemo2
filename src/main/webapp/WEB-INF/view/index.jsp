<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>

<div>
    <h2>Customer Manager</h2>
    <form method="get" action="search">
        <input type="text" name="searchKey" id="searchKey">
        <input type="submit" value="search">
    </form>
    <h1>${name}</h1>
    <h3><a href="/new">Add Customer</a></h3>
    <table>

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Action</th>
        </tr>

        <c:forEach items="${listCustomers}" var="c">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.email}</td>
                <td>${c.address}</td>
                <td>
                    <a href="/edit?id=${c.id}">EDIT</a>&nbsp;&nbsp;&nbsp;
                    <a href="/delete?id=${c.id}">DELETE</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>