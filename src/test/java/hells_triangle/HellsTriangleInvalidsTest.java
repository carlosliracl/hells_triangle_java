package hells_triangle;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class HellsTriangleInvalidsTest {

	private int[][] triangle;
	private int expectedResult;

	// Inject via constructor
	public HellsTriangleInvalidsTest(int[][] triangle, int expectedResult) {
		this.triangle = triangle;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection trianglesData() {

		int[][] triangle_1 = {};
		int[][] triangle_2 = { { 4 }, { 9 }, { 7, 1, 9 }, { 2, 4, 9, 9 } };
		int[][] triangle_3 = { { 1 }, { 5, 6 }, { 8, 4 } };
		int[][] triangle_4 = { { 3, 3 }, { 2, 0, 0 }, { 3, 8, 7, 0 } };
		int[][] triangle_5 = { {} };

		return Arrays.asList(new Object[][] { 
			{ triangle_1, 26 }
			, { triangle_2, 30 }
			, { triangle_3, 17 }
			, { triangle_4, 21 }
			, { triangle_5, 11 }
		});
	}

	@Test(expected = IllegalTriangleException.class)
	public void testSumTriangleWithException() {
		HellsTriangleUtils.validate(triangle);
	}
}
