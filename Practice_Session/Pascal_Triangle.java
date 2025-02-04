package Practice_Session;

public class Pascal_Triangle {
    public static void main(String[] args) {
        //14.number Pascal triangle
        //   a. print the nth row rth column's value - (n-1)C(r-1)
        //   b. print whole nth row -
        //      ans = 1;
        //      ans*(n-c)/c
        //   c. print the whole triangle

        int n = 7;
        int r = 4;
        //    System.out.println(nCr(n - 1, r - 1));
        //  nthRow2(n);
        trianglePrint(n);

    }

    // nth row and rth row column
//    public static int nCr(int n, int r) {
//        int ans = 1;
//        for (int i = 0; i < r; i++) {
//            ans = ans * (n - 1) / (i + 1);
//        }
//        return ans;
//    }

    // rth row method 1
//    private static void nthRow(int n) {
//        for (int i = 1; i <= n; i++) {
//            System.out.println(nCr(n - 1, i - 1) + " ");
//        }
//    }

    //rth row method 2
    private static void nthRow2(int n) {
        int ans = 1;
        System.out.println(1 + " ");
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i) / i;
            System.out.print(ans + " ");
        }
    }

    private static void trianglePrint(int n) {
        for (int i = 1; i < n; i++) {
            nthRow2(i);
            System.out.println();
        }
    }

}
