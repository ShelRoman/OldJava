package week6.homework;

public class NoSuchStudentException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchStudentException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
