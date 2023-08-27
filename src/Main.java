import java.util.Random;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int[]arr = new int[50];
        int positive = 0, negative = 0, zero = 0, positiveSum = 0, negativeSum = 0, arithmeticMean = 0, sum = 0;

        Random rand = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(101) - 50;

            if(arr[i] > 0){
                positive++;
                positiveSum += arr[i];
            }
            else if(arr[i] < 0){
                negative++;
                negativeSum += arr[i];
            }
            else
                zero++;

            sum += arr[i];
            arithmeticMean = sum / arr.length;
        }
        System.out.println("Кол-во положительных значений: " + positive);
        System.out.println("Кол-во отрицательных значений: " + negative);
        System.out.println("Кол-во нулевых значений: " + zero);
        System.out.println("Сумма всех положительных значений: " + positiveSum);
        System.out.println("Сумма всех отрицательных значений: " + negativeSum);
        System.out.println("Среднее арифметическое значение массива: " + arithmeticMean);

    }
}