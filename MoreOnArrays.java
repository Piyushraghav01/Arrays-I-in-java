class MoreOnArrays {
    public static void main(String[] args) {
        // int a[] = new int[5];
        // byte b[] = new byte[5];
        // short s[] = new short[5];
        // float f[] = new float[5];
        // double d[] = new double[5];
        // boolean bl[] = new boolean[5];
        // char c[] = new char[5];
        // String str[] = new String[5];

        // System.out.println("Default int: "+a[0]);
        // System.out.println("Default byte: "+b[0]);
        // System.out.println("Default short: "+s[0]);
        // System.out.println("Default float: "+f[0]);
        // System.out.println("Default double: "+d[0]);
        // System.out.println("Default boolean: "+bl[0]);
        // System.out.println("Default char: "+c[0]);
        // System.out.println("Default String: "+str[0]);

        int num = 10;
        int num2 = num;
        num2++;
        System.out.println(num);
        System.out.println(num2);

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = arr1;
        int arr3[] = new int[4];
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);

        arr2[3] = 6457;

        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }

}
