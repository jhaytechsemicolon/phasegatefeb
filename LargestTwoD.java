public class LargestTwoD {

    public static void main(String... args) {
        double[][] decimalValue = {
            {1.5, 2.3, 3.7, 4.6},  
            {5.1, 6.2, 7.3, 8.4},   
            {9.5, 10.1, 11.8, 12.7}
        };

        double max = decimalValue[0][0]; 
        for (int i = 0; i < decimalValue.length; i++) { 
            for (int j = 0; j < decimalValue[i].length; j++) { 
                if (decimalValue[i][j] > max) {
                    max = decimalValue[i][j]; 
                }
            }
        }

      
        System.out.println("The largest number in the entire array is: " + max);
    }
}