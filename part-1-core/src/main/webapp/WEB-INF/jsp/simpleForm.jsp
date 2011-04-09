<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="simple" modelAttribute="simpleForm">
	<table>
		<tr>
			<td>Value 1:</td>
			<td><form:input path="value1" /></td>
		</tr>
		<tr>
			<td>Value 2:</td>
			<td><form:select path="value2" items="${values}" /></td>
		</tr>
		<tr>
			<td>Value 3:</td>
			<td>
				Check 1: <form:checkbox path="value3" value="check1" /><br />
				Check 2: <form:checkbox path="value3" value="check2" /><br />
				Check 3: <form:checkbox path="value3" value="check3" /><br />
			</td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
