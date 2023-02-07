package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0, sum2 = 0;
        for (int i=0; i<lengthOfLastNumber; i++){
            sum += sum2*10+9;
            sum2 = sum2*10+9;
        }
        System.out.println(sum);
    }
}
