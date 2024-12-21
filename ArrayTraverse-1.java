/** Traversing an Array */

class ArrayTraverse {
    public static void main(String[] args) {
        //int arr[] = new int[5];

        int arr[] = {1,2,3,4,5,9,15,20,43,27,06,12,34};
        System.out.println(arr.length);

        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }

        for(int i:arr){
            System.out.print(i+ " ");

        }
           
    }
    
}
