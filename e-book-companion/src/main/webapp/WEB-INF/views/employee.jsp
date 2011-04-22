<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title><spring:message code="application.title" /></title>
		<script type="text/javascript" src="<c:url value="/resources/dojo/dojo.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/spring/Spring.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/spring/Spring-Dojo.js" />"></script>
		<link type="text/css" rel="stylesheet" href="<c:url value="/resources/dijit/themes/tundra/tundra.css" />" />
		<link type="text/css" rel="stylesheet" href="<c:url value="/style.css" />" />
	</head>
	<body class="tundra">
		<h1><a href="<c:url value="/employees" />"><spring:message code="application.title" /></a></h1>
		<div id="body">
			<ul class="locale">
				<li><a href="?locale=en"><spring:message code="english" /></a></li>
				<li><a href="?locale=es"><spring:message code="spanish" /></a></li>
			</ul>
			<h2><spring:message code="heading.employee" /></h2>
			<c:url var="formUrl" value="/employees" />
			<form:form action="${formUrl}" modelAttribute="bindableEmployee">
				<ul class="button">
					<c:if test="${not empty bindableEmployee.id}">
						<li><a href="<c:url value="/employees/${bindableEmployee.id}/delete" />"><spring:message code="button.delete" /></a></li>
					</c:if>
					<li><input id="submit" type="submit" value="<spring:message code="button.save" />" /></li>
				</ul>
				<form:hidden path="id" />
				<ul>
					<li>
						<label for="name"><spring:message code="heading.name" /></label> <form:input path="name" /> <form:errors path="name" />
					</li>
					<li>
						<label for="title"><spring:message code="heading.title" /></label> <form:input path="title" /> <form:errors path="title" />
					</li>
				</ul>
			</form:form>
		</div>
		<script type="text/javascript">
			Spring.addDecoration(new Spring.ValidateAllDecoration( {
				elementId : "submit",
				event : "onclick"
			}));
		
			Spring.addDecoration(new Spring.ElementDecoration( {
				elementId : "name",
				widgetType : "dijit.form.ValidationTextBox",
				widgetAttrs : {
					regExp : "\\w+ \\w+",
					required : true
				}
			}));
		
			Spring.addDecoration(new Spring.ElementDecoration( {
				elementId : "title",
				widgetType : "dijit.form.ValidationTextBox",
				widgetAttrs : {
					regExp : "\\w+( \\w+)?",
					required : true
				}
			}));
		</script>
	</body>
</html>