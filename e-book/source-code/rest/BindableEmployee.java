@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement
public class BindableEmployee {

	@XmlElement
	private Long id;

	@XmlElement
	@Pattern(regexp = "\\w+ \\w+")
	private String name;

	@XmlElement
	@Pattern(regexp = "\\w+( \\w+)?")
	private String title;

	// Methods omitted for brevity.
}
