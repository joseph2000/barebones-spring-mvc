<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="simple" modelAttribute="simpleForm">
	<table>
		<tr>
			<td><spring:message code="value1" /></td>
			<td><form:input path="value1" /></td>
		</tr>
		<tr>
			<td><spring:message code="value2" /></td>
			<td><form:select path="value2" items="${values}" /></td>
		</tr>
		<tr>
			<td><spring:message code="value3" /></td>
			<td>
				<spring:message code="check1" /> <form:checkbox path="value3" value="check1" /><br />
				<spring:message code="check2" /> <form:checkbox path="value3" value="check2" /><br />
				<spring:message code="check3" /> <form:checkbox path="value3" value="check3" /><br />
			</td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
