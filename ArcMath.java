/* Imports */
import java.util.Random;
import java.lang.StrictMath;

/*  Edition Dates 
 * 
 * 	0.9		Jan 10, 2020
 * 
 *  	0.9.1		Jan 15, 2020
 *  
 *  	1.0.1		Mar 2, 2020
 * 
 */
/*	Edition Notes 
 * 	Jan 10, 2020 - Edition 0.9
 * 	Jan 11, 2020 - Edition 0.9.1.1
 * 	Jan 12, 2020 - Edition 0.9.1.2
 * 	Jan 13, 2020 - Edition 0.9.1.3		Exact Update
 *  	Jan 14, 2020 - Edition 0.9.1.4		Array Update I
 * 	Jan 15, 2020 - Edition 0.9.1.5		Quadratic Formula Update
 * 	Jan 16, 2020 - Edition 0.9.1.6		toPrimitiveType Update
 *  	Jan 25, 2020 - Edition 0.9.1.7		Array Update II
 * 	Jan 27, 2020 - Edition 0.9.1.8		Array Update III
 *  	Jan 28, 2020 - Edition 0.9.1.9		Emigration of Array methods to {@code ArcArrays}
 * 	Jan 29, 2020 - Edition 0.9.1.10		Added list of available constants and methods
 *  	Jan 31, 2020 - Edition 0.9.1.11		Added signum and changed name to {@code ArcMath}
 *  	Feb 1, 2020 - Edition 0.9.1.12		Added copySign, rint, random, and IEEEremainder
 *  	Feb 2, 2020 - Edition 0.9.1.13		Changed trigonometric functions to StrictMath from Math
 *  	Feb 12, 2020 - Edition 0.9.1.14		Added floor, ceil, and hypot methods
 *  	Feb 13, 2020 - Edition 0.9.1.15		Added next_, round, scalb, and ulp methods
 *  	Feb 14, 2020 - Edition 0.9.1.16		Added boolean tests for number types
 * 	Feb 16, 2020 - Edition 0.9.1.17		Added checkContains methods and updated quadratic method description
 * 	Mar 2, 2020 - Edition 1.0.1.0		Added random method with specified max and released on Github
 * 
 */
/* 	Credits 
 * 	
 * 	@author 	Andrew P. Moran
 * 	@since 		0.9
 * 
 */
/*  NOTES FOR USER 
 * 
 *  To import, type 
 * 			import PACKAGE_NAME.ArcMath;
 *  at the top of the class you would like to import the {@code ArcMath} class into.
 * 
 *  The class {@code ArcMath} contains methods for performing basic
 *  numeric operations such as the elementary exponential, logarithm,
 *  square root, and trigonometric functions, as well as methods to 
 *  calculate values according to the quadratic formula and pythagorean theorem.
 * 
 */
/*  Other libraries from Arcturus 
 * 	ArcArr ©2020
 *  ArcChem ©2020
 *  ArcGraph ©2020
 *  ArcStr ©2020
 *  ArcPhys ©2020
 * 
 */


public final class ArcMath {
	
	/*
     * Don't let anyone instantiate this class. 
     */
    private ArcMath() {}
	
	/* Current Edition 
	 * The current edition of the program.
	 */
	private static final String EDITION = "1.0.1.0";
	
	/* e 
	 * The double value that is closer than any other to
     * e, the base of the natural logarithms.
	 */
	public static final double E = 2.7182818284590452354;
	
	/* pi 
	 * The double value that is closer than any other to
     * pi, the ratio of the circumference of a circle to its
     * diameter.
	 */
	public static final double PI = 3.14159265358979323846;
	
	/* Euler's Constant 
	 * The double value that is closer than any other to
     * pi, the ratio of the circumference of a circle to its
     * diameter.
	 */
	public static final double EULERS_CONSTANT = 0.5772156649;
	
	/* Degrees to Radians 
	 * Constant by which to multiply an angular value in degrees to obtain an
     * angular value in radians.
	 */
	private static final double DEGREES_TO_RADIANS = 0.017453292519943295;
	
	/* Radians to Degrees 
	 * Constant by which to multiply an angular value in radians to obtain an
     * angular value in degrees.
	 */
	private static final double RADIANS_TO_DEGREES = 57.29577951308232;
	
	/* Golden Ratio 
	 * A number often encountered when taking 
	 * the ratios of distances in simple geometric figures.
	 */
	public static final double GOLDEN_RATIO = 1.61803398875;
	
	/* Speed of Light in Miles 
	 * The Speed of Light in Miles per Second
	 */
	public static final double SPEED_LIGHT_MILES = 186282.0;
	
	/* Speed of Light in Meters 
	 * The Speed of Light in Meters per Second
	 */
	public static final double SPEED_LIGHT_METERS = 299792458.0;
	
	/* Planck's Constant 
	 * The size and energy quanta in quantum mechanics.
	 */
	public static final float PLANCK_CONSTANT = 6.626068e-34f, PLANCKS_NUMBER = 6.626068e-34f;
	
	/* Avogadro's Constant 
	 * The number of constituent particles that are
	 * contained in one mole
	 */
	public static final float AVOGADRO_CONSTANT = 6.0221515e23f, AVOGADRO = 6.0221515e23f;
	
	/* Gravitational Constant 
	 * An empirical physical constant 
	 * involved in the calculation of gravitational effects
	 */
	public static final float GRAVITATIONAL_CONSTANT = 6.67300e-11f, G = 6.67300e-11f;
	
	/* Boltzmann's Constant 
	 * a physical constant that relates 
	 * the average relative kinetic energy of particles in a gas 
	 * with the temperature of the gas
	 */
	public static final float BOLTZMANN_CONSTANT = 1.380650e23f;
	
	/* Byte Minimum Value 
	 * The minimum value of a byte
	 */
	public static final byte BYTE_MIN_VALUE = -128;
	
	/* Short Minimum Value 
	 * The minimum value of a short
	 */
	public static final short SHORT_MIN_VALUE = -32768;
	
	/* Int Minimum Value 
	 * The minimum value of an int
	 */
	public static final int INT_MIN_VALUE = -2147483648;
	
	/* Long Minimum Value 
	 * The minimum value of a long
	 */
	public static final long LONG_MIN_VALUE = -9223372036854775808L;
	
	/* Float Minimum Value 
	 * The minimum value of a float
	 */
	public static final float FLOAT_MIN_VALUE = 1.4e-45f;
	
	/* Double Minimum Value 
	 * The minimum value of a double
	 */
	public static final double DOUBLE_MIN_VALUE = 4.9e-324;
	
	/* Byte Maximum Value 
	 * The maximum value of a byte
	 */
	public static final byte BYTE_MAX_VALUE = 127;
	
	/* Short Maximum Value 
	 * The maximum value of a short
	 */
	public static final short SHORT_MAX_VALUE = 32767;
	
	/* Int Maximum Value 
	 * The maximum value of an int
	 */
	public static final int INT_MAX_VALUE = 2147483647;
	
	/* Long Maximum Value 
	 * The maximum value of a long
	 */
	public static final long LONG_MAX_VALUE = 9223372036854775807L;
	
	/* Float Maximum Value 
	 * The maximum value of a float
	 */
	public static final float FLOAT_MAX_VALUE = 3.40282346638528860e38f;
	
	/* Double Maximum Value 
	 * The maximum value of a double
	 */
	public static final double DOUBLE_MAX_VALUE = 1.7976931348623157e308;
	
	/* Add 
	 * Adds two integer values
	 * and returns the combined value.
	 * 
	 * @param 		a	an int value
	 * @param		b	an int value
	 * @return 		the combined sum of the values
	 */
	public static int add(int a, int b) {
		return a + b;
	}
	
	/* Add 
	 * Adds an integer value and a long value 
	 * and returns the combined value.
	 * 
	 * @param 		a	an int value
	 * @param		b	a long value
	 * @return 		the combined sum of the values
	 */
	public static double add(int a, long b) {
		return a + b;
	}
	
	/* Add 
	 * Adds an integer value and a float value 
	 * and returns the combined value.
	 * 
	 * @param 		a	an int value
	 * @param		b	a float value
	 * @return 		the combined sum of the values
	 */
	public static double add(int a, float b) {
		return a + b;
	}
	
	/* Add 
	 * Adds an integer value and a double value 
	 * and returns the combined value.
	 * 
	 * @param 		a	an int value
	 * @param		b	a double value
	 * @return 		the combined sum of the values
	 */
	public static double add(int a, double b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a long value and an int value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a long value
	 * @param		b	an int value
	 * @return 		the combined sum of the values
	 */
	public static double add(long a, int b) {
		return a + b;
	}
	
	/* Add 
	 * Adds two long values 
	 * and returns the combined value.
	 * 
	 * @param 		a	a long value
	 * @param		b	a long value
	 * @return 		the combined sum of the values
	 */
	public static double add(long a, long b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a long value and a float value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a long value
	 * @param		b	a float value
	 * @return 		the combined sum of the values
	 */
	public static double add(long a, float b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a long value and a double value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a long value
	 * @param		b	a double value
	 * @return 		the combined sum of the values
	 */
	public static double add(long a, double b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a float value and an int value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a float value
	 * @param		b	an int value
	 * @return 		the combined sum of the values
	 */
	public static double add(float a, int b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a float value and a long value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a float value
	 * @param		b	a long value
	 * @return 		the combined sum of the values
	 */
	public static double add(float a, long b) {
		return a + b;
	}
	
	/* Add 
	 * Adds two float values
	 * and returns the combined value.
	 * 
	 * @param 		a	a float value
	 * @param		b	a float value
	 * @return 		the combined sum of the values
	 */
	public static double add(float a, float b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a float value and a double value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a float value
	 * @param		b	a double value
	 * @return 		the combined sum of the values
	 */
	public static double add(float a, double b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a double value and an int value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a double value
	 * @param		b	an int value
	 * @return 		the combined sum of the values
	 */
	public static double add(double a, int b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a double value and a long value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a double value
	 * @param		b	a long value
	 * @return 		the combined sum of the values
	 */
	public static double add(double a, long b) {
		return a + b;
	}
	
	/* Add 
	 * Adds a double value and a float value 
	 * and returns the combined value.
	 * 
	 * @param 		a	a double value
	 * @param		b	a float value
	 * @return 		the combined sum of the values
	 */
	public static double add(double a, float b) {
		return a + b;
	}
	
	/* Add 
	 * Adds two double values
	 * and returns the combined value.
	 * 
	 * @param 		a	a double value
	 * @param		b	a double value
	 * @return 		the combined sum of the values
	 */
	public static double add(double a, double b) {
		return a + b;
	}
	
	/* Subtract 
	 * Subtracts an integer value from an integer value
	 * and returns the difference.
	 * 
	 * @param 		a	an int value
	 * @param		b	an int value
	 * @return 		the difference of the values
	 */
	//subtract
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a long value from an integer value
	 * and returns the difference.
	 * 
	 * @param 		a	an int value
	 * @param		b	a long value
	 * @return 		the difference of the values
	 */
	public static double subtract(int a, long b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a float value from an integer value
	 * and returns the difference.
	 * 
	 * @param 		a	an int value
	 * @param		b	a float value
	 * @return 		the difference of the values
	 */
	public static double subtract(int a, float b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a double value from an integer value
	 * and returns the difference.
	 * 
	 * @param 		a	an int value
	 * @param		b	a double value
	 * @return 		the difference of the values
	 */
	public static double subtract(int a, double b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts an integer value from a long value
	 * and returns the difference.
	 * 
	 * @param 		a	a long value
	 * @param		b	an int value
	 * @return 		the difference of the values
	 */
	public static double subtract(long a, int b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a long value from a long value
	 * and returns the difference.
	 * 
	 * @param 		a	a long value
	 * @param		b	a long value
	 * @return 		the difference of the values
	 */
	public static double subtract(long a, long b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a float value from a long value
	 * and returns the difference.
	 * 
	 * @param 		a	a long value
	 * @param		b	a float value
	 * @return 		the difference of the values
	 */
	public static double subtract(long a, float b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a double value from a long value
	 * and returns the difference.
	 * 
	 * @param 		a	a long value
	 * @param		b	a double value
	 * @return 		the difference of the values
	 */
	public static double subtract(long a, double b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts an integer value from a float value
	 * and returns the difference.
	 * 
	 * @param 		a	a float value
	 * @param		b	a int value
	 * @return 		the difference of the values
	 */
	public static double subtract(float a, int b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a long value from a float value
	 * and returns the difference.
	 * 
	 * @param 		a	a float value
	 * @param		b	a long value
	 * @return 		the difference of the values
	 */
	public static double subtract(float a, long b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a float value from a float value
	 * and returns the difference.
	 * 
	 * @param 		a	a float value
	 * @param		b	a float value
	 * @return 		the difference of the values
	 */
	public static double subtract(float a, float b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a double value from a float value
	 * and returns the difference.
	 * 
	 * @param 		a	a float value
	 * @param		b	a double value
	 * @return 		the difference of the values
	 */
	public static double subtract(float a, double b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts an integer value from a double value
	 * and returns the difference.
	 * 
	 * @param 		a	a double value
	 * @param		b	an int value
	 * @return 		the difference of the values
	 */
	public static double subtract(double a, int b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a long value from a double value
	 * and returns the difference.
	 * 
	 * @param 		a	a double value
	 * @param		b	a long value
	 * @return 		the difference of the values
	 */
	public static double subtract(double a, long b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a float value from a double value
	 * and returns the difference.
	 * 
	 * @param 		a	a double value
	 * @param		b	a float value
	 * @return 		the difference of the values
	 */
	public static double subtract(double a, float b) {
		return a - b;
	}
	
	/* Subtract 
	 * Subtracts a double value from a double value
	 * and returns the difference.
	 * 
	 * @param 		a	a double value
	 * @param		b	a double value
	 * @return 		the difference of the values
	 */
	public static double subtract(double a, double b) {
		return a - b;
	}
	
	/* Multiply 
	 * Multiplies an integer value and an integer value
	 * and returns the product.
	 * 
	 * @param 		a	an int value
	 * @param		b	an int value
	 * @return 		the product of the values
	 */
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies an integer value and a long value
	 * and returns the product.
	 * 
	 * @param 		a	an int value
	 * @param		b	a long value
	 * @return 		the product of the values
	 */
	public static double multiply(int a, long b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies an integer value and a float value
	 * and returns the product.
	 * 
	 * @param 		a	an int value
	 * @param		b	a float value
	 * @return 		the product of the values
	 */
	public static double multiply(int a, float b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies an integer value and a double value
	 * and returns the product.
	 * 
	 * @param 		a	an int value
	 * @param		b	a double value
	 * @return 		the product of the values
	 */
	public static double multiply(int a, double b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a long value and an integer value
	 * and returns the product.
	 * 
	 * @param 		a	a long value
	 * @param		b	an int value
	 * @return 		the product of the values
	 */
	public static double multiply(long a, int b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a long value and a long value
	 * and returns the product.
	 * 
	 * @param 		a	a long value
	 * @param		b	a long value
	 * @return 		the product of the values
	 */
	public static double multiply(long a, long b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a long value and a float value
	 * and returns the product.
	 * 
	 * @param 		a	a long value
	 * @param		b	a float value
	 * @return 		the product of the values
	 */
	public static double multiply(long a, float b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a long value and a double value
	 * and returns the product.
	 * 
	 * @param 		a	a long value
	 * @param		b	a double value
	 * @return 		the product of the values
	 */
	public static double multiply(long a, double b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a float value and an integer value
	 * and returns the product.
	 * 
	 * @param 		a	a long value
	 * @param		b	an int value
	 * @return 		the product of the values
	 */
	public static double multiply(float a, int b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a float value and a long value
	 * and returns the product.
	 * 
	 * @param 		a	a float value
	 * @param		b	a long value
	 * @return 		the product of the values
	 */
	public static double multiply(float a, long b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a float value and a float value
	 * and returns the product.
	 * 
	 * @param 		a	a float value
	 * @param		b	a float value
	 * @return 		the product of the values
	 */
	public static double multiply(float a, float b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a float value and a double value
	 * and returns the product.
	 * 
	 * @param 		a	a float value
	 * @param		b	a double value
	 * @return 		the product of the values
	 */
	public static double multiply(float a, double b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a double value and an integer value
	 * and returns the product.
	 * 
	 * @param 		a	a double value
	 * @param		b	an int value
	 * @return 		the product of the values
	 */
	public static double multiply(double a, int b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a double value and a long value
	 * and returns the product.
	 * 
	 * @param 		a	a double value
	 * @param		b	a long value
	 * @return 		the product of the values
	 */
	public static double multiply(double a, long b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a double value and a float value
	 * and returns the product.
	 * 
	 * @param 		a	a double value
	 * @param		b	a float value
	 * @return 		the product of the values
	 */
	public static double multiply(double a, float b) {
		return a * b;
	}
	
	/* Multiply 
	 * Multiplies a double value and a double value
	 * and returns the product.
	 * 
	 * @param 		a	a double value
	 * @param		b	a double value
	 * @return 		the product of the values
	 */
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	/* Divide 
	 * Divides an integer value from an integer value
	 * and returns the quotient.
	 * 
	 * @param 		a	an int value
	 * @param		b	an int value
	 * @return 		the quotient of the values
	 */
	//divide
	public static double divide(int a, int b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a long value from an integer value
	 * and returns the quotient.
	 * 
	 * @param 		a	an int value
	 * @param		b	a long value
	 * @return 		the quotient of the values
	 */
	public static double divide(int a, long b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a float value from an integer value
	 * and returns the quotient.
	 * 
	 * @param 		a	an int value
	 * @param		b	a float value
	 * @return 		the quotient of the values
	 */
	public static double divide(int a, float b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a double value from an integer value
	 * and returns the quotient.
	 * 
	 * @param 		a	an int value
	 * @param		b	a double value
	 * @return 		the quotient of the values
	 */
	public static double divide(int a, double b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides an integer value from a double value
	 * and returns the quotient.
	 * 
	 * @param 		a	a long value
	 * @param		b	an int value
	 * @return 		the quotient of the values
	 */
	public static double divide(long a, int b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a long value from a long value
	 * and returns the quotient.
	 * 
	 * @param 		a	a long value
	 * @param		b	a long value
	 * @return 		the quotient of the values
	 */
	public static double divide(long a, long b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a float value from a long value
	 * and returns the quotient.
	 * 
	 * @param 		a	a long value
	 * @param		b	a float value
	 * @return 		the quotient of the values
	 */
	public static double divide(long a, float b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a double value from a long value
	 * and returns the quotient.
	 * 
	 * @param 		a	a long value
	 * @param		b	a double value
	 * @return 		the quotient of the values
	 */
	public static double divide(long a, double b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides an integer value from a float value
	 * and returns the quotient.
	 * 
	 * @param 		a	a float value
	 * @param		b	an int value
	 * @return 		the quotient of the values
	 */
	public static double divide(float a, int b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a long value from a float value
	 * and returns the quotient.
	 * 
	 * @param 		a	a float value
	 * @param		b	a long value
	 * @return 		the quotient of the values
	 */
	public static double divide(float a, long b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a float value from a float value
	 * and returns the quotient.
	 * 
	 * @param 		a	a float value
	 * @param		b	a float value
	 * @return 		the quotient of the values
	 */
	public static double divide(float a, float b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a double value from a float value
	 * and returns the quotient.
	 * 
	 * @param 		a	a float value
	 * @param		b	a double value
	 * @return 		the quotient of the values
	 */
	public static double divide(float a, double b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides an integer value from a double value
	 * and returns the quotient.
	 * 
	 * @param 		a	a double value
	 * @param		b	an int value
	 * @return 		the quotient of the values
	 */
	public static double divide(double a, int b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a long value from a double value
	 * and returns the quotient.
	 * 
	 * @param 		a	a double value
	 * @param		b	a long value
	 * @return 		the quotient of the values
	 */
	public static double divide(double a, long b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a float value from a double value
	 * and returns the quotient.
	 * 
	 * @param 		a	a double value
	 * @param		b	a float value
	 * @return 		the quotient of the values
	 */
	public static double divide(double a, float b) {
		return a / b;
	}
	
	/* Divide 
	 * Divides a double value from a double value
	 * and returns the quotient.
	 * 
	 * @param 		a	a double value
	 * @param		b	a double value
	 * @return 		the quotient of the values
	 */
	public static double divide(double a, double b) {
		return a / b;
	}
	
	/* Mod 
	 * Divides an integer value from an integer value
	 * and returns the remainder.
	 * 
	 * @param 		a	an int value
	 * @param		b	an int value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(int a, int b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a long value from an integer value
	 * and returns the remainder.
	 * 
	 * @param 		a	an int value
	 * @param		b	a long value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(int a, long b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a float value from an integer value
	 * and returns the remainder.
	 * 
	 * @param 		a	an int value
	 * @param		b	a float value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(int a, float b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a double value from an integer value
	 * and returns the remainder.
	 * 
	 * @param 		a	an int value
	 * @param		b	a double value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(int a, double b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a long value from an integer value
	 * and returns the remainder.
	 * 
	 * @param 		a	an int value
	 * @param		b	a long value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(long a, int b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a long value from a long value
	 * and returns the remainder.
	 * 
	 * @param 		a	a long value
	 * @param		b	a long value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(long a, long b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a float value from a long value
	 * and returns the remainder.
	 * 
	 * @param 		a	a long value
	 * @param		b	a float value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(long a, float b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a double value from a long value
	 * and returns the remainder.
	 * 
	 * @param 		a	a long value
	 * @param		b	a double value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(long a, double b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides an integer value from a float value
	 * and returns the remainder.
	 * 
	 * @param 		a	a float value
	 * @param		b	an int value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(float a, int b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a long value from a float value
	 * and returns the remainder.
	 * 
	 * @param 		a	a float value
	 * @param		b	a long value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(float a, long b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a float value from a float value
	 * and returns the remainder.
	 * 
	 * @param 		a	a float value
	 * @param		b	a float value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(float a, float b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a double value from a float value
	 * and returns the remainder.
	 * 
	 * @param 		a	a float value
	 * @param		b	a double value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(float a, double b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides an integer value from a double value
	 * and returns the remainder.
	 * 
	 * @param 		a	a double value
	 * @param		b	an int value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(double a, int b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a long value from a double value
	 * and returns the remainder.
	 * 
	 * @param 		a	a double value
	 * @param		b	a long value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(double a, long b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a float value from a double value
	 * and returns the remainder.
	 * 
	 * @param 		a	a double value
	 * @param		b	a float value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(double a, float b) {
		return a % b;
	}
	
	/* Mod 
	 * Divides a double value from a double value
	 * and returns the remainder.
	 * 
	 * @param 		a	a double value
	 * @param		b	a double value
	 * @return 		the remainder after division of the values
	 */
	public static double mod(double a, double b) {
		return a % b;
	}
		
	/* Square 
	 * Finds the square of an integer value,
	 * or the value to the power of two.
	 * 
	 * @param 		a	an int value
	 * @return 		the square of the value
	 */
	public static int square(int a) {
		return multiply(a,a);
	}
	
	/* Square 
	 * Finds the square of a long value,
	 * or the value to the power of two.
	 * 
	 * @param 		a	a long value
	 * @return 		the square of the value
	 */
	public static double square(long a) {
		return multiply(a,a);
	}
	
	/* Square 
	 * Finds the square of a float value,
	 * or the value to the power of two.
	 * 
	 * @param 		a	a float value
	 * @return 		the square of the value
	 */
	public static double square(float a) {
		return multiply(a,a);
	}
	
	/* Square 
	 * Finds the square of a double value,
	 * or the value to the power of two.
	 * 
	 * @param 		a	a double value
	 * @return 		the square of the value
	 */
	public static double square(double a) {
		return multiply(a,a);
	}
	
	/* Square Root 
	 * Finds the square root of an integer value,
	 * or the number whose square is the integer value.
	 * 
	 * @param 		a	an int value
	 * @return 		the square root of the value
	 */
	//sqrt
	public static double sqrt(int a) {
		double temp;

		double sr = a / 2;
		
		do {
			temp = sr;
			sr = (temp + (a / temp)) / 2;
		} while ((temp - sr) != 0);
		return sr;
		    
	}
	
	/* Square Root 
	 * Finds the square root of a long value,
	 * or the number whose square is the long value.
	 * 
	 * @param 		a	a long value
	 * @return 		the square root of the value
	 */
	public static double sqrt(long a) {
		double temp;

		double sr = a / 2;
		
		do {
			temp = sr;
			sr = (temp + (a / temp)) / 2;
		} while ((temp - sr) != 0);
		return sr;
		    
	}
	
	/* Square Root 
	 * Finds the square root of a float value,
	 * or the number whose square is the float value.
	 * 
	 * @param 		a	a float value
	 * @return 		the square root of the value
	 */
	public static double sqrt(float a) {
		double temp;

		double sr = a / 2;
		
		do {
			temp = sr;
			sr = (temp + (a / temp)) / 2;
		} while ((temp - sr) != 0);
		return sr;
		    
	}
	
	/* Square Root 
	 * Finds the square root of a double value,
	 * or the number whose square is the double value.
	 * 
	 * @param 		a	a double value
	 * @return 		the square root of the value
	 */
	public static double sqrt(double a) {
		double temp;

		double sr = a / 2;
		
		do {
			temp = sr;
			sr = (temp + (a / temp)) / 2;
		} while ((temp - sr) != 0);
		return sr;
		    
	}

	/* Cube Root 
	 * Finds the cube root of a double value,
	 * or the number whose cube is the double value.
	 * 
	 * @param 		a	a double value
	 * @return 		the cube root of the value
	 */
	public static double cbrt(double a) {
		double i, precision = 0.000000000001;
		for(i = 1; (i*i*i) <= a; ++i);
	      for(--i; (i*i*i) < a; i += precision);
	      return i;
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the integer B and integer C.
	 * 
	 * @param 		b	an int value
	 * @param 		c	an int value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	//findPythagA
	public static double findPythagA(int b, int c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the integer B and long C.
	 * 
	 * @param 		b	an int value
	 * @param 		c	a long value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(int b, long c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the integer B and float C.
	 * 
	 * @param 		b	an int value
	 * @param 		c	a float value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(int b, float c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the integer B and double C.
	 * 
	 * @param 		b	an int value
	 * @param 		c	a double value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(int b, double c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the long B and integer C.
	 * 
	 * @param 		b	a long value
	 * @param 		c	an int value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(long b, int c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the long B and long C.
	 * 
	 * @param 		b	a long value
	 * @param 		c	a long value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(long b, long c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the long B and float C.
	 * 
	 * @param 		b	a long value
	 * @param 		c	a float value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(long b, float c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the long B and double C.
	 * 
	 * @param 		b	a long value
	 * @param 		c	a double value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(long b, double c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the float B and integer C.
	 * 
	 * @param 		b	a float value
	 * @param 		c	an int value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(float b, int c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the float B and long C.
	 * 
	 * @param 		b	a float value
	 * @param 		c	a long value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(float b, long c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the float B and float C.
	 * 
	 * @param 		b	a float value
	 * @param 		c	a float value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(float b, float c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the float B and double C.
	 * 
	 * @param 		b	a float value
	 * @param 		c	a double value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(float b, double c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the double B and integer C.
	 * 
	 * @param 		b	a double value
	 * @param 		c	an int value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(double b, int c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the double B and long C.
	 * 
	 * @param 		b	a double value
	 * @param 		c	a long value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(double b, long c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the double B and float C.
	 * 
	 * @param 		b	a double value
	 * @param 		c	a float value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(double b, float c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find A in the Pythagorean Theorem 
	 * Finds the value of A according to the Pythagorean Theorem
	 * given the double B and double C.
	 * 
	 * @param 		b	a double value
	 * @param 		c	a double value
	 * @return 		the value of A in the Pythagorean Theorem
	 */
	public static double findPythagA(double b, double c) {
		return sqrt(subtract(square(c),square(b)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the integer A and integer C.
	 * 
	 * @param 		a	an int value
	 * @param 		c	an int value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	//findPythagB
	public static double findPythagB(int a, int c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the integer A and long C.
	 * 
	 * @param 		a	an int value
	 * @param 		c	a long value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(int a, long c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the integer A and float C.
	 * 
	 * @param 		a	an int value
	 * @param 		c	a float value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(int a, float c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the integer A and double C.
	 * 
	 * @param 		a	an int value
	 * @param 		c	a double value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(int a, double c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the long A and integer C.
	 * 
	 * @param 		a	a long value
	 * @param 		c	an int value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(long a, int c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the long A and long C.
	 * 
	 * @param 		a	a long value
	 * @param 		c	a long value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(long a, long c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the long A and float C.
	 * 
	 * @param 		a	a long value
	 * @param 		c	a float value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(long a, float c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the long A and double C.
	 * 
	 * @param 		a	a long value
	 * @param 		c	a double value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(long a, double c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the float A and integer C.
	 * 
	 * @param 		a	a float value
	 * @param 		c	an int value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(float a, int c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the float A and long C.
	 * 
	 * @param 		a	a float value
	 * @param 		c	a long value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(float a, long c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the float A and float C.
	 * 
	 * @param 		a	a float value
	 * @param 		c	a float value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(float a, float c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the float A and double C.
	 * 
	 * @param 		a	a float value
	 * @param 		c	a double value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(float a, double c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the double A and integer C.
	 * 
	 * @param 		a	a double value
	 * @param 		c	an int value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(double a, int c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the double A and long C.
	 * 
	 * @param 		a	a double value
	 * @param 		c	a long value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(double a, long c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the double A and float C.
	 * 
	 * @param 		a	a double value
	 * @param 		c	a float value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(double a, float c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find B in the Pythagorean Theorem 
	 * Finds the value of B according to the Pythagorean Theorem
	 * given the double A and double C.
	 * 
	 * @param 		a	a double value
	 * @param 		c	a double value
	 * @return 		the value of B in the Pythagorean Theorem
	 */
	public static double findPythagB(double a, double c) {
		return sqrt(subtract(square(c),square(a)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the integer A and integer B.
	 * 
	 * @param 		a	an int value
	 * @param 		b	an int value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	//findPythagC
	public static double findPythagC(int a, int b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the integer A and long B.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a long value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(int a, long b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the integer A and float B.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a float value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(int a, float b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the integer A and double B.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a double value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(int a, double b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the long A and int B.
	 * 
	 * @param 		a	a long value
	 * @param 		b	an int value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(long a, int b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the long A and long B.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a long value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(long a, long b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the long A and float B.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a float value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(long a, float b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the long A and double B.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a double value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(long a, double b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the float A and int B.
	 * 
	 * @param 		a	a float value
	 * @param 		b	an int value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(float a, int b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the float A and long B.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a long value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(float a, long b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the float A and float B.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a float value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(float a, float b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the float A and double B.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a double value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(float a, double b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the double A and integer B.
	 * 
	 * @param 		a	a double value
	 * @param 		b	an int value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(double a, int b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the double A and long B.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a long value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(double a, long b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the double A and float B.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a float value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(double a, float b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* Find C in the Pythagorean Theorem 
	 * Finds the value of C according to the Pythagorean Theorem
	 * given the double A and double B.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a double value
	 * @return 		the value of C in the Pythagorean Theorem
	 */
	public static double findPythagC(double a, double b) {
		return sqrt(add(multiply(a,a),multiply(b,b)));
	}
	
	/* To Degrees 
	 * Multiplies the given angular value in radians
	 * by the constant that converts it to
	 * an angular value in degrees
	 * 
	 * @param 		radianValue		an angular value in radians
	 * @return 		the angular value in degrees
	 */
	public static double toDegrees(int radianValue) {
		return radianValue * RADIANS_TO_DEGREES;
	}
	
	/* To Degrees 
	 * Multiplies the given angular value in radians
	 * by the constant that converts it to
	 * an angular value in degrees
	 * 
	 * @param 		radianValue		an angular value in radians
	 * @return 		the angular value in degrees
	 */
	public static double toDegrees(long radianValue) {
		return radianValue * RADIANS_TO_DEGREES;
	}
	
	/* To Degrees 
	 * Multiplies the given angular value in radians
	 * by the constant that converts it to
	 * an angular value in degrees
	 * 
	 * @param 		radianValue		an angular value in radians
	 * @return 		the angular value in degrees
	 */
	public static double toDegrees(float radianValue) {
		return radianValue * RADIANS_TO_DEGREES;
	}
	
	/* To Degrees 
	 * Multiplies the given angular value in radians
	 * by the constant that converts it to
	 * an angular value in degrees
	 * 
	 * @param 		radianValue		an angular value in radians
	 * @return 		the angular value in degrees
	 */
	public static double toDegrees(double radianValue) {
		return radianValue * RADIANS_TO_DEGREES;
	}
	
	/* To Radians 
	 * Multiplies the given angular value in degrees
	 * by the constant that converts it to
	 * an angular value in radians
	 * 
	 * @param 		degreeValue		an angular value in degrees
	 * @return 		the angular value in radians
	 */
	public static double toRadians(int degreeValue) {
		return degreeValue * DEGREES_TO_RADIANS;
	}
	
	/* To Radians 
	 * Multiplies the given angular value in degrees
	 * by the constant that converts it to
	 * an angular value in radians
	 * 
	 * @param 		degreeValue		an angular value in degrees
	 * @return 		the angular value in radians
	 */
	public static double toRadians(long degreeValue) {
		return degreeValue * DEGREES_TO_RADIANS;
	}
	
	/* To Radians 
	 * Multiplies the given angular value in degrees
	 * by the constant that converts it to
	 * an angular value in radians
	 * 
	 * @param 		degreeValue		an angular value in degrees
	 * @return 		the angular value in radians
	 */
	public static double toRadians(float degreeValue) {
		return degreeValue * DEGREES_TO_RADIANS;
	}
	
	/* To Radians 
	 * Multiplies the given angular value in degrees
	 * by the constant that converts it to
	 * an angular value in radians
	 * 
	 * @param 		degreeValue		an angular value in degrees
	 * @return 		the angular value in radians
	 */
	public static double toRadians(double degreeValue) {
		return degreeValue * DEGREES_TO_RADIANS;
	}
	
	/* Sine 
	 * Returns the trigonometric sine of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the sine of x
	 */
	public static double sin(double x) {
		return StrictMath.sin(x);
	}
	
	/* Cosine 
	 * Returns the trigonometric cosine of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the cosine of x
	 */
	public static double cos(double x) {
		return StrictMath.cos(x);
	}
	
	/* Tangent 
	 * Returns the trigonometric tangent of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the tangent of x
	 */
	public static double tan(double x) {
		return StrictMath.tan(x);
	}
	
	/* Cosecant 
	 * Returns the trigonometric cosecant of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the cosecant of x
	 */
	public static double csc(double x) {
		return divide(1,StrictMath.sin(x));
	}
	
	/* Secant 
	 * Returns the trigonometric secant of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the secant of x
	 */
	public static double sec(double x) {
		return divide(1,StrictMath.cos(x));
	}
	
	/* Cotangent 
	 * Returns the trigonometric cotangent of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the cotangent of x
	 */
	public static double cot(double x) {
		return divide(1,StrictMath.tan(x));
	}
	
	/* Arc Sine 
	 * Returns the arc sine of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the arc sine of x
	 */
	public static double asin(double x) {
		return StrictMath.asin(x);
	}
	
	/* Arc cosine 
	 * Returns the arc cosine of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the arc cosine of x
	 */
	public static double acos(double x) {
		return StrictMath.acos(x);
	}
	
	/* Arc Tangent 
	 * Returns the arc tangent of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the arc tangent of x
	 */
	public static double atan(double x) {
		return StrictMath.atan(x);
	}
	
	/* Arc Tangent 
	 * Returns the arc tangent of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the arc tangent of x
	 */
	public static double atan2(double x, double y) {
		return StrictMath.atan2(x,y);
	}
	
	/* Hyperbolic Sine 
	 * Returns the hyperbolic sine of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the hyperbolic sine of x
	 */
	public static double sinh(double x) {
		return StrictMath.sinh(x);
	}
	
	/* Hyperbolic Cosine 
	 * Returns the hyperbolic cosine of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the hyperbolic cosine of x
	 */
	public static double cosh(double x) {
		return StrictMath.cosh(x);
	}
	
	/* Hyperbolic Tangent 
	 * Returns the hyperbolic tangent of an angle.
	 * 
	 * @param 		x	an angular value in radians
	 * @return 		the hyperbolic tangent of x
	 */
	public static double tanh(double x) {
		return StrictMath.tanh(x);
	}
	
	/* Pow 
	 * Finds the integer base 
	 * to the power of the integer exponent.
	 * 
	 * @param 		base	an int value
	 * @param		exp		the exponent of the base
	 * @return 		base to the power of the exponent
	 */
	public static double pow(int base, int exp) {
		double returnValue = base;
		
		if(exp > 0) {
			for(int i = 1; i <= exp; i++) {
				returnValue *= base;
			}
		} else if (exp < 0) {
			for(int i = 1; i <= exp; i++) {
				returnValue *= base;
			}
			returnValue = divide(1, returnValue);
		} else returnValue = 1;
		
		return returnValue;
	}
	
	/* Pow 
	 * Finds the long base 
	 * to the power of the integer exponent.
	 * 
	 * @param 		base	a long value
	 * @param		exp		the exponent of the base
	 * @return 		base to the power of the exponent
	 */
	public static double pow(long base, int exp) {
		double returnValue = base;
		
		if(exp > 0) {
			for(int i = 1; i <= exp; i++) {
				returnValue *= base;
			}
		} else if (exp < 0) {
			for(int i = 1; i <= exp; i++) {
				returnValue *= base;
			}
			returnValue = divide(1, returnValue);
		} else returnValue = 1;
		
		return returnValue;
	}
	
	/* Pow 
	 * Finds the float base 
	 * to the power of the integer exponent.
	 * 
	 * @param 		base	a float value
	 * @param		exp		the exponent of the base
	 * @return 		base to the power of the exponent
	 */
	public static double pow(float base, int exp) {
		double returnValue = base;
		
		if(exp > 0) {
			for(int i = 1; i <= exp; i++) {
				returnValue *= base;
			}
		} else if (exp < 0) {
			for(int i = 1; i <= exp; i++) {
				returnValue *= base;
			}
			returnValue = divide(1, returnValue);
		} else returnValue = 1;
		
		return returnValue;
	}
	
	/* Pow 
	 * Finds the double base 
	 * to the power of the integer exponent.
	 * 
	 * @param 		base	a double value
	 * @param		exp		the exponent of the base
	 * @return 		base to the power of the exponent
	 */
	public static double pow(double base, int exp) {
		double returnValue = base;
		
		if(exp > 0) {
			for(int i = 1; i <= exp; i++) {
				returnValue *= base;
			}
		} else if (exp < 0) {
			for(int i = 1; i <= exp; i++) {
				returnValue *= base;
			}
			returnValue = divide(1, returnValue);
		} else returnValue = 1;
		
		return returnValue;
	}
	
	/* Absolute Value 
	 * Finds the absolute value
	 * of the integer x
	 * 
	 * @param 		x	an int value
	 * @return 		the absolute value of x
	 */
	public static int abs(int x) {
		if(x < 0) return x * -1;
		else return x;
	}
	
	/* Absolute Value 
	 * Finds the absolute value
	 * of the long x
	 * 
	 * @param 		x	a long value
	 * @return 		the absolute value of x
	 */
	public static long abs(long x) {
		if(x < 0) return x * -1;
		else return x;
	}
	
	/* Absolute Value 
	 * Finds the absolute value
	 * of the float x
	 * 
	 * @param 		x	a float value
	 * @return 		the absolute value of x
	 */
	public static float abs(float x) {
		if(x < 0) return x * -1;
		else return x;
	}
	
	/* Absolute Value 
	 * Finds the absolute value
	 * of the double x
	 * 
	 * @param 		x	a double value
	 * @return 		the absolute value of x
	 */
	public static double abs(double x) {
		if(x < 0) return x * -1;
		else return x;
	}
	
	/* Exponent 
	 * Finds Euler's Number e to 
	 * the power of the integer exponent
	 * 
	 * @param 		exp		an int value
	 * @return 		e to the power of exp
	 */
	public static double exp(int exp) {
		return pow(E, exp);
	}
	
	/* Exponent Minus 1 
	 * Finds Euler's Number e to 
	 * the power of the integer exponent,
	 * minus 1.
	 * 
	 * @param 		exp		an int value
	 * @return 		e to the power of exp, minus 1
	 */
	public static double expm1(int exp) {
		return pow(E, exp) - 1;
	}
	
	/* Random 
	 * Returns a pseudorandom double between 0.0 (inclusive) and 1.0 (exclusive).
	 * To specify range on values, multiply the returned value with the magnitude of the range.
	 * 
	 * @return 		a pseudorandom double in the range of [0,1)
	 */
	public static double random() {
		Random rand = new Random();
		return rand.nextDouble();
	}
	
	/* Random 
	 * Returns a pseudorandom double between 0.0 (inclusive) and the double max (exclusive).
	 * 
	 * @param		max		a double value
	 * @return 		a pseudorandom double in the range of [0,max)
	 */
	public static double random(double max) {
		Random rand = new Random();
		return rand.nextDouble() * max;
	}
	
	/* Add Exact 
	 * Finds the sum of integer x and integer y,
	 * throwing an ArithmeticException
	 * if the sum overflows the integer
	 * 
	 * @param 		x		int value
	 * @param 		y		int value
	 * @return 		the sum of x and y
	 */
	public static int addExact(int x, int y) {
        int sum = x + y;

        if (((x ^ sum) & (y ^ sum)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return sum;
	}
	
	/* Add Exact 
	 * Finds the sum of long x and long y,
	 * throwing an ArithmeticException
	 * if the sum overflows the long
	 * 
	 * @param 		x	long value
	 * @param 		y	long value
	 * @return 		the sum of x and y
	 */
	public static long addExact(long x, long y) {
        long sum = x + y;

        if (((x ^ sum) & (y ^ sum)) < 0) {
            throw new ArithmeticException("long overflow");
        }
        return sum;
    }
	
	/* Subtract Exact 
	 * Finds the difference of integer x and integer y,
	 * throwing an ArithmeticException
	 * if the difference overflows the integer
	 * 
	 * @param 		x	int value
	 * @param 		y	int value
	 * @return 		the difference of x and y
	 */
	public static int subtractExact(int x, int y) {
        int diff = x - y;
        
        if (((x ^ y) & (x ^ diff)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return diff;
    }
	
	/* Subtract Exact 
	 * Finds the difference of long x and long y,
	 * throwing an ArithmeticException
	 * if the difference overflows the long 
	 * 
	 * @param 		x	long value
	 * @param 		y	long value
	 * @return 		the difference of x and y
	 */
	public static long subtractExact(long x, long y) {
        long diff = x - y;
        if (((x ^ y) & (x ^ diff)) < 0) {
            throw new ArithmeticException("long overflow");
        }
        return diff;
    }
	
	/* Multiply Exact 
	 * Finds the product of integer x and integer y,
	 * throwing an ArithmeticException
	 * if the product overflows the integer
	 * 
	 * @param 		x	int value
	 * @param 		y	int value
	 * @return 		the product of x and y
	 */
	public static int multiplyExact(int x, int y) {
        long prod = (long)x * (long)y;
        if ((int)prod != prod) {
            throw new ArithmeticException("integer overflow");
        }
        return (int)prod;
    }
	
	/* Multiply Exact 
	 * Finds the product of long x and long y,
	 * throwing an ArithmeticException
	 * if the difference overflows the long
	 * 
	 * @param 		x	long value
	 * @param 		y	long value
	 * @return 		the product of x and y
	 */
	public static long multiplyExact(long x, long y) {
        long prod = x * y;
        long ax = Math.abs(x);
        long ay = Math.abs(y);
        if (((ax | ay) >>> 31 != 0)) {
           if (((y != 0) && (prod / y != x)) ||
               (x == Long.MIN_VALUE && y == -1)) {
                throw new ArithmeticException("long overflow");
            }
        }
        return prod;
    }
	
	/* Increment Exact 
	 * Increments the value up by 1,
	 * throwing an ArithmeticException
	 * if the new value overflows integer
	 * 
	 * @param 		a	int value
	 * @return 		a incremented up by 1.
	 */
	public static int incrementExact(int a) {
        if (a == Integer.MAX_VALUE) {
            throw new ArithmeticException("integer overflow");
        }

        return a + 1;
    }
	
	/* Increment Exact 
	 * Increments the value up by 1L,
	 * throwing an ArithmeticException
	 * if the new value overflows long
	 * 
	 * @param 		a	long value
	 * @return 		a incremented up by 1L.
	 */
	public static long incrementExact(long a) {
        if (a == Long.MAX_VALUE) {
            throw new ArithmeticException("long overflow");
        }

        return a + 1L;
    }
	
	/* Increment Exact 
	 * Increments the value up by 1F,
	 * throwing an ArithmeticException
	 * if the new value overflows float
	 * 
	 * @param 		a	float value
	 * @return 		a incremented up by 1F.
	 */
	public static float incrementExact(float a) {
        if (a == Float.MAX_VALUE) {
            throw new ArithmeticException("float overflow");
        }

        return a + 1F;
    }
	
	/* Increment Exact 
	 * Increments the value up by 1.0,
	 * throwing an ArithmeticException
	 * if the new value overflows double
	 * 
	 * @param 		a	double value
	 * @return 		a incremented up by 1.0.
	 */
	public static double incrementExact(double a) {
        if (a == Double.MAX_VALUE) {
            throw new ArithmeticException("double overflow");
        }

        return a + 1.0;
    }
	
	/* Decrement Exact 
	 * Decrements the value by 1,
	 * throwing an ArithmeticException
	 * if the new value overflows integer
	 * 
	 * @param 		a	double value
	 * @return 		a decremented by 1.
	 */
	public static int decrementExact(int a) {
        if (a == Integer.MIN_VALUE) {
            throw new ArithmeticException("integer overflow");
        }

        return a - 1;
    }
	
	/* Decrement Exact 
	 * Decrements the value by 1L,
	 * throwing an ArithmeticException
	 * if the new value overflows long
	 * 
	 * @param 		a	double value
	 * @return 		a decremented by 1L.
	 */
	public static long decrementExact(long a) {
        if (a == Long.MIN_VALUE) {
            throw new ArithmeticException("long overflow");
        }

        return a - 1L;
    }
	
	/* Decrement Exact 
	 * Decrements the value by 1,
	 * throwing an ArithmeticException
	 * if the new value overflows float
	 * 
	 * @param 		a	float value
	 * @return 		a decremented by 1F.
	 */
	public static float decrementExact(float a) {
        if (a == Float.MIN_VALUE) {
            throw new ArithmeticException("float overflow");
        }

        return a - 1F;
    }
	
	/* Decrement Exact 
	 * Decrements the value by 1.0,
	 * throwing an ArithmeticException
	 * if the new value overflows double
	 * 
	 * @param 		a	double value
	 * @return 		a decremented by 1.0.
	 */
	public static double decrementExact(double a) {
        if (a == Double.MIN_VALUE) {
            throw new ArithmeticException("double overflow");
        }

        return a - 1.0;
    }

	/* Negate Exact 
	 * Negates the given integer value
	 * throwing an ArithmeticException
	 * if the new value overflows integer
	 * 
	 * @param 		a	an int value
	 * @return 		a multiplied by -1.
	 */
	public static int negateExact(int a) {
        if (a == Integer.MIN_VALUE) {
            throw new ArithmeticException("integer overflow");
        }

        return -a;
    }
	
	/* Negate Exact 
	 * Negates the given long value,
	 * throwing an ArithmeticException
	 * if the new value overflows long
	 * 
	 * @param 		a	a long value
	 * @return 		a multiplied by -1.
	 */
	public static long negateExact(long a) {
        if (a == Long.MIN_VALUE) {
            throw new ArithmeticException("long overflow");
        }

        return -a;
    }
	
	/* Negate Exact 
	 * Negates the given float value,
	 * throwing an ArithmeticException
	 * if the new value overflows float
	 * 
	 * @param 		a	a float value
	 * @return 		a multiplied by -1.
	 */
	public static float negateExact(float a) {
        if (a == Float.MIN_VALUE) {
            throw new ArithmeticException("float overflow");
        }

        return -a;
    }
	
	/* Negate Exact 
	 * Negates the given double value,
	 * throwing an ArithmeticException
	 * if the new value overflows double
	 * 
	 * @param 		a	a double value
	 * @return 		a multiplied by -1.
	 */
	public static double negateExact(double a) {
        if (a == Double.MIN_VALUE) {
            throw new ArithmeticException("double overflow");
        }

        return -a;
    }

	/* To Integer Exact 
	 * Casts the given long value into an integer,
	 * throwing an ArithmeticException
	 * if the new integer value does not equal the original value.
	 * 
	 * @param 		value	a long value
	 * @return 		value type casted to an int 
	 */
	public static int toIntExact(long value) {
        if ((int)value != value) {
            throw new ArithmeticException("integer overflow");
        }
        return (int)value;
    }
	
	/* To Integer Exact 
	 * Casts the given float value into an integer,
	 * throwing an ArithmeticException
	 * if the new integer value does not equal the original value.
	 * 
	 * @param 		value	a float value
	 * @return 		value type casted to an int
	 */
	public static int toIntExact(float value) {
		if ((int)value != value) {
			throw new ArithmeticException("integer overflow");
	    }
	    return (int)value;
	}
	
	/* To Integer Exact 
	 * Casts the given double value into an integer,
	 * throwing an ArithmeticException
	 * if the new integer value does not equal the original value.
	 * 
	 * @param 		value	a double value
	 * @return 		value type casted to an int
	 */
	public static int toIntExact(double value) {
		if ((int)value != value) {
			throw new ArithmeticException("integer overflow");
		}
		return (int)value;
	}

	/* To Long Exact 
	 * Casts the given integer value into a long,
	 * throwing an ArithmeticException
	 * if the new long value does not equal the original value.
	 * 
	 * @param 		value	an int value
	 * @return 		value type casted to a long
	 */
	public static double toLongExact(int value) {
        if ((long)value != value) {
            throw new ArithmeticException("long overflow");
        }
        return (long)value;
    }
	
	/* To Long Exact 
	 * Casts the given float value into a long,
	 * throwing an ArithmeticException
	 * if the new long value does not equal the original value.
	 * 
	 * @param 		value	a float value
	 * @return 		value type casted to a long
	 */
	public static double toLongExact(float value) {
        if ((long)value != value) {
            throw new ArithmeticException("long overflow");
        }
        return (long)value;
    }
	
	/* To Long Exact 
	 * Casts the given double value into a long,
	 * throwing an ArithmeticException
	 * if the new long value does not equal the original value.
	 * 
	 * @param 		value	a double value
	 * @return 		value type casted to a long
	 */
	public static double toLongExact(double value) {
        if ((long)value != value) {
            throw new ArithmeticException("long overflow");
        }
        return (long)value;
    }
	
	/* To Float Exact 
	 * Casts the given integer value into a float,
	 * throwing an ArithmeticException
	 * if the new float value does not equal the original value.
	 * 
	 * @param 		value	an int value
	 * @return 		value type casted to a float
	 */
	public static float toFloatExact(int value) {
        if ((long)value != value) {
            throw new ArithmeticException("float overflow");
        }
        return (float)value;
    }
	
	/* To Float Exact 
	 * Casts the given long value into a float,
	 * throwing an ArithmeticException
	 * if the new long value does not equal the original value.
	 * 
	 * @param 		value	a long value
	 * @return 		value type casted to a float
	 */
	public static float toFloatExact(long value) {
        if ((long)value != value) {
            throw new ArithmeticException("float overflow");
        }
        return (float)value;
    }
	
	/* To Float Exact 
	 * Casts the given double value into a float,
	 * throwing an ArithmeticException
	 * if the new float value does not equal the original value.
	 * 
	 * @param 		value	a double value
	 * @return 		value type casted to a float
	 */
	public static float toFloatExact(double value) {
        if ((long)value != value) {
            throw new ArithmeticException("float overflow");
        }
        return (float)value;
    }
	
	/* To Double Exact 
	 * Casts the given integer value into a double,
	 * throwing an ArithmeticException
	 * if the new double value does not equal the original value.
	 * 
	 * @param 		value	an int value
	 * @return 		value type casted to a double
	 */
	public static double toDoubleExact(int value) {
        if ((double)value != value) {
            throw new ArithmeticException("double overflow");
        }
        return (double)value;
    }
	
	/* To Double Exact 
	 * Casts the given long value into a double,
	 * throwing an ArithmeticException
	 * if the new double value does not equal the original value.
	 * 
	 * @param 		value	a long value
	 * @return 		value type casted to a double
	 */
	public static double toDoubleExact(long value) {
        if ((double)value != value) {
            throw new ArithmeticException("double overflow");
        }
        return (double)value;
    }
	
	/* To Double Exact 
	 * Casts the given float value into a double,
	 * throwing an ArithmeticException
	 * if the new double value does not equal the original value.
	 * 
	 * @param 		value	a float value
	 * @return 		value type casted to a double
	 */
	public static double toDoubleExact(float value) {
        if ((double)value != value) {
            throw new ArithmeticException("double overflow");
        }
        return (double)value;
    }
	
	/* Multiply Full 
	 * Type casts two integer values, 
	 * and multiplies the values together.
	 * 
	 * @param 		x	an integer value
	 * @param 		y	an integer value
	 * @return 		x and y casted to longs and multiplied together
	 */
	public static long multiplyFull(int x, int y) {
        return (long)x * (long)y;
    }
	
	/* Floor Divide 
	 * Returns the value closest to positive infinity
	 * that is less than or equal to the algebraic quotient.
	 * 
	 * @param 		x	an integer value, the dividend
	 * @param 		y	an integer value, the divisor
	 * @return 		the largest value that is less than or equal to the algebraic quotient
	 */
	public static int floorDiv(int x, int y) {
        int r = x / y;

        if ((x ^ y) < 0 && (r * y != x)) {
            r--;
        }
        return r;
    }
	
	/* Floor Divide 
	 * Returns the value closest to positive infinity
	 * that is less than or equal to the algebraic quotient.
	 * 
	 * @param 		x	an integer value, the dividend
	 * @param 		y	a long value, the divisor
	 * @return 		the largest value that is less than or equal to the algebraic quotient
	 */
	public static long floorDiv(long x, int y) {
        return floorDiv(x, (long)y);
    }
	
	/* Floor Divide 
	 * Returns the value closest to positive infinity
	 * that is less than or equal to the algebraic quotient.
	 * 
	 * @param 		x	a long value, the dividend
	 * @param 		y	a long value, the divisor
	 * @return 		the largest value that is less than or equal to the algebraic quotient
	 */
	public static long floorDiv(long x, long y) {
        long r = x / y;
     
        if ((x ^ y) < 0 && (r * y != x)) {
            r--;
        }
        return r;
    }

	/* Floor Modulus 
	 * Returns the floor modulus of an integer and an integer value.
	 * 
	 * @param 		x	an int value
	 * @param 		y	an int value
	 * @return 		the floor modulus of x and y
	 */
	public static int floorMod(int x, int y) {
        return x - floorDiv(x, y) * y;
    }
	
	/* Floor Modulus 
	 * Returns the floor modulus of a long and an integer value.
	 * 
	 * @param 		x	a long value
	 * @param 		y	an int value
	 * @return 		the floor modulus of x and y
	 */
	public static int floorMod(long x, int y) {
		return (int)(x - floorDiv(x, y) * y);
	}
	
	/* Floor Modulus 
	 * Returns the floor modulus of a long and a long value.
	 * 
	 * @param 		x	a long value
	 * @param 		y	a long value
	 * @return 		the floor modulus of x and y
	 */
	public static long floorMod(long x, long y) {
        return x - floorDiv(x, y) * y;
    }
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	an int value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, int b, int c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	an int value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, int b, long c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	an int value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, int b, float c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	an int value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, int b, double c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a float value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, float b, int c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a float value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, float b, long c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a float value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, float b, float c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a float value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, float b, double c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a double value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, double b, int c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a double value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, double b, long c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a double value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, double b, float c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}

	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	an int value
	 * @param 		b	a double value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(int a, double b, double c) {
		double[] roots = new double[2];
		if(a == 0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	an int value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, int b, int c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	an int value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, int b, long c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	an int value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, int b, float c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	an int value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, int b, double c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a float value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, float b, int c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a float value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, float b, long c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a float value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, float b, float c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a float value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, float b, double c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a float value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, double b, int c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a double value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, double b, long c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a double value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, double b, float c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a long value
	 * @param 		b	a double value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(long a, double b, double c) {
		double[] roots = new double[2];
		if(a == 0L) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	an int value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, int b, int c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	an int value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, int b, long c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	an int value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, int b, float c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	an int value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, int b, double c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a float value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, float b, int c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a float value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, float b, long c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a float value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, float b, float c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a float value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, float b, double c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a double value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, double b, int c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a double value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, double b, long c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a double value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, double b, float c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a float value
	 * @param 		b	a double value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(float a, double b, double c) {
		double[] roots = new double[2];
		if(a == 0f) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	an int value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, int b, int c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	an int value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, int b, long c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	an int value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, int b, float c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	an int value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, int b, double c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a float value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, float b, int c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}

	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a float value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, float b, long c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a float value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, float b, float c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a float value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, float b, double c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a double value
	 * @param 		c	an int value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, double b, int c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a double value
	 * @param 		c	a long value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, double b, long c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * If there are two complex roots, nothing is returned.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a double value
	 * @param 		c	a float value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, double b, float c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Quadratic Formula  
	 * Finds the roots of the quadratic equation
	 * ax^2 + bx + c, using the quadratic formula,
	 * throwing an exception if the inputed value of a
	 * causes a divide by zero error.
	 * 
	 * The two roots are stored in an array, roots[],
	 * with the root calculated with - stored in roots[0],
	 * and the root calculated with + stored in roots[1].
	 * 
	 * The roots are only returned with a double value if
	 * there is one real root, or
	 * there are two real roots.
	 * 
	 * @param 		a	a double value
	 * @param 		b	a double value
	 * @param 		c	a double value
	 * @return 		an array containing the two roots of the quadratic formula.
	 */
	public static double[] quadratic(double a, double b, double c) {
		double[] roots = new double[2];
		if(a == 0.0) throw new ArithmeticException("a cannot be equal to zero.");
		else {
			roots[0] = divide(-b - sqrt(square(b) - 4 * a * c), (2 * a));
			roots[1] = divide(-b + sqrt(square(b) - 4 * a * c), (2 * a));
			return roots;
		}
	}
	
	/* Minimum 
	 * Returns the smaller of two arguments
	 * 
	 * @param		num1 	an int value
	 * @param		num2	an int value
	 * @return		the smaller of the two arguments
	 */
	public static int min(int num1, int num2) {
		if(num1 < num2) return num1;
		else return num2;
	}
	
	/* Minimum 
	 * Returns the smaller of two arguments
	 * 
	 * @param		num1 	a long value
	 * @param		num2	a long value
	 * @return		the smaller of the two arguments
	 */
	public static long min(long num1, long num2) {
		if(num1 < num2) return num1;
		else return num2;
	}
	
	/* Minimum 
	 * Returns the smaller of two arguments
	 * 
	 * @param		num1 	a float value
	 * @param		num2	a float value
	 * @return		the smaller of the two arguments
	 */
	public static float min(float num1, float num2) {
		if(num1 < num2) return num1;
		else return num2;
	}
	
	/* Minimum 
	 * Returns the smaller of two arguments
	 * 
	 * @param		num1 	a double value
	 * @param		num2	a double value
	 * @return		the smaller of the two arguments
	 */
	public static double min(double num1, double num2) {
		if(num1 < num2) return num1;
		else return num2;
	}
	
	/* Maximum 
	 * Returns the larger of two arguments
	 * 
	 * @param		num1 	an int value
	 * @param		num2	an int value
	 * @return		the smaller of the two arguments
	 */
	public static int max(int num1, int num2) {
		if(num1 > num2) return num1;
		else return num2;
	}
	
	/* Maximum 
	 * Returns the larger of two arguments
	 * 
	 * @param		num1 	a long value
	 * @param		num2	a long value
	 * @return		the smaller of the two arguments
	 */
	public static long max(long num1, long num2) {
		if(num1 > num2) return num1;
		else return num2;
	}
	
	/* Maximum 
	 * Returns the larger of two arguments
	 * 
	 * @param		num1 	a float value
	 * @param		num2	a float value
	 * @return		the smaller of the two arguments
	 */
	public static float max(float num1, float num2) {
		if(num1 > num2) return num1;
		else return num2;
	}
	
	/* Maximum 
	 * Returns the larger of two arguments
	 * 
	 * @param		num1 	a double value
	 * @param		num2	a double value
	 * @return		the smaller of the two arguments
	 */
	public static double max(double num1, double num2) {
		if(num1 > num2) return num1;
		else return num2;
	}
	
	/* Signum 
	 * Returns the signum function of the argument; 
	 * zero if the argument is zero, 
	 * 1.0 if the argument is greater than zero, 
	 * -1.0 if the argument is less than zero.
	 * 
	 * @param		num		an int value
	 * @return 		the signum of the value
	 */
	public static double signum(int num) {
		if(num < 0.0) return -1.0;
		else if (num > 0.0) return 1.0;
		else return 0;
	}
	
	/* Signum 
	 * Returns the signum function of the argument; 
	 * zero if the argument is zero, 
	 * 1.0 if the argument is greater than zero, 
	 * -1.0 if the argument is less than zero.
	 * 
	 * @param		num		a long value
	 * @return 		the signum of the value
	 */
	public static double signum(long num) {
		if(num < 0.0) return -1.0;
		else if (num > 0.0) return 1.0;
		else return 0;
	}
	
	/* Signum 
	 * Returns the signum function of the argument; 
	 * zero if the argument is zero, 
	 * 1.0 if the argument is greater than zero, 
	 * -1.0 if the argument is less than zero.
	 * 
	 * @param		num		a float value
	 * @return 		the signum of the value
	 */
	public static double signum(float num) {
		if(num < 0.0) return -1.0;
		else if (num > 0.0) return 1.0;
		else return 0;
	}
	
	/* Signum 
	 * Returns the signum function of the argument; 
	 * zero if the argument is zero, 
	 * 1.0 if the argument is greater than zero, 
	 * -1.0 if the argument is less than zero.
	 * 
	 * @param		num		a double value
	 * @return 		the signum of the value
	 */
	public static double signum(double num) {
		if(num < 0.0) return -1.0;
		else if (num > 0.0) return 1.0;
		else return 0;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	an int value
	 * @param		sign		an int value
	 * @return		magnitude with the sign of sign
	 */
	public static int copySign(int magnitude, int sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	an int value
	 * @param		sign		a long value
	 * @return		magnitude with the sign of sign
	 */
	public static int copySign(int magnitude, long sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	an int value
	 * @param		sign		a float value
	 * @return		magnitude with the sign of sign
	 */
	public static int copySign(int magnitude, float sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	an int value
	 * @param		sign		a double value
	 * @return		magnitude with the sign of sign
	 */
	public static int copySign(int magnitude, double sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a long value
	 * @param		sign		an int value
	 * @return		magnitude with the sign of sign
	 */
	public static long copySign(long magnitude, int sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a long value
	 * @param		sign		a long value
	 * @return		magnitude with the sign of sign
	 */
	public static long copySign(long magnitude, long sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a long value
	 * @param		sign		a float value
	 * @return		magnitude with the sign of sign
	 */
	public static long copySign(long magnitude, float sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a long value
	 * @param		sign		a double value
	 * @return		magnitude with the sign of sign
	 */
	public static long copySign(long magnitude, double sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a float value
	 * @param		sign		an int value
	 * @return		magnitude with the sign of sign
	 */
	public static float copySign(float magnitude, int sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a float value
	 * @param		sign		a long value
	 * @return		magnitude with the sign of sign
	 */
	public static float copySign(float magnitude, long sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a float value
	 * @param		sign		a float value
	 * @return		magnitude with the sign of sign
	 */
	public static float copySign(float magnitude, float sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a float value
	 * @param		sign		a double value
	 * @return		magnitude with the sign of sign
	 */
	public static float copySign(float magnitude, double sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a double value
	 * @param		sign		an int value
	 * @return		magnitude with the sign of sign
	 */
	public static double copySign(double magnitude, int sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a double value
	 * @param		sign		a long value
	 * @return		magnitude with the sign of sign
	 */
	public static double copySign(double magnitude, long sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a double value
	 * @param		sign		a float value
	 * @return		magnitude with the sign of sign
	 */
	public static double copySign(double magnitude, float sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* Copy Sign  
	 * Returns the first argument with the sign of the second argument
	 * 
	 * @param 		magnitude	a double value
	 * @param		sign		a double value
	 * @return		magnitude with the sign of sign
	 */
	public static double copySign(double magnitude, double sign) {
		if(sign < 0 && magnitude < 0) return magnitude;
		else if (sign < 0 && magnitude > 0) return -magnitude;
		else if (sign > 0 && magnitude < 0) return -magnitude;
		else return magnitude;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	an int value
	 * @param 	divisor		an int value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(int dividend, int divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	an int value
	 * @param 	divisor		a long value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(int dividend, long divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	an int value
	 * @param 	divisor		a float value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(int dividend, float divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	an int value
	 * @param 	divisor		a double value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(int dividend, double divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a long value
	 * @param 	divisor		an int value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(long dividend, int divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a long value
	 * @param 	divisor		a long value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(long dividend, long divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a long value
	 * @param 	divisor		a float value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(long dividend, float divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a long value
	 * @param 	divisor		a double value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(long dividend, double divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a float value
	 * @param 	divisor		an int value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(float dividend, int divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a float value
	 * @param 	divisor		a long value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(float dividend, long divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a float value
	 * @param 	divisor		a float value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(float dividend, float divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a float value
	 * @param 	divisor		a double value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(float dividend, double divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a double value
	 * @param 	divisor		an int value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(double dividend, int divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a double value
	 * @param 	divisor		a long value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(double dividend, long divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a double value
	 * @param 	divisor		a float value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(double dividend, float divisor) {
		return dividend % divisor;
	}
	
	/* IEEE Remainder 
	 * Returns the remainder of two arguments as prescribed by the IEEE 754 standard.
	 * 
	 * @param	dividend 	a double value
	 * @param 	divisor		a double value
	 * @return 	the remainder of the two values
	 */
	public static double IEEEremainder(double dividend, double divisor) {
		return dividend % divisor;
	}
	
	/* Rint 
	 * Returns the integer value that is closest in value to the argument.
	 * If the value passed as a parameter is halfway between two integers,
	 * it returns the closest even integer value to the argument.
	 * 
	 * @param 	num		a double value
	 * @return	num rounded to an int
	 */
	public static double rint(double num) {
		double num2 = num - (int) num;
		int numToInt = (int) num;
		if(num2 < 0.4) return (double) numToInt;
		else if (num2 == 0.5) {
			return Math.round(num / 2) * 2;
		}
		else {
			return num + (1.0 - num2);
		}
	}
	
	/* Log 
	 * Returns the natural logarithm (base e) of a double value.
	 * 
	 * @param 	num		a double value
	 * @return 	the base e logarithm of num
	 */
	public static double log(double num) {
		return StrictMath.log(num);
	}
	
	/* Log 10 
	 * Returns the base 10 logarithm of a double value.
	 * 
	 * @param 	num		a double value
	 * @return 	the base 10 logarithm of num
	 */
	public static double log10(double num) {
		return StrictMath.log10(num);
	}
	
	/* Log 1p 
	 * Returns the natural logarithm of the sum of the argument and 1
	 * 
	 * @param 	num		a double value
	 * @return 	the logarithm of the sum of the argument and 1
	 */
	public static double log1p(double num) {
		return StrictMath.log1p(num);
	}
	
	/* Ceil 
	 * Returns the smallest (closest to negative infinity) double value
	 * that is greater than or equal to the argument and is equal to an integer
	 * 
	 * @param 	num		a double value
	 * @return 	the closest double value greater or equal to the argument
	 */
	public static double ceil(double num) {
		return StrictMath.ceil(num);
	}
	
	/* Floor 
	 * Returns the largest (closest to positive infinity) double value
	 * that is less than or equal to the argument and is equal to an integer
	 * 
	 * @param 	num		a double value
	 * @return 	the greatest double value less than or equal to the argument
	 */
	public static double floor(double num) {
		return StrictMath.floor(num);
	}
	
	/* Get Exponent 
	 * Returns the unbiased exponent used in the representation of a double or float
	 * 
	 * @param 	num		a double value
	 * @return 	the unbiased exponent of the num
	 */
	public static int getExponent(double num) {
		return StrictMath.getExponent(num);
	}
	
	/* Hypotenuse 
	 * Returns the hypotenuse of the right triangle
	 * given the sides x and y
	 * 
	 * @param 	x		a double value
	 * @param 	y		a double value
	 * @return 	the hypotenuse of the triangle given sides x and y
	 */
	public static double hypot(double x, double y) {
		return StrictMath.hypot(x,y);
	}
	
	/* Next After 
	 * Returns the float number, 
	 * adjacent to the start in the direction 
	 * of the second argument direction.
	 * 
	 * @param 	start		a double value
	 * @param	direction	a double value
	 * @return 	the float number adjacent to the two directions
	 */
	public static double nextAfter(double start, double direction) {
		return StrictMath.nextAfter(start, direction);
	}
	
	/* Next After 
	 * Returns the float number, 
	 * adjacent to the start in the direction 
	 * of the second argument direction.
	 * 
	 * @param 	start		a float value
	 * @param	direction	a double value
	 * @return 	the float number adjacent to the two directions
	 */
	public static double nextAfter(float start, double direction) {
		return StrictMath.nextAfter(start, direction);
	}
	
	/* Next Down 
	 * Returns the floating point value that is adjacent 
	 * to num in the direction of negative infinity.
	 * 
	 * @param	num		a double value
	 * @return 	the floating point value adjacent to num in the direction of negative infinity
	 */
	public static double nextDown(double num) {
		return StrictMath.nextDown(num);
	}
	
	/* Next Down 
	 * Returns the floating point value that is adjacent 
	 * to num in the direction of negative infinity.
	 * 
	 * @param	num		a float value
	 * @return 	the floating point value adjacent to num in the direction of negative infinity
	 */
	public static double nextDown(float num) {
		return StrictMath.nextDown(num);
	}
	
	/* Next Up 
	 * Returns the floating point value that is contiguous 
	 * to num in the direction of positive infinity.
	 * 
	 * @param	num		a double value
	 * @return 	the floating point value contiguous to num in the direction of positive infinity
	 */
	public static double nextUp(double num) {
		return StrictMath.nextUp(num);
	}
	
	/* Next Up 
	 * Returns the floating point value that is contiguous 
	 * to num in the direction of positive infinity.
	 * 
	 * @param	num		a float value
	 * @return 	the floating point value contiguous to num in the direction of positive infinity
	 */
	public static double nextUp(float num) {
		return StrictMath.nextUp(num);
	}
	
	/* Round 
	 * Returns the closest long to the given argument num.
	 * 
	 * @param	num		a double value
	 * @return	the closest long to num
	 */
	public static long round(double num) {
		return StrictMath.round(num);
	}
	
	/* Round 
	 * Returns the closest long to the given argument num.
	 * 
	 * @param	num		a float value
	 * @return	the closest long to num
	 */
	public static long round(float num) {
		return StrictMath.round(num);
	}
	
	/* Scalb 
	 * Returns num times 2^scale
	 * 
	 * @param	num		a double value
	 * @param	scale	an int value
	 * @return	num*2^scale
	 */
	public static double scalb(double num, int scale) {
		return StrictMath.scalb(num, scale);
	}
	
	/* Scalb 
	 * Returns num times 2^scale
	 * 
	 * @param	num		a float value
	 * @param	scale	an int value
	 * @return	num*2^scale
	 */
	public static double scalb(float num, int scale) {
		return StrictMath.scalb(num, scale);
	}
	
	/* Ulp 
	 * Returns the size of an ulp of the argument. 
	 * An ulp, unit in the last place, 
	 * of a double value is the positive distance 
	 * between this floating-point value 
	 * and the double value next larger in magnitude.
	 * 
	 * @param 	num		a double value
	 * @return 	the size of an ulp of num
	 */
	public static double ulp(double num) {
		return StrictMath.ulp(num);
	}
	
	/* Ulp 
	 * Returns the size of an ulp of the argument. 
	 * An ulp, unit in the last place, 
	 * of a double value is the positive distance 
	 * between this floating-point value 
	 * and the double value next larger in magnitude.
	 * 
	 * @param 	num		a float value
	 * @return 	the size of an ulp of num
	 */
	public static double ulp(float num) {
		return StrictMath.ulp(num);
	}
	
	/* Is Odd 
	 * Returns true if the number is odd, false if its even.
	 * 
	 * @param 	num		an int value
	 * @return 	true if the number is odd, else returns false
	 */
	public static boolean isOdd(int num) {
		if(num % 2 == 1) return true;
		else return false;
	}
	
	/* Is Even 
	 * Returns true if the number is even, false if its odd.
	 * 
	 * @param 	num		an int value
	 * @return 	true if the number is even, else returns false
	 */
	public static boolean isEven(int num) {
		if(num % 2 == 0) return true;
		else return false;
	}
	
	/* Is Prime 
	 * Returns true if the number is prime, false if its composite.
	 * 
	 * @param 	num		a double value
	 * @return 	true if the number is prime, else returns false
	 */
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
		return isPrime;
	}
	
	/* Is Prime 
	 * Returns true if the number is composite, false if its prime.
	 * 
	 * @param 	num		a double value
	 * @return 	true if the number is composite, else returns false
	 */
	public static boolean isComposite(int num) {
		if(!isPrime(num)) return true;
		else return false;
	}
	
	/* Is Perfect 
	 * Returns true if the number is perfect, else returs false.
	 * 
	 * @param 	num		an int value
	 * returns 	true if num is perfect, else return false
	 */
	public static boolean isPerfect(int num) {
		int sum = 1; 
		 
	    for (int i = 2; i * i <= num; i++) { 
	        if (num % i==0) { 
	            if(i * i != num) sum = sum + i + num / i; 
	            else sum = sum + i; 
	        } 
	    }  
	    if (sum == num && num != 1) return true; 
	    else return false; 
	}
	
	/* Is Lucky 
	 * Returns true if the number is lucky (all digits are different),
	 * else returns false.
	 * 
	 * @param 	num		an int value
	 * @return	true if the number is lucky, else returns false
	 */
	public static boolean isLucky(int num) {
		boolean arr[]=new boolean[10]; 
        for (int i = 0; i < 10; i++) 
            arr[i] = false; 
      
        while (num > 0) { 
        	int digit = num % 10; 
            
            if (arr[digit]) return false; 
       
            arr[digit] = true; 
      
            num = num / 10; 
        } 
        return true; 
	}
	
	/* Digit Sum 
	 * Returns the sum of the digits of the number.
	 * 
	 * @param 	num		an int value
	 * @return 	the sum of the digits
	 */
	public static int digitSum(int num) {
		int sum = 0;
		while (num != 0) { 
            sum = sum + num % 10; 
            num = num/10; 
        } 
		return sum;
	}
	
	/* Digit Prod 
	 * Returns the product of the digits of the number.
	 * 
	 * @param 	num		an int value
	 * @return 	the product of the digits
	 */
	public static int digitProd(int num) {
		int product = 1; 
		while (num != 0) { 
            product = product * (num % 10); 
            num = num / 10; 
        } 
        return product; 
	}
	
	/* Is Divisible By Sum 
	 * Returns true if the number is divisible by the sum of its digits,
	 * else returns false.
	 * 
	 * @param 	num		a long value
	 * @return 	true if the number is divisible by the sum of its digits, else returns false
	 */
	public static boolean isDivisibleBySum(long num) {
		long temp = num;   
        int sum = 0;  
        while (num != 0) {  
            int k = (int) num % 10;  
            sum += k;  
            num /= 10;  
        }  
        if (temp % sum == 0) return true;  
        return false; 
	}
	
	/* Is Divisible By Digits 
	 * Returns true if the number is divisible by any of its digits,
	 * else returns false.
	 * 
	 * @param 	num		an int value
	 * @return 	true if the number is divisible by any of its digits, else returns false
	 */
	public static boolean isDivisibleByDigits(int num) {
		int temp = num; 
		  
        while (num > 0) { 
            int k = num % 10; 
            if (temp % k == 0) { 
                return true; 
            } 
            num /= 10; 
        } 
  
        return false;
	}
	
	/* Reverse Digits
	 * Reverses the digits of the number.
	 * 
	 * @param	num		an int value
	 * @return 	num with the digits reversed
	 */
	public static int reverseDigits(int num) {
		int revNum = 0; 
        while(num > 0) { 
            revNum = revNum * 10 + num % 10; 
            num = num / 10; 
        } 
        return revNum; 
	}
	
	/* Number Contains 
	 * Checks if a given number has another number inside it.
	 * 
	 * @param 	num		an integer value
	 * @param 	str		a String
	 * @return 	true if the number has the String inside of it, else return false
	 */
	public static boolean numberContains(int num, String str) {
		String sNum = Integer.toString(num);
		if(sNum.contains(str)) return true;
		else return false;
	}
	
	/* Number Contains 
	 * Checks if a given number has another number inside it.
	 * 
	 * @param 	num				an integer value
	 * @param 	numToBeFound	an integer value
	 * @return 	true if the first number has the second number inside of it, else return false
	 */
	private static boolean numberContains(int num, int numToBeFound) {
		String sNum = Integer.toString(num);
		String sStr = Integer.toString(numToBeFound);
		if(sNum.contains(sStr)) return true;
		else return false;
	}
	
	/* Available Constants 
	 * Returns a string of the available constants.
	 * 
	 * @return 		a string of the available constants
	 */
	public static String availableConsts() {
		return "Available constants:\n" +
				"    Avagadro's Constant/Number\n" +
				"    Boltzmann's Constant\n" +
				"    e\n" +
				"    Euler's Constant\n" +
				"    g\n" +
				"    Golden Ratio\n" +
				"    Maximum Values for:\n" +
				"\tByte  Double  Float  Int  Long  Short\n" +
				"    Minimum Values for:\n" +
				"\tByte  Double  Float  Int  Long  Short\n" +
				"    Pi\n" +
				"    Planck's Constant/Number\n" +
				"    Speed of Light (mph)\n" +
				"    Speed of Light (m/s)\n";
	}
	
	/* Available Methods 
	 * Returns a string of the available methods.
	 * 
	 * @return 		a string of the available methods
	 */
	public static String availableMethods() {
		return "Available methods:\n" +
				"    add\n" +
				"    addExact\n" +
				"    subtract\n" +
				"    subtractExact\n" +
				"    multiply\n" +
				"    multiplyExact\n" +
				"    multiplyFull\n" +
				"    divide\n" +
				"    mod\n" +
				"    IEEEremainder\n" +
				"    square\n" +
				"    sqrt\n" +
				"    cbrt\n" +
				"    findPythagA\n" +
				"    findPythagB\n" +
				"    findPythagC\n" +
				"    isOdd\n" +
				"    isEven\n" +
				"    isPrime\n" +
				"    isComposite\n" +
				"    isPerfect\n" +
				"    isLucky\n" +
				"    digitSum\n" +
				"    digitProd\n" +
				"    isDivisibleBySum\n" +
				"    isDivisibleByProd\n" +
				"    reverseDigits\n" +
				"    toDegrees\n" +
				"    toRadians\n" +
				"    sin\n" +
				"    cos\n" +
				"    tan\n" +
				"    csc\n" +
				"    sec\n" +
				"    cot\n" +
				"    asin\n" +
				"    acos\n" +
				"    atan\n" +
				"    sinh\n" +
				"    cosh\n" +
				"    tanh\n" +
				"    pow\n" +
				"    getExponent\n" +
				"    exp\n" +
				"    expm1\n" +
				"    random\n" +
				"    min\n" +
				"    max\n" +
				"    abs\n" +
				"    log\n" +
				"    log10\n" +
				"    log1p\n" +
				"    ceil\n" +
				"    floor\n" +
				"    signum\n" +
				"    copySign\n" +
				"    negateExact\n" +
				"    incrementExact\n" +
				"    decrementExact\n" +
				"    toDoubleExact\n" +
				"    toFloatExact\n" +
				"    toIntExact\n" +
				"    toLongExact\n" +
				"    rint\n" +
				"    floorDiv\n" +
				"    floorMod\n" +
				"    hypot\n" +
				"    quadratic\n" +
				"    nextAfter\n" +
				"    nextDown\n" +
				"    nextUp\n" +
				"    round\n" +
				"    scalb\n" +
				"    ulp\n" +
				"    numberContains\n" +
				"    availableConsts\n" +
				"    availableMethods\n" +
				"    printAvailableConsts\n" +
				"    printAailableMethods\n";
	}
	
	/* Print Available Constants 
	 * Prints the available constants.
	 */
	public static void printAvailableConsts() {
		System.out.print(availableConsts());
	}
	
	/* Print Available Methods 
	 * Prints the available Methods.
	 */
	public static void printAvailableMethods() {
		System.out.print(availableMethods());
	}
	
	/* Edition
	 * Returns the current edition of the code
	 * 
	 * @return		the current edition
	 */
	public static String edition() {
		return EDITION;
	}
	
	/* Print Edition
	 * Prints the current edition of the code
	 */
	public static void printEdition() {
		System.out.println(EDITION);
	}
}
