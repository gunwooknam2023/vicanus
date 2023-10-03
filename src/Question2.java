
public class Question2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(4).add(5).subtract(3).out();
        System.out.println(result);
    }
}
class Calculator {
    private int result;

    // 덧셈
    public Calculator add(int num) {
        this.result += num;
        return this;
    }

    // 뺄셈
    public Calculator subtract(int num) {
        this.result -= num;
        return this;
    }

    // 종료
    public int out() {
        return this.result;
    }
}


