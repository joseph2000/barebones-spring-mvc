<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="simpleForm.jsp" />
<hr />
<table>
	<tr>
		<td>Value 1:</td>
		<td><c:out value="${value1}" /></td>
	</tr>
	<tr>
		<td>Value 2:</td>
		<td><c:out value="${value2}" /></td>
	</tr>
	<tr>
		<td>Value 3:</td>
		<td><c:out value="${value3}" /></td>
	</tr>
</table>