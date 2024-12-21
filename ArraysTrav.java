import java.util.Scanner;

class ArraysTrav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter the value at " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        for(int i:arr){
        System.out.print(i+" ");
        }

    }

}
