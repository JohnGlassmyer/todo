package todo;

public class Todo {
	// visible for testing
	static class TodoException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		TodoException() {
			super();
		}

		TodoException(String message) {
			super(message);
		}
	}

	@Deprecated
	public static <T> T todo() throws TodoException {
		throw new TodoException();
	}

	@Deprecated
	public static <T> T todo(String message) throws TodoException {
		throw new TodoException(message);
	}
}
