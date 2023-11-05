public class simple {
    public static void main (String[] args) {
        System.out.println("Тренировка с операторами");
        byte num0 = 100;
        byte num1 = 75;
        byte num2 = 50;
        byte num3 = 25;
        byte num4 = 0;
        System.out.println("num0 + num1 = " + (num0 + num1));
        System.out.println("num3 + num0 = " + (num3 - num0));
        System.out.println("num0 * num4 = " + (num0 * num4));
        System.out.println("num2 / num2 = " + (num2 / num2));
        System.out.println("num1 % num2 = " + (num1 % num3));
        System.out.println("num4++ = " + (num4++));
        System.out.println("++num4 = " + (++num4));
        System.out.println("num0++ = " + (num0++));
        System.out.println("num0++ = " + (num0++));
        System.out.println("++num0 = " + (++num0));
        System.out.println("num3-- = " + (num3--));
        System.out.println("--num3 = " + (--num3));

        System.out.println();
        System.out.println("Вычисления типов данных int и double");

        int a = 10;
        double b = 12.5;

        if (a > b) {
            System.out.println("a + b = " + a + b);
        }
        else {
            System.out.println("b / a = " + b / a);
        }
        System.out.println("a + b = " + a + b);
        System.out.println("a + b = " + a * b);
        System.out.println("b++ = " + b++);
        System.out.println("++b = " + ++b);
        System.out.println("b-- = " + b--);
        System.out.println("--b = " + --b);
    }
}
