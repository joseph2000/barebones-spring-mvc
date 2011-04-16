<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="simpleForm.jsp" />
<hr />
<table>
    <tr>
        <td><spring:message code="value1" /></td>
        <td><c:out value="${value1}" /></td>
    </tr>
    <tr>
        <td><spring:message code="value2" /></td>
        <td><c:out value="${value2}" /></td>
    </tr>
    <tr>
        <td><spring:message code="value3" /></td>
        <td><c:out value="${value3}" /></td>
    </tr>
</table>
