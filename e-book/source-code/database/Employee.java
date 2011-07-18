@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column
	private String name;

	@Column
	private String title;

	public Employee() {

	}

	public Employee(Long id, String name, String title) {
		this.id = id;
		this.name = name;
		this.title = title;
	}

	// Getters and setters omitted for brevity.
}
