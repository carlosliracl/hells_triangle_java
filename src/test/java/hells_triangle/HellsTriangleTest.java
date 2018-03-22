package hells_triangle;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNoException;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

import hells_triangle.HellsTriangleImpl;

@RunWith(value = Parameterized.class)
public class HellsTriangleTest {
	
	private Set<Node> cache = new HashSet<>();
	private int[][] triangle;
	private int expectedResult;

	// Inject via constructor
	public HellsTriangleTest(int[][] triangle, int expectedResult) {
		this.triangle = triangle;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection trianglesData() {
		return Arrays.asList(new Object[][] {
				{ new int[][] { { 6 }, { 3, 5 } }, 11 }
			    , { new int[][] { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } }, 26 }
				, { new int[][] { { 4 }, { 9, 8 }, { 7, 1, 9 }, { 2, 4, 9, 9 } }, 30 }
				, { new int[][] { { 1 }, { 5, 6 }, { 8, 1, 4 }, { 2, 1, 2, 6 } }, 17 }
				, { new int[][] { { 5 }, { 3, 3 }, { 2, 0, 0 }, { 3, 8, 7, 0 }, { 0, 3, 0, 2, 3 } }, 21 } 
		});
	}

//	@Test
//	public void testSumTriangleImpl() {
//		int result =  new HellsTriangleImpl(triangle).sum();
//		assertTrue(String.format("Got %d, when %d was expected", result, expectedResult), result == expectedResult);
//	}
	
	@Test
	public void testSumTriangleImpl2() {
		int result =  new HellsTriangleImpl2(triangle).sum();
		assertTrue(String.format("Got %d, when %d was expected", result, expectedResult), result == expectedResult);
	}

}
