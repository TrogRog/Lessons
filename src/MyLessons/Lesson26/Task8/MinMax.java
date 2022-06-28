package MyLessons.Lesson26.Task8;

import java.util.Arrays;

public class MinMax<T extends Comparable> {
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public T getMax() {
        T max = arr[0];
        for (T ar : arr) {
            if (ar.compareTo(max) > 0) {
                max = ar;
            }
        }
        return max;
    }

    public T getMin() {
        T min = arr[0];
        for (T ar : arr) {
            if (ar.compareTo(min) < 0) {
                min = ar;
            }
        }
        return min;
    }
    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinMax<?> minMax = (MinMax<?>) o;
        return Arrays.equals(arr, minMax.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        return "Массив =" + Arrays.toString(arr);
    }

    public static void printMinMaxInfo(MinMax<?> arr) {
        System.out.println(arr);
        arr.toString();
        System.out.println("Min значение: " + arr.getMin());
        System.out.println("Max значение: " + arr.getMax());
    }

    public static void main(String[] args) {
        MinMax<Integer> first = new MinMax<>(new Integer[]{5, 4, 8, 2, 11, 6});
        printMinMaxInfo(first);

    }
}
