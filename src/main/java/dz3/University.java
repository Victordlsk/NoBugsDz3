package dz3;

public class University
{


    public static void main(String[] args) {
        University st1 = new University(1, "Алексей");
        University st2 = new University(2, "Евгений");
        University st3 = new University(3, "Игнат");

        changeUniversityName("Университет 1");

        System.out.println("До изменения");

        st1.printStudentInfo();
        st2.printStudentInfo();
        st3.printStudentInfo();

        changeUniversityName("Университет 2");

        System.out.println("После изменения");


        st1.printStudentInfo();
        st2.printStudentInfo();
        st3.printStudentInfo();


    }




    static String universityName;
    private final int studentID;
    private String studentName;

    public University (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {

        universityName = newName;
    }
    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public void printStudentInfo() {
        System.out.println("Имя студента - " + studentName + " Номер студента - " + studentID + " Название университета - " + universityName);
    }
}
