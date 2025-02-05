package com.java.dsa.linkedlist;

public class TestLinkedListOperation {

    public static void main(String[] args) {
        LinkedListOperation linkedListOperation = new LinkedListOperation();
        Node head = null;
        head = linkedListOperation.addNodeAtEnd(head, 1);
        head = linkedListOperation.addNodeAtEnd(head, 2);
        head = linkedListOperation.addNodeAtEnd(head, 3);
        head = linkedListOperation.addNodeAtEnd(head, 4);
        head = linkedListOperation.addNodeAtEnd(head, 5);
        head = linkedListOperation.addNodeAtEnd(head, 6);
        head = linkedListOperation.addNodeAtEnd(head, 7);
        head = linkedListOperation.addNodeAtEnd(head, 8);
        head = linkedListOperation.addNodeAtEnd(head, 9);
        head = linkedListOperation.addNodeAtEnd(head, 10);
        System.out.println("Original Linked List:");
        linkedListOperation.printLinkedList(head);
        System.out.println();
        head = linkedListOperation.reverseLinkedList(head);
        System.out.println("Reversed Linked List:");
        linkedListOperation.printLinkedList(head);
        System.out.println();
        head = linkedListOperation.reverseLinkedListRecursive(head);
        System.out.println("Reversed Linked List using recursion:");
        linkedListOperation.printLinkedList(head);
    }
}
