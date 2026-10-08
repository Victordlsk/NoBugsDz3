public class ClassAndObjects {


    public static void main(String[] args) {
        Car car1 = new Car("Audi", 2003);
        car1.setYear(2005);
        car1.print();


        Rectangle rectangle1 = new Rectangle(5,6);
        rectangle1.setWidth(7);
        System.out.println("Площадь прямоугольника = " + rectangle1.calculateArea());

        Book book1 = new Book("Д12", "Вова");
        book1.setAuthor("Гриша");
        book1.printInfo();

        BankAccount acc1 = new BankAccount("Миша", 0);
        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.printBalance();

        Point point1 = new Point(2,3);
        point1.setX(4);
        point1.print();


        StudentGroup group1 = new StudentGroup("КЭ-18-01", 10);
        group1.setStudentCount(12);
        group1.printInfo();


        Circle circle1 = new Circle(4);
        circle1.setRadius(5);
        System.out.println("Длина окружности = " + circle1.calculateCircumference());
        System.out.println("Площадь = " + circle1.calculateArea());


        Teacher teacher1 = new Teacher("Анна", "Математика");
        teacher1.setSubject("Биология");
        teacher1.printInfo();

        Product product1 = new Product("Колбаса", 10);
        product1.setPrice(100);
        product1.applyDiscount(90);
        product1.printInfo();

        Laptop laptop1 = new Laptop("Асус", 100);
        laptop1.setPrice(200);
        laptop1.printInfo();


    }




}

class Car {

    private String brand;
    private int year;

    public Car (String brand, int year){
        this.brand = brand;
        this.year = year;

    }

    public void print() {
        System.out.println("Год = " + year + " " + "Модель = " + brand);
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand () {
        return brand;
    }

    public int getYear () {
        return year;
    }

}


class Rectangle{
    private int width;
    private int height;
    public Rectangle (int width, int height){
        this.width = width;
        this.height = height;

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth () {
        return width;
    }

    public int getHeight () {
        return height;
    }

    public int calculateArea() {
        return height * width ;
    }


}

class Book {

    private String title;
    private String author;


    public Book (String title, String author){
        this.title = title;
        this.author = author;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor () {
        return author;
    }

    public String getTitle () {
        return title;
    }

    public void printInfo() {
        System.out.println("Название книги - " + title + " " + "Автор - " + author);
    }



}


class BankAccount{

    private String owner;
    private int balance;

    public BankAccount (String owner, int balance){
        this.owner = owner;
        this.balance = balance;

    }

    public String getOwner () {
        return owner;
    }

    public int getBalance () {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(int amount){
        this.balance = balance + amount;
    }

    public void withdraw(int amount){
        this.balance = balance - amount;
    }

    public void printBalance(){
        System.out.println("Баланс счета = " + balance);
    }


}

class Point {
    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void print(){
        System.out.println("Координаты x = " + x + " " + "Координаты y = " + y);
    }
}


class StudentGroup {

    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;

    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo(){
        System.out.println("Группа = " + groupName + " " + "Количество студентов = " + studentCount);
    }
}

class Circle {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }


    public double calculateArea(){
        return Math.PI * radius*radius;
    }


}

class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void printInfo(){
        System.out.println("Имя учителя " + name + " " + "Предмет = " + subject);
    }
}

    class Product {

        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;

        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void applyDiscount(int discount) {
            this.price = price - (price * discount/100);
        }

        public void printInfo(){
            System.out.println("Товар = " + name + " " + "Стоимость = " + price);
        }

    }


class Laptop {

    private String brand;
    private int price;

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;

    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
    public void printInfo(){
        System.out.println("Ноутбук = " + brand + " " + "Стоимость = " + price);
    }
}















