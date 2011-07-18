@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<BindableEmployee> get() {
		return BindableEmployee.bindableEmployees(employeeService.get());
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String get(Model model) {
		return get(null, model);
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public String get(@PathVariable Long employeeId, Model model) {
		Employee employee = employeeService.get(employeeId);
		if (employee != null) {
			model.addAttribute(new BindableEmployee(employee));
		} else {
			model.addAttribute(new BindableEmployee());
		}
		return "employee";
	}

	@RequestMapping(value = "/{employeeId}/delete", method = RequestMethod.GET)
	public String deleteViaGet(@PathVariable Long employeeId) {
		return delete(employeeId);
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Long employeeId) {
		employeeService.delete(employeeId);
		return "redirect:../../employees";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String save(BindableEmployee bindableEmployee) {
		employeeService.save(bindableEmployee.asEmployee());
		return "redirect:employees";
	}
}
