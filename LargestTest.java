import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class LargestTest{

	@Test
	public void testThatLargestCorrectValue(){
		Largest myLargest = new Largest();
		int [] inputArray = {407, 50, 21, 51};
		int [] expectedArray = {407, 51,50,21};
		int [] sortedArray = myLargest.sortedArray(inputArray);
		assertArrayEquals(expectedArray,sortedArray);
 }
}