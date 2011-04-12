<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="simple" modelAttribute="simpleForm">
	<ul>
		<li>
			<label for="value1">Value 1:</label>
			<form:input path="value1" />
			<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "value1",
					widgetType : "dijit.form.ValidationTextBox",
					widgetAttrs : {
						regExp : "^.{2,6}$",
						required : true
					}
				}));
			</script>
		</li>
		<li>
			<label for="value2">Value 2:</label>
			<form:select path="value2" items="${values}" />
			<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "value2",
					widgetType : "dijit.form.ComboBox"
				}));
			</script>
		</li>
		<li>
			<label for="value3">Value 3:</label>
			<div><form:checkbox path="value3" value="check1" label="Check 1" /></div>
			<div><form:checkbox path="value3" value="check2" label="Check 2" /></div>
			<div><form:checkbox path="value3" value="check3" label="Check 3" /></div>
			<script type="text/javascript">
			    dojo.query("#value3	 input[type='checkbox']").forEach(function(element) {
			        Spring.addDecoration(new Spring.ElementDecoration({
			            elementId: element.id,
			            widgetType : "dijit.form.CheckBox",
			            widgetAttrs : { checked : element.checked }
			        }));
			    });
			</script>
		</li>
		<li>
			<input id="submit" type="submit" value="Submit" />
			<script type="text/javascript">
			    Spring.addDecoration(new Spring.ValidateAllDecoration({
				    elementId: "submit",
				    event: "onclick" }));
			</script>
		</li>
	</ul>
</form:form>
