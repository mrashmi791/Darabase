

/*
 
 Given an array of n elements. Our task is to write a program to rearrange the 
 array such that elements at even positions are greater than all elements before it and 
 elements at odd positions are less than all elements before it.

            Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
            Output : 4 5 3 6 2 7 1

 */



import java.util.Scanner;
public class ReArrangeEvenOddPosition {
	
	public static int[] sortArray(int arr[]) {
		int len = arr.length;
		
		for(int i = 0; i< len - 1;i++) {
			for(int j = 0; j < len - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		return arr;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements: ");
		int num = sc.nextInt();

		int arr[] = new int[num];
		int arr2[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			
		}

		arr = sortArray(arr);
		int cnt = 0;
		for(int i = 0; i < num/2 + 1; i++) {
			arr2[num - i - 1 - cnt] = arr[i];
			cnt++;
		}

		cnt = 0;
		for(int i = num - 1; i > num/2; i--) {
			arr2[i - 1 - cnt] = arr[i];
			cnt++;
		}
		
		System.out.print("Output will be: [");
		for (int x = 0; x < arr2.length; x++) {
			String s = (x < arr2.length - 1) ? ", " : "";
			System.out.print(arr2[x] + s);
		}
		System.out.print("]");

	}

}
