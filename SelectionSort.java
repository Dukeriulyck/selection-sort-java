import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        int aux, smallestPosition;

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
        System.out.println("Ordered values:");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        input.close();
    }
}
