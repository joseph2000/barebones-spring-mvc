public class BindableEmployee {

	private Long id;

	@Pattern(regexp = "\\w+ \\w+")
	private String name;

	@Pattern(regexp = "\\w+( \\w+)?")
	private String title;

	// Methods omitted for brevity.

}
