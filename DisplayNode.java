

import java.util.Scanner;

class DisplayNode {
    public static void main(String[] ar) {
       
       

		LinkedNode newNode = new LinkedNode();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			int x = sc.nextInt();
			newNode.head = new Node(x);
		}
		
		Node tempNode = newNode.head;
		
		for (int i = 1; i < num; i++) {
			int x = sc.nextInt();
			Node nNode = new Node(x);
			tempNode.next = nNode;
			tempNode = tempNode.next;
		}
		
	
		tempNode = newNode.head;
		while (tempNode != null) {
			String s = (tempNode.next != null)?" -> " : "";
			System.out.print(tempNode.data + s);
			tempNode = tempNode.next;
		}
		
		sc.close();
       
       
    }
}