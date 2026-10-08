package dz3;

public class MathConstants {

    public static void main(String[] args) {

        System.out.println("Площадь круга = " + calculateCircleArea(4) + " Длина окружности = " + calculateCircumference(4));
        System.out.println("Площадь круга = " + calculateCircleArea(5) + " Длина окружности = " + calculateCircumference(5));

        System.out.println("Экспоненциальный рост = " + calculateExponentialGrowth(1,2,4));
        System.out.println("Экспоненциальный рост с другими значениями = " + calculateExponentialGrowth(1,4,5));
    }

    final double PI = 3.14159;
    final double E = 2.71828;

    public static MathConstants kr1 = new MathConstants();


   public static double calculateCircleArea(double r) {
       return kr1.PI * r *r;
   }

    public static double calculateCircumference(double r) {
       return 2* kr1.PI * r;
    }

    public static double calculateExponentialGrowth(double initialValue, double rate, double time) {

      return initialValue * Math.pow(kr1.E, rate*time);

    }



}
