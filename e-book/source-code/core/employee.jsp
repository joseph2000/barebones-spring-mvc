<c:url var="formUrl" value="/employees" />
<form:form action="${formUrl}" modelAttribute="bindableEmployee">
	<ul class="button">
		<c:if test="${not empty bindableEmployee.id}">
			<li><a href="<c:url value="/employees/${bindableEmployee.id}/delete" />">
				Delete
			</a></li>
		</c:if>
		<li><input id="submit" type="submit" value="Save" /></li>
	</ul>
	<form:hidden path="id" />
	<ul>
		<li>
			<label for="name">Name</label>
			<form:input path="name" />
		</li>
		<li>
			<label for="title">Title</label>
			<form:input path="title" />
		</li>
	</ul>
</form:form>
