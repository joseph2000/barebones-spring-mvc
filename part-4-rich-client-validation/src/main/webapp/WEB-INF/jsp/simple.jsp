<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<script type="text/javascript" src="<c:url value="/resources/dojo/dojo.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/spring/Spring.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/spring/Spring-Dojo.js" />"></script>
		<link type="text/css" rel="stylesheet" href="<c:url value="/resources/dijit/themes/tundra/tundra.css" />" />
	</head>
	<body class="tundra">
		<c:import url="form.jsp" />
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
	</body>
</html>