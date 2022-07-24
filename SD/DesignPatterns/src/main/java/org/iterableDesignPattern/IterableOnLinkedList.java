package org.iterableDesignPattern;

import java.util.*;

public class IterableOnLinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList implements Iterable {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if(size == 0){
                tail = temp;
            }

            size++;
        }

        public void removeLast(){
            // write your code here
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                head=tail=null;
                size--;
            }else{
                Node ptr=head;
                while(ptr.next!=tail){
                    ptr=ptr.next;
                }

                ptr.next=null;
                tail=ptr;
                size--;
            }
        }

        public Iterator iterator() {
            return new LinkedListIterator(head);
        }
        static class LinkedListIterator implements Iterator{
        Node temp;
        LinkedListIterator(Node head){
        this.temp=head;
        }
        public boolean hasNext() {
            if(temp==null){
                return false;
            }else{
                return true;
                }
        }

        public Integer next() {
            Node node=temp;
            temp=temp.next;
            return node.data;
        }
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() +" ");
        }

    }
}