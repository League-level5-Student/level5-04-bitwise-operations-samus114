package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 9;//any number inputed will be multiplied by two IF << is used 4 turns into 8
		int numShifted = num << 2;//10000
		System.out.println((byte)numShifted);
		numShifted = num >> 2;
		// 2. Print the value of numShifted, and convert that value to binary.
//		System.out.println(numShifted);
//		do {
//			int quotient = numShifted >>> 1;
//
//			if (numShifted % 2 != 0) {
//				binaryStr = '1' + binaryStr;
//			} else {
//				binaryStr = '0' + binaryStr;
//			}
//
//			numShifted = quotient;
//
//			// 3. Repeat until number is 0
//		} while (numShifted != 0);
//		System.out.println(binaryStr);
		
		
	}
	// 3. Compare the two binary values. Can you figure out what the << operator is
	// for?
		//<< can be used to shift the number lower (16 would go to 8, and 8 would go to 4, etc.)
	// 4. Try shifting num 3 places.

	// FYI: Binary values can be shifted to the right as well using the >> operator.
}

//4 (100) and 8 (1000)  \ these both are with "<< 1"
//5 (101) and 10 (1010) /

//8 (1000) and 32 (100000) \ these numbers are with "<< 2"
//9 (1001) and (100100)