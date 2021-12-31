import java.util.Arrays;

public class ArrSum {
	
	public static int[] toPower(Integer size, Integer power) {
		int[] mainArr =  new int[size]; 
		for (int i = 0; i < mainArr.length; i++) {
			double value = Math.pow(i, power);
			mainArr[i] = (int)value;
		}
		return mainArr;
	}
	
	public static void main(String[] args) {
		
//		Write a program to sum all the values of a given Array in Java.
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);
        System.out.println(Arrays.toString(toPower(4, 2)));
		
	}
}
