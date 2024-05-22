package day3;

public class OddTest {
    public boolean isOdd(int num) {
        if (num % 2 == 1) {
            return true;
        } else return false;
    }
    public boolean hasEight(int num){
        num = Math.abs(num);
        String numString = String.valueOf(num);
        if(numString.contains("8")){
            return true;
        } else return false;
    }
}
