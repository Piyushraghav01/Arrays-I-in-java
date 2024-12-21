class Max {
    public static void main(String[] args) {
        int A[] = { 12, 43, 9, 56, 74, 10, 3, 18 };
        int max = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Greatest value in the Array is: " + max);
    }

}
