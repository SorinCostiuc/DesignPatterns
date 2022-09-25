package recap.overrideAndOverload;

public class SumCalculator implements Calculator {

    @Override
    public Integer apply(int a, int b) {
        return a + b;
    }

    @Override
    public Integer apply(int a, int b, int c) {
        return a + b + c;
    }
}
