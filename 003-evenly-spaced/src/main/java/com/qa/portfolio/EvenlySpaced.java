package com.qa.portfolio;

import java.util.Arrays;

import com.qa.connecting.Ims;

public class EvenlySpaced {
	/**
	 * Returns true if the three values are evenly spaced <br>
	 * Works with any order
	 * 
	 * @param num1 integer value
	 * @param num2 integer value
	 * @param num3 integer value
	 * @return boolean value for if the 3 values entered are evenly spaced
	 */
	public static boolean evenlySpaced(int num1, int num2, int num3) {

		int nums[] = {num1, num2, num3};
		
	
		Arrays.sort(nums);
		System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
		
		if (nums[1]-nums[0]==nums[2]-nums[1]) {
			System.out.println("true");
			return true;
			
		}
		System.out.println("false");
		return false;
	}
}


