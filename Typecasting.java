public class Typecasting {
    public static void main(String[] args) {

        // remember the left side should be greater than the right side in order to type caste any variable
        float a = 65.69f;
        int b = (int)(a);
//        System.out.println(b);

        // a byte can store maximum value 256. if the value of typecasting variable is greater than 256 then it will return its remainder. in this case, 257 % 256 = 1
        int c = 257;
        byte d = (byte)(c);

//        System.out.println(d);

        // java promotes the data type while doing some operations using different data types
        byte x = 42;
        char y = 'd';
        short s = 1024;
        int i = 50000;
        float f = 69.69f;
        double t = 78.62;
        double result = (x*y) + (i*s) - f + t;

        System.out.println(result);
    }
}
