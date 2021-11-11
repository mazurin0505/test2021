public class SecondProgram {

    int arg1, arg2;

    long summa = summa(5, 7);
        System.out.println(summa);

    long resultOfMinus = minus(18, 17);
        System.out.println(resultOfMinus);

    long result = multiplyAndSumma(7);
        System.out.println(result);

    public static long summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;

    }
    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }
    public static long multiplyAndSumma(int arg1) {
        int result = 5 * arg1 + 11;
        result = result - 9;
        return result;
    }

}
