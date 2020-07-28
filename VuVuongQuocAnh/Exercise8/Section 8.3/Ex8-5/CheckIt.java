package hello;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class CheckIt {
    public static boolean checkIt(boolean a, boolean b, boolean c) {
        if (a && (b || c)) {
            System.out.println("P is true");
            return true;
        } else {
            System.out.println("P is false");
            return false;
        }
    }

    public static boolean checkItExpand(boolean a, boolean b, boolean c) {
        if (a) {
            System.out.println("a is true\n");
            if (b) {
                System.out.println("b is true\n");
                System.out.println("P is true\n");
                return true;
            } else {
                System.out.println("b is false\n");
                if (c) {
                    System.out.println("c is true\n");
                    System.out.println("P is true");
                    return true;
                }
                else {
                    System.out.println("c is false\n");
                    System.out.println("P is false");
                    return false;
                }
            }
        } else {
            System.out.println("a is false");
            System.out.println("P is false");
            return false;
        }
    }
}
