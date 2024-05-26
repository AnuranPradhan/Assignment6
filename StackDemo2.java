package Assignment6;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class StackDemo2 {
	static Scanner sc = new Scanner(System.in);


    public static Node push(Node top) {
        System.out.println("Enter the element to be pushed");
        int x = sc.nextInt();
        Node newnode = new Node(x);
       if(top==null){
           top = newnode;
       }else {
    	   newnode.next = top;
           top = newnode;
       }
        return top;
    }

    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack Underflow");
        }else {
        	System.out.println("Element popped: " + top.data);
            top = top.next;
        }
        return top;
    }


    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Node top = null;
        while (true) {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
	}

}
