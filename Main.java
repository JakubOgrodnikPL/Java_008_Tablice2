import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 5, 7 ,2, -1, -8, 2, 1, 5, 4};

        int desired_index = 3;
        int desired_value = 9;

        System.out.println("Array: " + Arrays.toString(myArray));

        for (int i = myArray.length - 1 ; i > desired_index; i--){
            myArray[i]=myArray[i-1];
        }
        System.out.println("Array during calculation: " + Arrays.toString(myArray));
        myArray[desired_index]=desired_value;
        System.out.println("Array: " + Arrays.toString(myArray));
    }
}