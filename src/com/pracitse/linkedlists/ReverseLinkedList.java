package com.pracitse.linkedlists;
public class ReverseLinkedList {

	static class LinkedListNode {
		int val;
		LinkedListNode next;

		public LinkedListNode(int val) {
			this.val = val;
		}
	}

	public static LinkedListNode reverse_iterative(LinkedListNode head) {
		// no need to reverse if head is null
		// or there is only 1 node.
		if (head == null || head.next == null) {
			return head;
		}

		LinkedListNode list_to_do = head.next;
		LinkedListNode reversed_list = head;

		reversed_list.next = null;

		while (list_to_do != null) {
			LinkedListNode temp = list_to_do;
			list_to_do = list_to_do.next;

			temp.next = reversed_list;
			reversed_list = temp;
		}

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

		list_head = reverse_iterative(list_head);
		System.out.print("After Reverse (Iterative):");
		display(list_head);
	}
}
