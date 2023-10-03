//해결하지 못했습니다

public class Question4 {
    public static void main(String[] args) {
        long result = factorial(1000000);
        System.out.println(result);
    }

    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

//해결하지 못했습니다