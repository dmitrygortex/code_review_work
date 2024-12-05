public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("zero division");
        }
        return a / b;
    }

    public int fact(int n) {
        int res = 1;
        for (int i = 1; i < n + 1; i++) {
            res *= i;
        }
        return res;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        // (5 + 5) * (11 - 1) / 25 + ((5 + 5) * (11 - 1))!
        int step1 = add(5, 5);
        int step2 = dif(11, 1);
        int step3 = times(step1, step2);
        return div(step3, 25) + fact(step3);
    }
}
