import java.util.Arrays;

public class Largest {

    public static int[] sortedArray(int[] array) {
    
      for (int i = 0; i < array.length - 1; i++) {
         int largest = i;
            
         for (int j = i + 1; j < array.length; j++) {
            if (array[j] > array[largest]) {
                largest = j;
                }
            }
            
       int temp = array[largest];
        array[largest] = array[i];
            array[i] = temp;
        }
        return array;
    }
    public static void main(String... args) {
        int[] num = {407, 50, 21, 51,};
           
       int[] sort = sortedArray(num) ;
	System.out.println(sort[0]+" "+sort[1]);

    }
}