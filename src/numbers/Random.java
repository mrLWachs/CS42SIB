
/** required package class namespace */
package numbers;

/**
 * Random.java - useful tools for generating random items
 * @author Mr. Wachs 
 * @since Dec 1, 2016
 * @instructor Mr. Wachs
 */
public class Random 
{

    /**
     * Generates a random number inside a range
     * 
     * @param low the lowest possible random number
     * @param high the highest possible random number
     * @return random number in the range
     */
    public static double generate(double low, double high) {
        double seed   = Math.random();
        double random = (high - low + 1) * seed + low;
        return random;
    }
    
    /**
     * Generates a random boolean
     * 
     * @return true or false
     */
    public static boolean generate() {
        return generate(0,1) == 0;
    }
    
    /**
     * Generates a random number inside a range
     * 
     * @param low the lowest possible random number
     * @param high the highest possible random number
     * @return random number in the range
     */
    public static int generate(int low, int high) {
        return (int)generate((double)low, (double)high);
    }

    /**
     * Generates a random character inside a range
     * 
     * @param low the lowest possible random character
     * @param high the highest possible random character
     * @return random character in the range
     */
    public static char generate(char low, char high) {
        return (char)generate((int)low, (int)high);
    }
    
    /**
     * Generates a random String inside a range
     * 
     * @param length the length of the string to generate
     * @param low the lowest possible random character
     * @param high the highest possible random character
     * @return random String in the range
     */
    public static String generate(int length, char low, char high) {
        String word = "";
        for (int i = 0; i < length; i++) {
            word += generate(low,high);
        }
        return word;
    }
    
    /**
     * Generates a random String of a set length
     * 
     * @param length the length of the string to generate
     * @return a random string of set length
     */
    public static String generate(int length) {
        return generate(length,'a','z');
    }
    
    /**
     * Generates a random array of booleans
     * 
     * @param array the initial sized array
     * @return a random array of booleans
     */
    public static boolean[] generate(boolean array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generate();
        }
        return array;
    }
    
    /**
     * Generates a random array of integers inside a range
     * 
     * @param array the initial sized array
     * @param low the lowest possible random number
     * @param high the highest possible random number
     * @return a random array of integers inside a range
     */
    public static int[] generate(int array[], int low, int high) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generate(low, high);
        }
        return array;
    }
    
    /**
     * Generates a random array of integers between 0 and the array length
     * 
     * @param array the initial sized array
     * @return a random array of integers 
     */
    public static int[] generate(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generate(0, array.length-1);
        }
        return array;
    }
    
    /**
     * Generates a random array of doubles inside a range
     * 
     * @param array the initial sized array
     * @param low the lowest possible random number
     * @param high the highest possible random number
     * @return a random array of doubles inside a range
     */
    public static double[] generate(double array[], double low, double high) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generate(low, high);
        }
        return array;
    }
    
    /**
     * Generates a random array of doubles between 0 and the array length
     * 
     * @param array the initial sized array
     * @return a random array of doubles 
     */
    public static double[] generate(double array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generate(0d,(double)(array.length-1));
        }
        return array;
    }
    
    /**
     * Generates a random array of characters inside a range
     * 
     * @param array the initial sized array
     * @param low the lowest possible random character
     * @param high the highest possible random character
     * @return a random array of characters inside a range
     */
    public static char[] generate(char array[], char low, char high) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generate(low, high);
        }
        return array;
    }
    
    /**
     * Generates a random array of characters between 'a' and 'z'
     * 
     * @param array the initial sized array
     * @return a random array of characters 
     */
    public static char[] generate(char array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generate('a','z');
        }
        return array;
    }
    
    /**
     * Generates a random array of strings inside a range
     * 
     * @param array the initial sized array
     * @param length the length of each string to generate
     * @param low the lowest possible random character
     * @param high the highest possible random character
     * @return a random array of strings inside a range
     */
    public static String[] generate(String array[], int length, 
                                    char low, char high) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generate(length, low, high);
        }
        return array;
    }
    
    /**
     * Generates a random array of Booleans
     * 
     * @param length the length of the array to generate
     * @return a random array of Booleans 
     */
    public static Boolean[] generateBooleans(int length) {
        Boolean[]  a = new Boolean[length];
        for (int i = 0; i < length; i++) {
            a[i] = generate();
        }
        return a;
    }
    
    /**
     * Generates a random array of integers between 0 and the array length
     * 
     * @param length the length of the array to generate
     * @return a random array of integers 
     */
    public static Integer[] generateIntegers(int length) {
        Integer[]  a = new Integer[length];
        for (int i = 0; i < length; i++) {
            a[i] = generate(0, length);
        }
        return a;
    }
    
    /**
     * Generates a random array of doubles between 0 and the array length
     * 
     * @param length the length of the array to generate
     * @return a random array of doubles 
     */
    public static Double[] generateDoubles(int length) {
        Double[]  a = new Double[length];
        for (int i = 0; i < length; i++) {
            a[i] = generate(0d, (double)length);
        }
        return a;
    }
    
    /**
     * Generates a random array of Characters between 'a' and 'z'
     * 
     * @param length the length of the array to generate
     * @return a random array of Characters 
     */
    public static Character[] generateCharacters(int length) {
        Character[]  a = new Character[length];
        for (int i = 0; i < length; i++) {
            a[i] = generate('a','z');
        }
        return a;
    }
    
    /**
     * Generates a random array of strings with words randomly generated 
     * between 'a' and 'z'
     * 
     * @param arrayLength the length of the array to generate
     * @param wordLength the length of each string to generate
     * @return a random array of strings 
     */
    public static String[] generateStrings(int arrayLength, int wordLength) {
        String[]  a = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            a[i] = generate(wordLength,'a','z');
        }
        return a;
    }  
    
}
