<ul class="button">
	<li><a href="<c:url value="/employees/new" />">Add Employee</a></li>
</ul>
<table cellpadding="0" cellspacing="0">
	<thead>
		<tr>
			<th>Name</th>
			<th>Title</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${bindableEmployeeList}" var="employee">
			<tr>
				<td>
					<a href="<c:url value="/employees/${employee.id}" />">
						<c:out value="${employee.name}" />
					</a>
				</td>
				<td><c:out value="${employee.title}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
