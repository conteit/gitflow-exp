package biz.videomed.exp.gitflow;

/**
 * <p>
 * This is the main class.
 * </p>
 *
 * @author <a href="mailto:software@videomed.biz">Videomed R&D Software
 *         Dept.</a>
 * @version 1.1-28/ago/2015
 * @since 1.5.1.1
 *
 */
public class Main {

	private String composeGreeting() {
		return "Hello World!";
	}

	private void print(final String msg) {
		System.out.println(msg);
	}

	/**
	 * <p>
	 * Entry point.
	 * </p>
	 *
	 * @param args
	 *            None
	 */
	public static void main(String[] args) {
		final Main main = new Main();
		main.print(main.composeGreeting());

		System.exit(0);
	}

}
