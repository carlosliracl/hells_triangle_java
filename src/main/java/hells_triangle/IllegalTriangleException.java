package hells_triangle;

public class IllegalTriangleException extends IllegalArgumentException {
	public IllegalTriangleException(int height, int expectedLength, int realLength) {
		super("On floor #" + height + " was expected " + expectedLength + " items. Got: " + realLength);
	}
}
