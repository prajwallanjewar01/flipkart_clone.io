public class type_conversion {

    public static void main(String[] args) {

        System.out.println("\n FROM SMALLER TO BIGGER\n");
        // FROM SMALLER TO BIGGER
        byte a = 10;
        System.out.println("a - " + a);
        int b = a; // byte is automatically converted to int
        System.out.println("b - " + b);

        short c = 100;
        System.out.println("c - " + c);
        long d = c; // short is automatically converted to long
        System.out.println("d - " + d);
        int e = 500;
        System.out.println("e - " + e);
        float f = e; // int is automatically converted to float
        System.out.println("f - " + f);
        double g = f; // float is automatically converted to double
        System.out.println("g - " + g);

        System.out.println("\n\n\n FROM BIGGER TO SMALLER\n");
        // FROM BIGGER TO SMALLER

        double aa = 9.99;
        System.out.println("aa - " + aa);
        float bb = (float) aa; // double to float (explicit casting required)
        System.out.println("bb - " + bb);
        long cc = 100000L;
        System.out.println("cc - " + cc);
        int dd = (int) cc; // long to int (explicit casting required)
        System.out.println("dd - " + dd);
        float ee = 10.5f;
        System.out.println("ee - " + ee);
        int ff = (int) ee; // float to int (explicit casting required, decimal part will be truncated)
        System.out.println("ff - " + ff);
        double gg = 123.45;
        System.out.println("gg - " + gg);
        int hh = (int) gg; // double to int (explicit casting required, decimal part will be truncated)
        System.out.println("hh - " + hh);

    }
}