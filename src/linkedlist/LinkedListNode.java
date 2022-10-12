package linkedlist;

public class LinkedListNode {

	String data;
	LinkedListNode node;

	public LinkedListNode(String data) {
		this.data =  data;
	}
	
	public LinkedListNode(String data, LinkedListNode node) {
		this.data =  data;
		this.node =  node;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public LinkedListNode getNode() {
		return node;
	}
	public void setNode(LinkedListNode node) {
		this.node = node;
	}
	
}
