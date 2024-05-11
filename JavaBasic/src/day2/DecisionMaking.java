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
//    public void tingTong(){
//        int tong;
//        if(n < 10){
//            tong = n;
//            System.out.println("Tổng các chữ số n =: " +tong);
//        }
//        else   if(n < 100 && n >= 10){
//            tong = n%10 +n/10;
//            System.out.println("Tổng các chữ số n = " +tong);
//        }
//        else   if(n >= 100 && n < 1000){
//            tong = (n/100) +( (n%100)/10) + (n%10);
//            System.out.println("Tổng các chữ số n = " +tong);
//        }
//    }
    public void convertMins(float n){
        if( n < 1440){
            System.out.println("0 year and 0 day");
        } else if (n >= 1440 && n < 525600){
            System.out.println(+n +" Minutes is approximately 0 year and " +Math.round(n/24/60) + " days");
        }
        else
        System.out.println(+n +" Minutes is approximately " +Math.round(n/24/60/365) + " year and " +Math.round(n/24/60 % 365) + " days");
    }
    public void printDayOfWeek(int n){
        switch (n){
            case 2:
                System.out.println("Hôm nay là thứ Hai.");
                break;
            case 3:
                System.out.println("Hôm nay là thứ Ba.");
                break;
            case 4:
                System.out.println("Hôm nay là thứ Tư.");
                break;
            case 5:
                System.out.println("Hôm nay là thứ Năm.");
                break;
            case 6:
                System.out.println("Hôm nay là thứ Sáu.");
                break;
            case 7:
                System.out.println("Hôm nay là thứ Bảy.");
                break;
            case 8:
                System.out.println("Hôm nay là chủ nhật");
                break;
            default:
                System.out.println("Nhập lại n ");
                break;
        }
    }
}
