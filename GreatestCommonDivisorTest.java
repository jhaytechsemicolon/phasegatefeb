import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GreatestCommonDivisorTest{

	@Test
	public void testThatLargestCorrectValue(){
		GreatestCommonMultiple commonMultiple = new GreatestCommonMultiple();
		int number = commonMultiple.factor(6, 10);
		assertEquals(2,number);


	}
}
