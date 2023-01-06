package queueOperation;

import org.w3c.dom.Node;

import java.util.Scanner;

public class Queue1 {
    class node {
        int data;
        node nextNode;

        public node(int data) {
            this.data = data;
            this.nextNode = null;

        }
    }

    public node Top = null;
    public node Bottom = null;

    public void Enqueue(Scanner sc) {
        System.out.println("Enter data");
        int data = sc.nextInt();
        node node1 = new node(data);
        if (Top == null) {
            Top = node1;
            Bottom = node1;
        } else {
            Bottom.nextNode = node1;
            Bottom = node1;
        }
    }

    public void Dequeue() {
        if (Top == null) {
            System.out.println("Underflow");
        } else {
            Top = Top.nextNode;
        }
    }

    public void display() {
        node temp = Top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
    }

    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        Queue1 q1 = new Queue1();

        int i;
        do {
            System.out.println("Enter 1 To Enqueue");
            System.out.println("Enter 2 To Dequeue");
            System.out.println("Enter 3 to Display");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1: {
                    q1.Enqueue(sc);
                    break;
                }
                case 2: {
                    q1.Dequeue();
                    break;
                }
                case 3:
                    q1.display();
                    break;
            }
            System.out.println("Enter 0 to go back to the main menu");
            System.out.println("Enter any key to exit");

            i = sc.nextInt();
        } while (i == 0);
        System.out.println("Exit Successfully");


    }
}
