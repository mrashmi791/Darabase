/* An array elements of range 0 to n-1 
check the all elements are present or not 
if elements are not present there will be -1 present in the array.
*/


import java.util.Scanner;

class CheckElements {
    public static void main(String []ar) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

       // System.out.println("Enter array element");
        for (int i = 0; i < size; i++) {
            arr[i] = -1;
        }
       for(int i = 0; i < size; i++) {
           int n = sc.nextInt();
               if(n >= 0)  {
                  arr[n] = n; 
               }
           
       }
       System.out.println("Output will be");
       for(int x = 0 ; x < size; x++) {
          System.out.print(arr[x] + " ");
       }
       
    }
}