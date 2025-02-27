import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class LargestTest{

	@Test
	public void testThatLargestCorrectValue(){
		Largest myLargest = new Largest();
		int [] sortArray = myLargest.sortedArray({37,12,23,45});
		assertEquals(new int[]{45,37,23,12},sortArray);
 }
}