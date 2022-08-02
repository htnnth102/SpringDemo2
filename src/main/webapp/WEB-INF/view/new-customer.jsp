<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUSPC
  Date: 8/2/2022
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New customer</title>
</head>
<body>
<div>
    <h2>New Customer</h2>
    <form:form action="save" method="post" modelAttribute="customer">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address"/></td>
            </tr>
            <tr>
               <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>

    </form:form>
</div>
</body>
</html>
