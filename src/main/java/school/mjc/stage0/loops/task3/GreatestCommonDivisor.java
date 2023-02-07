package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gmd =0;
        if(first>second){
            for(int i=1; i<=first; i++){
                if(first % i == 0 && second %i == 0 )
                    gmd =i;
            }
        }
        else{
            for (int j=1; j<=second; j++){
                if(first % j == 0 && second %j == 0 )
                    gmd =j;
            }
        }
        System.out.println(gmd);
    }
}
