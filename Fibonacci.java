/*Student: Yauheniya Zapryvaryna
 * Instructor: Bill Iverson
 * CS 211
 * Bellevue College
 * May, 6, 2014
 * 
 * Assignment #8: The recursive fibFast() was written to speed up the calculation of the 45th 
 * Fibonacci number.
 */
public class Fibonacci {
 
    public static void main(String[] args) {
        int test = 45;
        System.out.println(fibFast(test)); // a fast recursive version
       // System.out.println(fibonacci(test)); // slow version in text   
    }
    
    //Slow Fibonacci calculation given in textbook BJP
    /*public static int fibonacci (int n){
    	if (n<=2){
    		return 1;
    	} else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }*/
    /*************FAST METHOD***********/
    //client method: we know that first and second Fibonacci numbers are zero and 1,
    //so we can then start from second number - count 44th
    public static int fibFast(int n) {
        return fibFast(0, 1, n-1); 
    }
    
    //helper method
    private static int fibFast(int prevNumber, int currentNumber, int n) {
    	//base case
    	if(n == 0) {
    		return currentNumber; //when count reaches zero, return the currentNumber
    	}
    	//recursive case
    	else { 
    		int temp = currentNumber+prevNumber; //storing the sum of the first 2 numbers
    		prevNumber = currentNumber; //previous takes the value of current
    		currentNumber = temp; //current is the sum of the previous two
    		return fibFast(prevNumber, currentNumber, n-1); //recursive call
    	}
    }
}