import java.util.Arrays;
public class Largest{
public static int[] descending(int [] array){
      for (int i = 0; i < array.length - 1; i++) {
         //int largest = i ;
            
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
public static void main(String...args){
int [] number = {1,2,3,4,5};
System.out.println(Arrays.toString(descending(number)));

}
}