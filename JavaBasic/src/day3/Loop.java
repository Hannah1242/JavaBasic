package day3;

public class Loop {
    public void printArray(){
        byte a[] = new byte[]{1,3,5,8,9};
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
}
