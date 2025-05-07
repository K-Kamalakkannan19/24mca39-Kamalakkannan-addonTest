
public class PerfectNumbersRange {

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int num = 1; num <= 1000; num++) {
            if (isPerfect(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
