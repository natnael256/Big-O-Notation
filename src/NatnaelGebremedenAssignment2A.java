public class NatnaelGebremedenAssignment2A {
    public static void main(String[] args) {
        // testing methods
        System.out.println(method1(5));
        System.out.println(method1(-4));
        System.out.println(method2(5));
        System.out.println(method2(-4));
        System.out.println(method3(5));
        System.out.println(method3(-4));
    }
    /**
     *
     * @param N accept a integer
     * @return  Using recursion it returns the sum of squares if N is a positive number
     */
    public static int method1(int N){
    // If N is not a positive integer, return 0
        if (N < 0){
            return 0;
        }else{
            // Recursive call
            return N * N + method1(N - 1);
        }

    }

    /**
     *
     * @param N accept a integer
     * @return   Using a loop it returns the sum of squares  if N is a positive number
     */
    public static int method2(int N){
        // If N is not a positive integer, return 0
        if (N <= 0) {
            return 0;
        }
        int sum = 0;
    // Method 2: Using a loop
        for (int i = 1; i <= N; i++) {
            sum += i * i;
        }
        return sum;
    }
    /**
     *
     * @param N accept a integer
     * @return Using the mathematical returns the sum of squares  if N is a positive number
     */
    public static int method3(int N){
        // If N is not a positive integer, return 0.
        if (N < 0){
            return 0;
        }
        else{
            // Mathematical formula for sum of squares
            return N * (N+ 1) * (2 * N + 1) / 6;
        }

    }
}