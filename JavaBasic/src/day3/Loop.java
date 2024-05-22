package day3;

public class Loop {
    public void printArray(){
        byte[] a = new byte[]{1,3,5,8,9};
        for(int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void sumAndAverage(){
        int sum = 0;
        for (int i = 1; i <=100; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " +sum);
        float average = (float)sum/100;
        System.out.println("The average is " +average);
    }
    public void printSquareBoard(){
        String [][] a = new String [5][5];
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j<a[0].length;j++){
                a[i][j]="#";
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void SumAndAverageEx2(){
        int sum = 0;
        int count = 0;
        for(int i = 111; i <= 8899; i++){
            sum = sum + i;
            count ++;
        }
        System.out.println("The sum is "  + sum);
        Double average = (double)sum/(double) count;
        System.out.println("The average is " +  Math.round(average*100.0)/100.0);
    }
    public void SumAndAverageEx3(){
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                sum = sum + i;
                count++;
            }
        }
        System.out.println("The sum is " +sum);
        Double average = (double)sum/(double) count;
        System.out.println("The average is " +  Math.round(average*100.0)/100.0);
    }
    public void SumAndAverageEx4(){
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum = sum + i;
                count++;
            }
        }
        System.out.println("The sum is " +sum);
        Double average = (double)sum/(double) count;
        System.out.println("The average is " +  Math.round(average*100.0)/100.0);

    }
    public void SumAndAverageEx5(){
        int sum = 1;
        for(int i = 1; i <= 100; i++){
            sum += i * i;
        }
        System.out.println("The sum is " +sum);
    }
    public void SumAndAverageEx6(){
        int n = 50000;

    }
    public void SumAndAverageEx7() {
        int n = 7; // Size of the checkerboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

