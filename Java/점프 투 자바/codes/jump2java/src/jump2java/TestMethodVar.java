package jump2java;

public class TestMethodVar {
    public void vartest(int a) {
        a++;
    }

    public static void main(String[] args) {
        int a = 1;
        TestMethodVar myTest = new TestMethodVar();
        myTest.vartest(a);
        System.out.println(a);
    }
}
