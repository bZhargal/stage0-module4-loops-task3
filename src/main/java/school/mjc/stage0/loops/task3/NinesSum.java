package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int tenPow = 1;
        int result = 0;

        for (int i = 1; i <= lengthOfLastNumber; ++i) {
            tenPow *= 10;
            result = result + tenPow - 1;
        }
        System.out.println(result);
    }
}
