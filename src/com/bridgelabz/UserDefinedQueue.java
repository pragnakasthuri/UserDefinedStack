package com.bridgelabz;

/**
 * Ability to create a user defined Queue using user defined linked list
 * @param <T>
 */
public class UserDefinedQueue<T> {
    private final UserDefinedLinkedList myLinkedList;

    public UserDefinedQueue() {
        myLinkedList = new UserDefinedLinkedList();
    }

    /**
     * this method is to push elements into Queue which will be using
     * existing append method on user defined linked list
     * @param node
     */
    public void enqueue(Node node) {
        myLinkedList.append(node);
    }

    /**
     * Driver program to operate on queue
     * @param args
     */
    public static void main(String[] args) {
        /**
         * creating an object for userdefined queue
         */
        UserDefinedQueue<Integer> myStack = new UserDefinedQueue<>();

        /**
         * adding 3 elements to queue
         */
        myStack.enqueue(new Node<Integer>(56));
        myStack.enqueue(new Node<Integer>(30));
        myStack.enqueue(new Node<Integer>(70));

        /**
         * printing the queue using display method
         */
        myStack.myLinkedList.display();

    }
}
