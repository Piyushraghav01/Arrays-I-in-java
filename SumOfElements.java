import java.util.Scanner;

class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("Sum of all the elements of the Array is: " + sum);
        sc.close();

    }

}
