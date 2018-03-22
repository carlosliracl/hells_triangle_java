package hells_triangle;

public class App {
	public static void main(String[] args) {

		int[][] triangle = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };

		HellsTriangleUtils.print(triangle);
		
		long t1 = System.nanoTime();
		int result = new HellsTriangleImpl2(triangle).sum();
		long t2 = System.nanoTime();
		
		System.out.println(String.format("Result impl 1: %d in %d nanosecs", result, t2 - t1));
		
		t1 = System.nanoTime();
		result = new HellsTriangleImpl(triangle).sum();
		t2 = System.nanoTime();
		
		System.out.println(String.format("Result impl 2: %d in %d nanosecs", result, t2 - t1));
	}

}
