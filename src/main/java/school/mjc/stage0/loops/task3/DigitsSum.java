package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        String length = t + "";
        for (int i = 0; i < length.length(); i++) {
            sum += Math.abs(t % 10);
            t= t / 10;
        }
        System.out.println(sum);
    }
}
