
public class LinkedList {
	Node first;
	Node last;

	public LinkedList() {
		first = null;
		last = null;
	}

	public void addAtEnd(int num) {
		Node fresh = new Node(num);

		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}

	public void addAtBeginning(int num) {
		Node fresh = new Node(num);

		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			fresh.next = first;
			first = fresh;
		}
	}

	public void takeFromEnd() {
		if (first != null) {
			if (first == last) {
				first = null;
				last = null;
			} else {
				Node current = first;
				while (current.next != last) {
					current = current.next;
				}
				last = current;
				last.next = null;
			}
		}
	}

	public void takeFromBeginning() {
		if (first != null) {
			if (first == last) {
				first = null;
				last = null;
			} else {
				first = first.next;
			}
		}
	}

	public void Show() {
		Node current = first;
		while (current != null) {
			System.out.print(current.num + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void search() {

	}

	public void getSize() {

	}

	public void Empty() {

	}
}
