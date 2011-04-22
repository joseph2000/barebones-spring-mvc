<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title><spring:message code="application.title" /></title>
		<link type="text/css" rel="stylesheet" href="<c:url value="/style.css" />" />
	</head>
	<body>
		<h1><a href="<c:url value="/employees" />"><spring:message code="application.title" /></a></h1>
		<div id="body">
			<ul class="locale">
				<li><a href="?locale=en"><spring:message code="english" /></a></li>
				<li><a href="?locale=es"><spring:message code="spanish" /></a></li>
			</ul>
			<h2><spring:message code="heading.employees" /></h2>
			<ul class="button">
				<li><a href="<c:url value="/employees/new" />"><spring:message code="button.add-employee" /></a></li>
			</ul>
			<table cellpadding="0" cellspacing="0">
				<thead>
					<tr>
						<th><spring:message code="heading.name" /></th>
						<th><spring:message code="heading.title" /></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bindableEmployeeList}" var="employee">
						<tr>
							<td><a href="<c:url value="/employees/${employee.id}" />"><c:out value="${employee.name}" /></a></td>
							<td><c:out value="${employee.title}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>