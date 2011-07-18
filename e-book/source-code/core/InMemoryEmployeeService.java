@Repository
public class InMemoryEmployeeService implements EmployeeService {

	private long maxId = 3L;

	private final Map<Long, Employee> employees = new HashMap<Long, Employee>() {
		private static final long serialVersionUID = 1L;
		{
			put(1L, new Employee(1L, "Professor Jefe", "The Boss"));
			put(2L, new Employee(2L, "Number Two", "Number Two"));
			put(3L, new Employee(3L, "Johnny McDoe", "Work Man"));
		}
	};

	@Override
	public Employee get(Long id) {
		return employees.get(id);
	}

	@Override
	public Collection<Employee> get() {
		return employees.values();
	}

	private synchronized long nextId() {
		return ++maxId;
	}

	@Override
	public Employee save(Employee employee) {
		if (employee.getId() == null) {
			employee.setId(nextId());
		}
		employees.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public void delete(Long employeeId) {
		employees.remove(employeeId);
	}
}
