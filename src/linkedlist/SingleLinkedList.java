package linkedlist;

public class SingleLinkedList {

	private static LinkedListNode head;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		add("10");
		add("20");
		add("30");
		add("40");
		add("50");
		add("60");
		add("70",1);
		displayContent();
		size();
	}
	
	public static void add(String data) {
		if(head==null) {
			head = new LinkedListNode(data);
		}else {
			LinkedListNode current = head;
			while (current.getNode()!=null) {
				current = current.getNode();
			}
			current.setNode(new LinkedListNode(data));				
		}		
	}
	
	
	public static void add(String data, int location) {
		if((size()+1)<=location) {
			System.out.println("Cannot Add element");
		}else {
			int i = 1;
			LinkedListNode current = head;
			while (i<location) {
				i++;
				current = current.getNode();
			}
			LinkedListNode temp= current.getNode();
			current.setNode(new LinkedListNode(data,temp));			
		}
	}
	
	public static void displayContent() {
		LinkedListNode current = head;
		while(current!=null) {
			System.out.println("Data :- "+ current.data);
			current = current.getNode();
		}
	}
	
	public static int size() {
		LinkedListNode current = head;
		int i = 1;
		while(current!=null) {
			i++;
			current = current.getNode();
		}
		System.out.println("Size of Linked List : "+ i);
		return i;
	}

}
