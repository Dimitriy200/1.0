import java.io.PrintWriter;


public class MaksMinMiddleValue {
    public static void main(String[] args){

        PrintWriter prwr = new PrintWriter(System.out, true);
        long start = System.currentTimeMillis();
        task_01(100000000);
        long finish = System.currentTimeMillis();
        long overTime = finish - start;

        prwr.println("Time = " + overTime + " millisec");

    }
//____________________________________________________________________________________________________
    public static void task_01(int length){

        double min;
        double middle;
        double max;

        double[] arr = new double[length];
        PrintWriter prwr = new PrintWriter(System.out, true);

        arr[0] = Math.random();
        max = min = middle = arr[0];

        for(int i = 1; i < length; i++){
            arr[i] = Math.random();
            if(min > arr[i])
                min = arr[i];
            if(max < arr[i])
                max = arr[i];
            middle += arr[i];
        }
        middle /= length;

        //PrintMethod(arr);

        prwr.println("max = " + max);
        prwr.println("min = " + min);
        prwr.println("middle = " + middle);

    }
//____________________________________________________________________________________________________
    public static void PrintMethod(double[] arr){
        PrintWriter prwr = new PrintWriter(System.out, true);
        for(double i : arr)
            prwr.println(i);
    }
}
