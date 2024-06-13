import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger ja = BigInteger.ONE;
        for (int i = balls; i > share ; i--) {
            ja = ja.multiply(BigInteger.valueOf(i));
        }
        BigInteger mo = BigInteger.ONE;
        for (int i = balls-share; i >1 ; i--) {
            mo = mo.multiply(BigInteger.valueOf(i));
        }
        return ja.divide(mo);
    }
}