import java.util.Scanner;

public class Student
{
    private final String name;
    private final int studentID;
    private final double[] grades;
    private int gradeCount;

    public Student(String studentName, int id)
    {
        name = studentName;
        studentID = id;
        grades = new double[10];
        gradeCount = 0;
    }

    public void addGrade(double grade)
    {
        if (gradeCount < grades.length)
        {
            grades[gradeCount] = grade;
            gradeCount++;
        } else
        {
            System.out.println("More grades can't be added.");
        }
    }

    public double calculateAverage()
    {
        if (gradeCount == 0) return 0.0;
        double sum = 0;
        for (int i = 0; i < gradeCount; i++) sum += grades[i];
        return sum / gradeCount;
    }

    public String getName()
    {
        return name;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public void displayStudentInfo()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Enrollment: " + studentID);
        System.out.println("Number of grades: " + gradeCount);
        System.out.println("Average grade: " + String.format("%.2f", calculateAverage()));
        System.out.println("Letter grade: " + getLetterGrade());
    }

    public char getLetterGrade()
    {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else if (avg >= 50) return 'E';
        else return 'F';
    }
}
