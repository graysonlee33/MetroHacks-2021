
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Main
{
    private Grades classA;
    private Scanner console;
    
    public Main()
    {
        classA = new Grades();
        console = new Scanner(System.in);
    }
    
    public void mainMenu()
    {
        int ans=0;
        do
        {
            System.out.println("======================");
            System.out.println(" Main Menu");
            System.out.println("======================");
            System.out.println("1. Calculate A New Grade");
            System.out.println("2. Exit");
            System.out.println();
            System.out.print("Selection --> ");
            ans = console.nextInt();
            System.out.println();
            if (ans == 1)
            {
                mockGrade();
            }
        }
        while(ans != 2);
    }
    
    public void adding()
    {
        int ans = 1;
        String name = "";
        double grade = 0;
        double weight = 0;
        do
        {
            System.out.println();
            System.out.print("Enter Assignment Name --> ");
            name = console.nextLine();
            console.nextLine();
            System.out.print("Enter Grade --> ");
            grade = console.nextDouble();
            console.nextLine();
            System.out.print("Enter Weight of Assignment (as in percentage) --> ");
            weight = console.nextDouble();
            console.nextLine();
            classA.addAssignment(name, grade, weight);
            classA.printGrades();
            System.out.println();
            System.out.print("Press 0 to exit (to continue press 1) --> " );
            ans = console.nextInt();
            System.out.println();
        } while (ans != 0);
    }
    
    public void mockGrade()
    {
        adding();
        int ans = 0;
        do
        {
            System.out.println("======================");
            System.out.println(" Mock Grade");
            System.out.println("======================");
            System.out.println();
            
            classA.printGrades();
            System.out.println();
            System.out.println("1. Continue Adding Grades");
            System.out.println("2. Clear Grades");
            System.out.println("3. Back to Menu");
            System.out.println("4. Exit Progam");
            System.out.println();
            System.out.print("Selection --> ");
            ans = console.nextInt();
            System.out.println();
            if (ans == 1)
            {
                adding();
            }
            if (ans == 2)
            {
                classA.clearGrades();
                adding();
            }
            if (ans == 3)
            {
                mainMenu();
            }
            if (ans == 4)
            {
                System.exit(0);
            }
        } while (ans != 4);
    }
    
    
    public static void main(String[] args)
    {
        Main a = new Main();
        a.mainMenu();
    }
}
