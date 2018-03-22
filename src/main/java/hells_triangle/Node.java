package hells_triangle;

import java.util.Objects;

@Deprecated
public class Node {
	

	private Node parent;
	private int data;
	private int index;
	private int height;
	private Node right;
	private Node left;

	public Node(Node parent, int data) {
		super();
		this.parent = parent;
		this.data = data;

	}

	public Node(Node parent, int data, int index, int height) {
		super();
		this.parent = parent;
		this.data = data;
		this.index = index;
		this.height = height;

	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public int getData() {
		return data;
	}

	public Node getParent() {
		return parent;
	}

	public boolean isLeaf() {
		return right == null && left == null;
	}

	public String getPath() {
		if (parent == null) {
			return "" + getData();
		}
		return parent.getPath() + " - " + getData();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(data);
		if (left != null) {
			// builder.append("{ ");
			builder.append(left.toString());
			// builder.append(" } ");
		}
		if (right != null) {

			// builder.append("{ ");
			builder.append(right.toString());
			// builder.append(" } ");
		}

		return builder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Node) {
			Node other = (Node) obj;
			return other.height == this.height && other.index == this.index;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(index, height);
	}
}
