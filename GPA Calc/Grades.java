
/**
 * Write a description of class Grades here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Grades
{
    private ArrayList<Assignment> grades;
    
    public Grades()
    {
        grades = new ArrayList<>();
    }
    
    public void addAssignment(String assignmentName, double grade, double weight)
    {
        grades.add(new Assignment(assignmentName, grade, weight));
    }
    
    public double calculateNewGrade()
    {
        double newGrade = 0;
        for (int i = 0; i < grades.size(); i++)
        {
            newGrade+=grades.get(i).getGrade() * grades.get(i).getWeight();
        }
        int sum = 0;
        for (int r = 0; r < grades.size(); r++)
        {
            sum+=grades.get(r).getWeight();
        }
        newGrade/=sum;
        return newGrade;
    }
    
    public void clearGrades()
    {
        grades.clear();
    }
    
    public void printGrades()
    {
        System.out.println("======================");
        System.out.println(" Current Grades");
        System.out.println("======================");
        System.out.println();
        for (int i = 0; i < grades.size(); i++)
        {
            System.out.println(grades.get(i).getName() + grades.get(i).toString());
        }
        System.out.println();
        System.out.println("New Grade:");
        System.out.println(calculateNewGrade());
    }
}
