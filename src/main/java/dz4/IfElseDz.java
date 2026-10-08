package dz1and2;

import java.util.Scanner;



public class IfElseDz {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        task1IfPlusMinus();

        task2IfMax();

        task3IfGrade();

        task4IfParity();

        task5IfDiscount();


    }


    public static void task1IfPlusMinus() {
        System.out.println("Введите число");
        int x = Integer.parseInt(scanner.nextLine());


        if (x > 0) {
            System.out.println("Число положительное");
        } else if (x < 0) {
            System.out.println("Число отрицательное");
        } else System.out.println("Число равно нулю");

    }


    public static void task2IfMax() {
        System.out.println("Введите число a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите число b");
        int b = Integer.parseInt(scanner.nextLine());

        if (a > b) {
            System.out.println("Наибольшее число = " + a);
        } else if (b > a) {
            System.out.println("Наибольшее число = " + b);

        } else
            System.out.println("Вы ввели равные числа");
    }

    public static void task3IfGrade() {
        System.out.println("Введите число от 1 до 5");
        int x = Integer.parseInt(scanner.nextLine());
        switch (x) {
            case 1, 2: {
                System.out.println("Неудовлетворительно");
                break;
            }

            case 3: {
                System.out.println("Удовлетворительно");
                break;
            }

            case 4: {
                System.out.println("Хорошо");
                break;
            }

            case 5: {
                System.out.println("Отлично");
                break;
            }

            default: {
                System.out.println("Вы ввели некорректное число");
                break;
            }


        }
    }

    public static void task4IfParity() {
        System.out.println("Проверка на четность. Введите число");
        int a = Integer.parseInt(scanner.nextLine());
        if (a % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else
            System.out.println("Вы ввели нечетное число");
    }


    public static void task5IfDiscount() {
        System.out.println("Введите возраст");
        int a = Integer.parseInt(scanner.nextLine());

        if (a < 18) {
            System.out.println("Ваша скидка 25%");
        } else if (a > 65) {
            System.out.println("Ваша скидка 30%");
        } else {
            System.out.println("Вашей возрастной категории скидка недоступна");
        }
    }

    public static void task6IfGrade2() {
        System.out.println("Введите результат теста в баллах 1-100");
        int a = Integer.parseInt(scanner.nextLine());
        if (a >= 90) {
            System.out.println("Отлично");
        } else if (a >= 75) {
            System.out.println("Хорошо");
        } else if (a >= 60) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

    public static void task1SwitchWeek() {
        System.out.println("Введите номер дня недели");
        int a = Integer.parseInt(scanner.nextLine());

        switch (a) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;
            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6: {
                System.out.println("Суббота");
                break;
            }
            case 7: {
                System.out.println("Воскресенье");
                break;
            }
            default: {
                System.out.println("В неделе 7 дней. Введите 1-7");
                break;
            }
        }

        public static void task2SwitchWeekDiscount () {
            System.out.println("Введите номер дня недели");
            int a = Integer.parseInt(scanner.nextLine());

            switch (a) {
                case 1, 2, 3, 4, 5: {
                    System.out.println("300r");
                    break;
                }
                case 6, 7: {
                    System.out.println("450r");
                    break;
                }
                default: {
                    System.out.println("В неделе 7 дней. Введите 1-7");
                    break;
                }
            }


        }

    }

}














