package chap10.textbook.exercise.p07;

public class NotExistIDException extends Exception{
	public NotExistIDException() { }
	public NotExistIDException(String message) {
		super(message);
	}
}
