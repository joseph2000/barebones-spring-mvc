public class BindableEmployee {

	private Long id;
	private String name;
	private String title;

	public BindableEmployee() {
	}

	public BindableEmployee(Employee employee) {
		this.id = employee.getId();
		this.name = employee.getName();
		this.title = employee.getTitle();
	}

	// Getters and setters omitted for brevity.

	public static Collection<BindableEmployee> bindableEmployees(
			Collection<Employee> employees) {
		Collection<BindableEmployee> bindableEmployees = new ArrayList<BindableEmployee>();
		for (Employee employee : employees) {
			bindableEmployees.add(new BindableEmployee(employee));
		}
		return bindableEmployees;
	}

	public Employee asEmployee() {
		return new Employee(id, name, title);
	}

}
