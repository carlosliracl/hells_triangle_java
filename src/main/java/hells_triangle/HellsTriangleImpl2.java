package hells_triangle;

public class HellsTriangleImpl2 {

	private final int[][] triangle;

	public HellsTriangleImpl2(int[][] triangle) {
		this.triangle = triangle;
	}

	public int sum() {
		return sum(0, 0, 0);
	}

	private int sum(int sum, int height, int index) {
		// System.out.println(String.format("%d - %d - %d - %d",triangle[height][index], height, index, sum));
		if (height == 0) {
			sum += triangle[0][0];
		}
		if (height < triangle.length - 1) {

			int sumLeftPath = sum(triangle[height + 1][index], height + 1, index);
			
			int sumRightPath = sum(triangle[height + 1][index + 1], height + 1, index + 1);

			if (sumLeftPath >= sumRightPath) {
				sum += sumLeftPath;
			} else {
				sum += sumRightPath;
			}
		}

		return sum;
	}
}
