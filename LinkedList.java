package arrayList;

public class LinkedList {

	private Node head;

	public int size() {
		int n = 0;
		Node current = this.head;
		while (current != null) {
			n++;
			current = current.next;
		}
		return n;
	}

	public Object get(int idx) {
		if (idx < 0) {
			throw new IndexOutOfBoundsException();
		}
		int n = 0;
		Node current = this.head;
		while (current != null) {
			if (n == idx) {
				return current.val;
			}
			n++;
			current = current.next;
		}
		throw new IndexOutOfBoundsException();
	}

	public void set(int idx, Object o) {
		if (idx < 0) {
			throw new IndexOutOfBoundsException();
		}
		int n = 0;
		Node current = this.head;
		while (current != null) {
			if (n == idx) {
				current.val = o;
				return;
			}
			n++;
			current = current.next;
		}
		throw new IndexOutOfBoundsException();
	}

	public int append(Object o) {
		if (this.head == null) {
			this.head = new Node();
			this.head.val = o;
			return 1;
		}
		int n = 1;
		Node current = this.head;
		Node prev = null;
		while (current != null) {
			n++;
			prev = current;
			current = current.next;
		}
		prev.next = new Node();
		prev.next.val = o;
		return n;
	}

	public void insert(int idx, Object o) {
		Node insertNode = new Node();
		
		if (idx == 0){
			//inserting new head to list
			insertNode.next = this.head;
			this.head= insertNode;
			this.head.val = o;
			return;
		}
		
		Node current = this.head;
		int n = 0;
		while (current != null){
			if (n == idx-1){
				insertNode.next = current.next;
				current.next=insertNode;
				insertNode.val = o;
				return;
			}
			n++;		
			
		}
		
	}	
		
	
	
	public void remove(int idx) {

		if (idx == 0){
			//removing head from list
			this.head= this.head.next;
			return;
		}
		
		Node current = this.head;
		int n = 0;
		while (current != null){
			if (n == idx-1){
				current.next=current.next.next;
				return;
			}
			current = current.next;
			n++;		
			
		}
		
	}	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append("hi");
		list.append("yo");
		list.append("bye");
		list.set(1, "au revoir");
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		list.insert(0,"my insert");
		System.out.println("Index 0 value " + list.get(0));
		System.out.println("Index 1 value " + list.get(1));
		System.out.println("Index 2 value " + list.get(2));
		System.out.println("Removing index 2 value " );
		list.remove(2);
		System.out.println("Index 0 value " + list.get(0));
		System.out.println("Index 1 value " + list.get(1));
		System.out.println("Index 2 value " + list.get(2));
	}

	class Node {
		public Object val;
		public Node next;
	}
}
