public class MathOperations {


    public static void main(String[] args) {
        System.out.println("Ответ на задание 1. сумма - " + add(2, 2));
        System.out.println("Ответ на задание 1. разница - " + subtract(2, 2));
        System.out.println("Ответ на задание 1. произведение - " + multiply(3, 2));
        System.out.println("Ответ на задание 1. деление - " + divide(19, 2));

        System.out.println("Ответ на задание 2. Наибольшее значение = " + findMax(4, 5));

        System.out.println("Ответ на задание 3: " + difference(2, -1));

        System.out.println("Ответ на задание 4 площадь: " + squareArea(5));
        System.out.println("Ответ на задание 4 периметр: " + squarePerimeter(6));

        System.out.println("Ответ на задание 5: " + convertSecondsToMinutes(180));

        System.out.println("Ответ на задание 6: " + averageSpeed(180, 3));

        System.out.println("Ответ на задание 7: " + findHypotenuse(4, 3));

        System.out.println("Ответ на задание 8: " + circleCircumference(5));

        System.out.println("Ответ на задание 9: " + calculatePercentage(200, 25));

        System.out.println("Ответ на задание 10: перевод в Фаренгейты " + celsiusToFahrenheit(20));
        System.out.println("Ответ на задание 10: перевод в Цельсий " + fahrenheitToCelsius(451));


    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return x / (double) y;
    }


    public static int findMax(int a, int b) {

        if (a > b) {
            return a;
        } else if (b > a) {
            return b;

        } else
            return a;
    }


    public static int difference(int x, int y) {

        return Math.abs(x - y);
    }


    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }


    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }


    public static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }


}










