package hells_triangle;

public class HellsTriangleImpl2 {

	private final int[][] triangle;

	public HellsTriangleImpl2(int[][] triangle) {
		this.triangle = triangle;
	}

	public int sum() {
		return sum(0, 0);
	}

	private int sum(int height, int index) {
		// System.out.println(String.format("%d - %d - %d - %d",triangle[height][index],
		// height, index, sum));

		// the sum starts with the current index value
		int sum = triangle[height][index];

		// if its not a element on the baseline asks for the left and right sum
		if (height < triangle.length - 1) {

			// asks for the greatest sum from the left path
			int sumLeftPath = sum(height + 1, index);

			// asks for the greatest sum from the right path
			int sumRightPath = sum(height + 1, index + 1);

			// chooses the path with the greatest value
			sum += sumLeftPath >= sumRightPath ? sumLeftPath : sumRightPath;
		}

		return sum;
	}

}
