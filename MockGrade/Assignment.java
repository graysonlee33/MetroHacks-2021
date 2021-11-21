
/**
 * Write a description of class Assignment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assignment
{
    private String assignmentName;
    private double grade;
    private double weight;
    
    public Assignment(String assignmentName, double grade, double weight)
    {
        this.assignmentName = assignmentName;
        this.grade = grade;
        this.weight = weight;
    }
    
    public String getName()
    {
        return assignmentName;
    }
    
    public double getGrade()
    {
        return grade;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String toString()
    {
        return assignmentName + ": " + grade + " (" + weight + ")";
    }
}
