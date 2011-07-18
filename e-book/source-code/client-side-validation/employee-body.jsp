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
