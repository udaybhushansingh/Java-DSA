import java.math.BigDecimal ;
import java.math.BigInteger;

public class BigDecimal_BigInteger {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        BigDecimal result1 = a.add(b);

        System.out.println(result1);

        BigInteger result = BigInteger.ONE;

        for (int i = 1 ; i <= 100 ; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}

