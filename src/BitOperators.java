public class BitOperators
{
	public static void main(String[] args)
	{
		// Bit operators are available only for integer types (byte, short, int,
		// long)
		// Uncomment the line below and you'll get compile time error
		// System.out.println(25f >> 3);

		/**************************** Bit Wise Operators ******************************/

		System.out.println("****************** Bit Wise Operators *******************\r");
		System.out.println("8 is " + Integer.toBinaryString(8));
		System.out.println("31 is " + Integer.toBinaryString(31));
		System.out.println("The fourth bit from right of 31 is " + (31 & 8) / 8);
		System.out.println("33 is " + Integer.toBinaryString(33));
		System.out.println("The fourth bit from right of 33 is " + (33 & 8) / 8);

		/*************************** Bit Shift Operators *****************************/

		System.out.println("\r****************** Bit Shift Operators *******************\r");

		System.out.println("25 is " + Integer.toBinaryString(25));

		System.out.print("Now shifting 3 bits to the left: ");
		System.out.println(Integer.toBinaryString(25 << 3) + " = " + Integer.toString(25 << 3));

		System.out.print("Now shifting 3 bits to the right by extending sign bit "
				+ "into top bits (arythmetic shift): ");
		System.out.println(Integer.toBinaryString(25 >> 3) + " = " + Integer.toString(25 >> 3));

		System.out.print("Now shifting 3 bits to the right by filling top bits "
				+ "with zero (logical shift): ");
		System.out.println(Integer.toBinaryString(25 >>> 3) + " = " + Integer.toString(25 >>> 3));

		System.out.println();

		System.out.println("-25 is " + Integer.toBinaryString(-25));

		System.out.print("Now shifting 3 bits to the left: ");
		System.out.println(Integer.toBinaryString(-25 << 3) + " = " + Integer.toString(-25 << 3));

		System.out.print("Now shifting 3 bits to the right by extending sign bit "
				+ "into top bits (arythmetic shift): ");
		System.out.println(Integer.toBinaryString(-25 >> 3) + " = " + Integer.toString(-25 >> 3));

		System.out
				.print("Now shifting 3 bits to the right by filling top bits with zero (logical shift): ");
		System.out.println(Integer.toBinaryString(-25 >>> 3) + " = " + Integer.toString(-25 >>> 3));

		System.out.println();

		System.out.println("The right-hand side argument of the shift operators is "
				+ "reduced modulo 32 (unless the left-hand side is a long, "
				+ "in which case the right-hand side is reduced modulo 64):");
		System.out.println(Integer.toBinaryString(25 << 3) + " (25 >> 3) = "
				+ Integer.toBinaryString(25 << 35) + " (25 >> 35)");

		int x = (int) (Math.pow(2, 31) - 1);
		System.out.println("The max value of int type is " + x + ", that is "
				+ Integer.toBinaryString(x) + " in binary format.");
		System.out.println("After shifting 3 bits left it is " + Integer.toString(x << 3)
				+ ", that is " + Integer.toBinaryString(x << 3) + " in binary format.");
		System.out.println("This shows that bits are not cycled, the left most 3"
				+ " bits just disappear.");
	}
}