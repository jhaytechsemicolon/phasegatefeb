import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GreatestCommonDivisorTest{

	@Test
	public void testThatLargestCorrectValue(){
		Largest myLargest = new Largest();
		int [] sortedArray = myLargest.sortedArray(37,12,23,45)
		assertEquals(45,37,23,12)
