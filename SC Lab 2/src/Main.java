import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Student waleed = new Student("Waleed Ahmed", 232093);
        Student abdullah = new Student("Abdullah Qureshi", 12326);

        waleed.addGrade(85.0);
        waleed.addGrade(87.5);
        waleed.addGrade(62.0);

        abdullah.addGrade(78.0);
        abdullah.addGrade(82.5);
        abdullah.addGrade(95.0);

        waleed.displayStudentInfo();
        System.out.println();

        abdullah.displayStudentInfo();
    }
}
