package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int second=1, first=0;
        for(int i =0; i<lastFibonacci; i++){
            System.out.println(first);
            second = second+first;
            first = second - first;
        }
    }
}
