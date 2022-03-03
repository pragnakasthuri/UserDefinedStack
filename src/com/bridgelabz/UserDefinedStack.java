package com.bridgelabz;

/**
 * Ability to create a user defined stack using user defined linked list
 * @param <T>
 */
public class UserDefinedStack<T> {
    private final UserDefinedLinkedList myLinkedList;

    public UserDefinedStack() {
        myLinkedList = new UserDefinedLinkedList();
    }

    /**
     * this method is to push elements into Stack which will be using
     * existing add method on user defined linked list
     * @param node
     */
    public void push(Node node) {
        myLinkedList.add(node);
    }

    /**
     * this method will return the head or top element in stack
     * @return
     */
    public Node peak() {
        return myLinkedList.getHead();
    }

    /**
     * this method will delete or remove the top element from stack
     */
    public void pop() {
        myLinkedList.pop();
    }

    /**
     * Driver program to operate on stack
     * @param args
     */
    public static void main(String[] args) {
        /**
         * creating an object for userdefined stack
         */
        UserDefinedStack<Integer> myStack = new UserDefinedStack<>();

        /**
         * adding 3 elements to stack
         */
        myStack.push(new Node<Integer>(70));
        myStack.push(new Node<Integer>(30));
        myStack.push(new Node<Integer>(56));

        /**
         * printing the stack using display method
         */
        myStack.myLinkedList.display();

        /**
         * printing the peak element in stack
         */
        System.out.println("Peak element is: "+myStack.peak().getData());

        /**
         * doing pop operation on stack
         */
        myStack.pop();

        /**
         * display the stack after pop operation
         */
        myStack.myLinkedList.display();
    }
}
