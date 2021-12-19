import java.util.Calendar;

public class printf {
    public static void main(String[] args) {

        int num = 70;
        char per = '%';
        String s = "water";

        System.out.printf("Human are, %d%c %s %n", num, per, s);
    
        // Convertion type characters

        System.out.printf("%d", 10 ); // integer
        System.out.println("");

        System.out.printf("%f",10.1); // floating point
        System.out.println("");

        System.out.printf("%c",'j'); // character (lower case)
        System.out.println("");

        System.out.printf("%C",'j'); // character (upper case)
        System.out.println("");

        System.out.printf("%s","hello"); // string (lower case)
        System.out.println("");

        System.out.printf("%S","hello"); // string (upper case)
        System.out.println("");

        System.out.printf("%b",2 < 4); // bolean (lower case)
        System.out.println("");

        System.out.printf("%B",2 < 4); // bolean (upper case)
        System.out.println("");

        System.out.printf("%b","none conditional statement"); // bolean (lower case, return true) 
        System.out.println("");

        System.out.printf("%e", 10.123); // scientific notation (lower case)
        System.out.println("");

        System.out.printf("%E", 10.123); // scientific notation (upper case)
        System.out.println("");
        
        System.out.printf("%g", 100.0); // depends on magnitude and precision thing (lower case)
        System.out.println("");

        System.out.printf("%G", 1000000.0); // depends on magnitude and precision thing (upper case)
        System.out.println("");

        System.out.printf("%o", 10 ); // octal 
        System.out.println("");

        System.out.printf("%x", 10 ); // hexadecimal (lower case)
        System.out.println("");

        System.out.printf("%X", 10 ); // hexadecimal (upper case)
        System.out.println("");

        System.out.printf("%h", "hello" ); // hashcode (lower case)
        System.out.println("");
        
        System.out.printf("%H", "hello" ); // hashcode (upper case)
        System.out.println("");
        
        System.out.printf("%a", 10.24 ); // hexadecimal floating point (lower case)
        System.out.println("");

        System.out.printf("%a", 10.24 ); // hexadecimal floating point (lower case)
        System.out.println("");

        Calendar cal01 = Calendar.getInstance();
        System.out.printf("%tB" , cal01);     // 
        System.out.println("");

        Calendar cal02 = Calendar.getInstance();
        System.out.printf("%TB" , cal02);     // 
        System.out.println("");

        System.out.println("%n"); // new line like \n

        System.out.println("%%"); // to print %


    }
}
