package com.java.dsa.linkedlist;

public class LinkedListOperation {

    public Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public Node reverseLinkedListRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverseLinkedListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public Node addNodeAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public Node addNodeAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node addNodeAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public Node deleteNodeAtBeginning(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    public Node deleteNodeAtEnd(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
