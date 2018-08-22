package com.practise.bitwise;

public class NumberOfBitsSet {

	public int countNumberOfBitsSet(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		NumberOfBitsSet numberOfBitsSet = new NumberOfBitsSet();
		System.out.println(numberOfBitsSet.countNumberOfBitsSet(5));
	}
}
