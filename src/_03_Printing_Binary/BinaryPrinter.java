package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		
		// Shift b seven bits to the right
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print((b & 128) >> 7);
		System.out.print((b & 64) >> 6);
		System.out.print((b & 32) >> 5);
		System.out.print((b & 16) >> 4);
		System.out.print((b & 8) >> 3);
		System.out.print((b & 4) >> 2);
		System.out.print((b & 2) >> 1);
		System.out.print((b & 1) >> 0);
		System.out.print(" ");
		//Use this method to print the remaining 7 bits of b
	}
	
	public static void printShortBinary(short s) {
		// Create 2 byte variables 
		byte b1;
		byte b2;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		b1 = (byte) ((s & 65535) >> 8);
		b2 = (byte) ((s & 255));
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(b1);
		printByteBinary(b2);
	}
	
	public static void printIntBinary(int i) {
		// Create 2 short variables
		short s1;
		short s2;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		s1 = (byte) ((i & 2147483647) >> 16);
		s2 = (byte) ((i & 65535));
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(s1);
		printShortBinary(s2);
	}
	
	public static void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int i1;
		int i2;
		i1 = (byte) (l >> 32);
		i2 = (byte) (l & 2147483647);
		printIntBinary(i1);
		printIntBinary(i2);
	}
	public static void main(String[] args) {
		// Test your methods here
//		printByteBinary((byte) 63);
//		printByteBinary((byte) 128);
//		printShortBinary((short)2222);	
//		printIntBinary(131071);
		
		printLongBinary(137438953471L);
	}
}
