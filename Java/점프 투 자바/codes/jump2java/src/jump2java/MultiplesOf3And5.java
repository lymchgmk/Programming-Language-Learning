package jump2java;

public class MultiplesOf3And5 {
    int max;
    
    public MultiplesOf3And5(int max) {
        this.max = max;
    }

    public int sumOf3And5() {
        int sum = 0;
        for(int i=0; i<max; i++) {
            if(i%3==0 || i%5==0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int startNum = 10;
        int endNum = 1000;
        System.out.println(new MultiplesOf3And5(startNum));
        System.out.println(new MultiplesOf3And5(endNum));
    }
}