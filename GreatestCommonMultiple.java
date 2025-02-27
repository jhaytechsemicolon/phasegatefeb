public class GreatestCommonMultiple{
		public static int factor(int numberOne, int numberTwo) {
       int god = 0;
       
		for (int count = 0; count < numberOne && count < numberTwo; count++){
			if(numberOne % count == 0 && numberTwo % count == 0){

			god = count;
     }
  }
		return god;


}








 
  public static void main(String[] args) {
        System.out.println(factor(6,10));  
   

  }
}