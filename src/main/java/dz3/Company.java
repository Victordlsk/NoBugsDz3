package dz3;

public class Company {

    public static void main(String[] args) {
        Company emp1 = new Company(1, "Петя");
        Company emp2 = new Company(2, "Вася");

        companyName = "Агуша";

        emp1.printEmployeeinfo();
        emp2.printEmployeeinfo();

        companyName = "Эпл";

        emp1.printEmployeeinfo();
        emp2.printEmployeeinfo();

        //emp1.employeeID = 3;// проверка невозможности изменения final-поля
    }

    static String companyName;
    private final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println(companyName);
    }
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void printEmployeeinfo() {
        System.out.println("Номер сотрудника - " + employeeID + " Имя сотрудника - " + employeeName + " Имя компании - " + companyName);
    }

}
