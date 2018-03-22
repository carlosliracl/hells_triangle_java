package hells_triangle;

import java.util.Random;

public class HellsTriangleUtils {
	
	
	public static void print(int[][] triangle) {
		// get base length
		int spaces = triangle[triangle.length - 1].length;
		for (int i = 0; i < triangle.length; i++) {
			int[] current = triangle[i];
			System.out.print(String.format("%" + spaces + "s", ""));
			for (int j = 0; j < current.length; j++) {
				System.out.print(current[j] + " ");
			}
			spaces--;
			System.out.println();
		}
		System.out.println();
	}

	public static int countElements(int[][] triangle) {
		int topLength = triangle[0].length;
		int baseLength = triangle[triangle.length - 1].length;
		return (topLength + baseLength) * triangle.length / 2;
	}

	/**
	 * Validates if a triangle array has a valid quantity of element on each floor,
	 * if not throws a exception
	 * 
	 * @param triangle
	 * @throws IllegalTriangleException
	 */
	public static void validate(int[][] triangle) throws IllegalTriangleException {
		int expectedLength = 1;
		for (int i = 0; i < triangle.length; i++) {
			if (triangle[i].length != expectedLength) {
				throw new IllegalTriangleException(i, expectedLength, triangle[i].length);
			}
			expectedLength++;
		}
	}

	/**
	 * Creates a new hells triangle array with the height as param
	 * 
	 * @param height
	 * @return
	 */
	public static int[][] make(int height) {

		Random random = new Random();
		int[][] triangle = new int[height][];

		for (int i = 0; i < height; i++) {
			triangle[i] = new int[i + 1];
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j] = random.nextInt(10);
			}
		}

		return triangle;
	}

}
