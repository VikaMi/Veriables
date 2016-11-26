import static jdk.nashorn.internal.parser.TokenType.CONST;

public class Main {

    static byte b = 5;//128, 8b
    static short sh = 8;//32000-33000, 16b
    static int it = 99; // 3 ml, 32b
    static long l = 789; // 64b

    static float f1 = 2.6f;//32b
    static double db = 2.6;//64b

    static boolean bool1 = true;
    static boolean bool2 = false;

    static String st = "hello, Vika";// є тільки у ссилочних типах
    static char c = 'd';



    /*public static void main(String[] args) {

        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("int: " + it);
        System.out.println("long: " + l);

        System.out.println("float: " + f1);
        System.out.println("double: " + db);

        System.out.println("boolean1: " + bool1);
        System.out.println("boolean2: " + bool2);

        System.out.println(st);
        System.out.println(c);

    }
    */
        static final int CONST = 55;

        public static void main(String[] args) {
        System.out.println(CONST);

        }






}
