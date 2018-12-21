/*   To rotate(ar[], d, n) that rotates arr[] of size n by d elements.
        Enter array size
        7
        Enter array element
        1 2 3 4 5 6 7
        Value of rotation index
        2
        3 4 5 6 7 1 2
*/



import java.util.Scanner;

class ArrayRotation {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Value of rotation index");
        int d = sc.nextInt();

        rotateArray(arr, d, size);

    }

    static void rotateArray(int arr[], int d, int size) {
        int temp;
        for (int i = 0; i < d; i++) {
            temp = arr[0];
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[size - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}