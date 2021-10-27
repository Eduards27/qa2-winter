package basics;

import org.junit.jupiter.api.Test;

public class MyFirstJavaClass {
    private int sumTwoDigits(int a, int b) {
        //  int someDigit = null;
        //  Integer otherDigit = null;
        int c = a + b;
        return c;
    }

    public String toString() {
        return super.toString();
    }

    public int minus(int a, int b) {
        // int c = a - b;
        return a - b;
    }

    @Test
    public void test() {
        int a = sumTwoDigits(7, 13);
        int b = sumTwoDigits(45, 132);
        int c = sumTwoDigits(100, 55);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }



        }



