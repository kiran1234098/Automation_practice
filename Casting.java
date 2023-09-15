public class Casting {
    public static void main(String[] args) {
        /* int to other types
           size widening casting */

        int myInt = 9;
        double int_to_double = myInt; // Automatic Casting: int to double
        float int_to_float = myInt;
        long int_to_long = myInt;
        System.out.println("int: " + myInt + "\nint to double: " + int_to_double + "\nint to float: " + int_to_float + "\nint to long: " + int_to_long);

        /* char to bigger size
           widening casting */

        char myChar = 'a';
        int char_to_int = myChar;
        float char_to_float = myChar;
        long char_to_long = myChar;
        double char_to_double = myChar;

        System.out.println("char: " + myChar + "\nchar to int: " + char_to_int + "\nchar to float: " + char_to_float + "\nchar to long: " + char_to_long + "\nchar to double: " + char_to_double);

        /* byte to other types
           widening casting */

        byte myByte = 10;
        short byte_to_short = myByte;
        char byte_to_char = (char) myByte;
        int byte_to_int = myByte;
        long byte_to_long = myByte;
        float byte_to_float = myByte;
        double byte_to_double = myByte;

        /*
           narrowing casting 
           manually by casting
           using parentheses
         */

         double myDouble = 9.78d;
         int myDouble_to_int = (int) myDouble;
         float double_to_float = (float) myDouble;
         long double_to_long = (long) myDouble;
         char double_to_char = (char) myDouble;
         short double_to_short = (short) myDouble;
         byte double_to_byte = (byte) myDouble;

         System.out.println("double is: " + myDouble + "\ndouble to int: " + myDouble_to_int + "\ndouble to float: " + double_to_float + "\ndouble to char: " + double_to_char + "\ndouble to long: " + double_to_long + "\ndouble to byte: " + double_to_byte + "\ndouble to short: " + double_to_short);
    }
}
