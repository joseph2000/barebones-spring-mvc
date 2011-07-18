@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// Some methods omitted for brevity.

	@RequestMapping(method = RequestMethod.POST)
	public String save(@Valid BindableEmployee bindableEmployee,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "employee";
		}

		employeeService.save(bindableEmployee.asEmployee());
		return "redirect:employees";
	}
}
