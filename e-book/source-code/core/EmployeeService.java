public interface EmployeeService {

	public Collection<Employee> get();

	public Employee get(Long id);

	public Employee save(Employee employee);

	public void delete(Long id);
}
