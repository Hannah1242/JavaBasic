package day2;

public class DecisionMaking {
    //ex1
    public void checkNum(int n) {
        if(n%2 == 0){
            System.out.println("n là số chẵn");
        }
        System.out.println("n không phải số chẵn");
    }
    public void checkOddEven(int n){
        if((n%2 == 1) || (n%2 == 0) && (n >= 6 && n <= 20)){
            System.out.println("Weird");
        }
        if((n%2 == 0) && (n >=2 && n <=5) || (n > 20)){
            System.out.println("Not Weird");
        }
    }
}
