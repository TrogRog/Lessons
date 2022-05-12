package MyLessons.Lesson7;

public class Targets {
    public static void overOdd(double x) {
        if (x == (int) x) {
            if (x % 2 == 0) {
                System.out.println("Значемние " + x + " четное");
            } else {
                System.out.println("Значемние " + x + " нечетное");
            }
        } else {
            System.out.println("ошибка, введено не целое чисто");
        }
    }

    public static int blink(int r, int n) {
        int i = 1;
        while (i < n + 1) {
            r = ~r;
            System.out.println("Лампочки_моргают  = " + Integer.toBinaryString(r));
            i++;
        }
        return r;

    }

    public static int run(int r, int m) {
        int i = 1;
        while (i < m + 1) {
            r = r >> 1;
            System.out.println("Лампочки_движ  = " + Integer.toBinaryString(r));
            i++;
        }
        return r;
    }

    public static int isFirstLampOn(int r) {
        int mask = 0b00000001;
        int q = mask & r;
        if (q == 1) {
            System.out.println("Лампочки - " + Integer.toBinaryString(r) + " - Первая лампочка горит");
        } else {
            System.out.println("Лампочки - " + Integer.toBinaryString(r) + " - Первая лампочка не горит");
        }
        return r;
    }

    public static int info(int r) {
        System.out.println(Integer.toBinaryString(r));
        return r;
    }

    public static void min(int a, int b, int c) {
        int d = Math.abs(a) < Math.abs(b) ? a : b;
        d = Math.abs(c) < Math.abs(d) ? c : d;
        System.out.println("Мин.знач.мод.= " + d);
    }
}
