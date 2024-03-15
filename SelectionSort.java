import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int aux, smallestPosition, arraySize;
        int[] numbers;
        Scanner input = new Scanner(System.in);

        System.out.println("Insert the Array Size:");
        arraySize = Integer.parseInt(
            input.nextLine()  
        );

        numbers = new int[arraySize];

        System.out.println("Insert the desordered values:");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(
                input.nextLine()
            );
        }
        for(int i = 0; i < numbers.length - 1; i++){
            smallestPosition = i; 
            for(int j = i + 1; j < numbers.length; j ++){
                if(numbers[j] < numbers[smallestPosition]){
                    smallestPosition = j;
                }                
            }
            aux = numbers[i];
            numbers[i] = numbers[smallestPosition];
            numbers[smallestPosition] = aux;
        }
        System.out.println("Ok, so the ordered (by Selection Sort) values are:");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        input.close();
    }
}