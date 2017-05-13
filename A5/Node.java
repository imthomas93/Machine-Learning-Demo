package A5;

import java.util.*;

public class Node {
	
	private String attribute;
	private ArrayList<String> value;
	private Node parent;
	private ArrayList<Node> children;

	public Node(String attribute) {
		super();
		this.attribute = attribute;
		this.value = new ArrayList<>();
		this.children = new ArrayList<>();
		parent = null;
	}

	public String getAttribute() {
		return attribute;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public ArrayList<Node> getChildren() {
		return children;
	}

	public void addChild(Node node) {
		node.setParent(this);
		children.add(node);
	}

	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public void addValue(String value) {
		this.value.add(value);
	}

	public ArrayList<String> getValue() {
		return this.value;
	}
}
