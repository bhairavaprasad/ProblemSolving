public class RecursiveReverseLinkedList {
	static class LinkedListNode {
		int val;
		LinkedListNode next;

		public LinkedListNode(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return Integer.toString(this.val);
		}
	}

	public static LinkedListNode reverse_recursive(LinkedListNode head) {
		// no need to reverse if head is
		// null or there is only 1 node.
		if (head == null || head.next == null) {
			return head;
		}

		LinkedListNode reversed_list = reverse_recursive(head.next);

		head.next.next = head;
		head.next = null;
		return reversed_list;
	}

	private static void display(LinkedListNode node) {
		while (node != null) {
			System.out.print(node);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedListNode list_head = null;
		list_head = new LinkedListNode(1);
		list_head.next = new LinkedListNode(2);
		list_head.next.next = new LinkedListNode(3);
		list_head.next.next.next = new LinkedListNode(4);
		list_head.next.next.next.next = new LinkedListNode(5);
		list_head.next.next.next.next.next = new LinkedListNode(6);

		System.out.print("Original: ");
		display(list_head);

		list_head = reverse_recursive(list_head);
		System.out.print(" After Reverse (Recursive):");
		display(list_head);
	}

}
