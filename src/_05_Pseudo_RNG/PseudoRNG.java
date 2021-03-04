package _05_Pseudo_RNG;

public class PseudoRNG {
	/*
	 * It is impossible for a computer to come up with a series of numbers that are
	 * truly random. They can, however, use mathematical algorithms to generate
	 * numbers that can seem random. These are called pseudo random numbers.
	 * 
	 */

	// 1. Create a member variable of type long called "seed"
	private long seed;

	// 2. Make a constructor that initializes the memeber variable
	PseudoRNG(long seed) {
		this.seed = seed;
	}
	// 3. Complete the steps inside the xorShift method

	// 4. Complete the steps in the main method

	// 5. Write your own pseudo random generation method. You can use the xor
	// shift as a guide. Use the main method to test it.

	// This is called the xor shift. It is a very simple algorithm to generate
	// Pseudo random numbers.
	long xorShift() {
		// 1. Create a local long called seed and set it equal to the member variable
		// We will only use the local variable for the rest of the method
		long seed = this.seed;
		// 2. Shift seed to the left 13 bits and save the result
		seed = seed << 13;
		// 3. xor seed by the result of step 1 and save that result
		seed = seed ^ this.seed;
		// 4. Set seed equal to the result of step 2
		this.seed = seed;
		// 5. Shift seed to the right 7 bits and save the result
		seed = seed >> 7;
		// 6. xor seed by the result of step 4 and save that result
		seed = seed ^ this.seed;
		// 7. Set seed equal to the result of step 5
		this.seed = seed;
		// 8. Shift seed to the left 17 bits and save the result
		seed = seed << 17;
		// 9. xor seed by the result of step 7 and save that result
		seed = seed ^ this.seed;
		// 10. Set seed equal to the result of step 8
		this.seed = seed;
		// 11. change the line below to return seed
		return seed;

		// For fun, see if you can rewrite the method using only 4 lines of code
	}

	public static void main(String[] args) {

		// 1. Create a PseudoRNG object with any seed.
		PseudoRNG prng = new PseudoRNG(1000);
		// 2. Print the result of xorShift() 3 times and note the random numbers.
		System.out.print(prng.xorShift() + "\n");
		System.out.print(prng.xorShift() + "\n");
		System.out.print(prng.xorShift() + "\n");
		// 3. Create a secon PSeudoRNG object with a different seed and print the result
		// of xorShift 3 times.
		PseudoRNG prng2 = new PseudoRNG(919919919);
		// 4. Run the tests a second time and notice that 3 random numbers are the same
		// because the seed generates the same sequence of random numbers.
		System.out.print(prng2.xorShift() + "\n");
		System.out.print(prng2.xorShift() + "\n");
		System.out.print(prng2.xorShift() + "\n");
		// If you would like to set the seed with a number that is hard to predict, you
		// can use System.currentTimeMillis().
	}
}
