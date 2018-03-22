package hells_triangle;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class HellsTriangleTest {

	private int[][] triangle;
	private int expectedResult;

	// Inject via constructor
	public HellsTriangleTest(int[][] triangle, int expectedResult) {
		this.triangle = triangle;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection trianglesData() {

		int[][] triangle_1 = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };
		int[][] triangle_2 = { { 4 }, { 9, 8 }, { 7, 1, 9 }, { 2, 4, 9, 9 } };
		int[][] triangle_3 = { { 1 }, { 5, 6 }, { 8, 1, 4 }, { 2, 1, 2, 6 } };
		int[][] triangle_4 = { { 5 }, { 3, 3 }, { 2, 0, 0 }, { 3, 8, 7, 0 }, { 0, 3, 0, 2, 3 } };
		int[][] triangle_5 = { { 6 }, { 3, 5 } };
		int[][] triangle_6 = { { 6 } };

		return Arrays.asList(new Object[][] { 
			{ triangle_1, 26 }
			, { triangle_2, 30 }
			, { triangle_3, 17 }
			, { triangle_4, 21 }
			, { triangle_5, 11 }
			, { triangle_6, 6 }
		});
	}

	@Test
	public void testSumTriangle() {
		int result = new HellsTriangleImpl2(triangle).sum();
		assertTrue(String.format("Got %d, when %d was expected", result, expectedResult), result == expectedResult);
	}

}
