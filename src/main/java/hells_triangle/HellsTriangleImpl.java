package hells_triangle;

/**
 * @deprecated Use HellsTriangleImpl2 which is cheaper and faster
 * @author Carlos Lira
 *
 */
@Deprecated
public class HellsTriangleImpl {

	private final Node tree;

	public HellsTriangleImpl(int[][] triangle) {
		tree = buildNode(null, 0, 0, triangle);
	}

	private Node buildNode(Node parent, int height, int index, int[][] triangle) {
		Node node = new Node(parent, triangle[height][index], index, height);

		if (height < triangle.length - 1) {
			node.setLeft(buildNode(node, height + 1, index, triangle));
			node.setRight(buildNode(node, height + 1, index + 1, triangle));
		}
		return node;
	}

	public int sum() {
		return sum(tree, 0);
	}

	private int sum(Node node, int sum) {
		if (node.isLeaf()) {
			int result = sum + node.getData();
			// System.out.println(node.getPath() + " = " + result);
			return result;
		}

		int leftPath = sum(node.getLeft(), sum + node.getData());
		int rightPath = sum(node.getRight(), sum + node.getData());

		if (leftPath >= rightPath) {
			return leftPath;
		} else {
			return rightPath;
		}
	}

	public Node getTree() {
		return tree;
	}
}
