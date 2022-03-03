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
     * this method is to remove the first element in queue using pop method on linked list
     */
    public void dequeue() {
        myLinkedList.pop();
    }

    /**
     * Driver program to operate on queue
     * @param args
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE
         * 1.creating an object for user defined queue
         * 2.adding 3 elements to queue
         * 3.printing the queue using display method
         * 4.operating dequeue on the user defined queue
         * 5.display the elements in queue
         */
        
        /**
         * 1.creating an object for user defined queue
         */
        UserDefinedQueue<Integer> myQueue = new UserDefinedQueue<>();

        /**
         * 2.adding 3 elements to queue
         */
        myQueue.enqueue(new Node<Integer>(56));
        myQueue.enqueue(new Node<Integer>(30));
        myQueue.enqueue(new Node<Integer>(70));

        /**
         * 3.printing the queue using display method
         */
        myQueue.myLinkedList.display();

        /**
         * 4.operating dequeue on the user defined queue
         */
        myQueue.dequeue();

        /**
         * 5.display the elements in queue
         */
        myQueue.myLinkedList.display();

    }
}
