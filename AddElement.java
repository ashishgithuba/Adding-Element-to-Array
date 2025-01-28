import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
      
        int[] array = {1, 2, 3, 4, 5};

    
        int newElement = 6;

        int[] newArray = new int[array.length + 1];

      
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

       
        newArray[array.length] = newElement;

      
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
