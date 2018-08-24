package week6.homework;

public class NoSuchCourseException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchCourseException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
