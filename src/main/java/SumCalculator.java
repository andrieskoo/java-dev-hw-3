import java.util.Objects;

public class SumCalculator {
    public int sum(int n){
        if (n == 0){
            throw new IllegalArgumentException("Parameter must be more than 0");
        }
        int sum = 0;
        for(int i=0; i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
