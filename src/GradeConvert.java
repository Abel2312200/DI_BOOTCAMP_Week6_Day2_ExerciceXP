import java.util.Scanner;

public class GradeConvert {
    public static void main(String[] args) {
        // declaration global variables
        Scanner se = new Scanner(System.in);
        int points ;
        String letterGrade;

        // retrieve points
        System.out.print("Please enter your points : ");
        points = se.nextInt();

        // convert point in GPA
        if(points < 0 || points > 100){
            System.out.println("Error points no valid");
        }else {
            // compute the grade
            if (points >= 93)
                letterGrade = "A";
            else if (points >= 90 )
                letterGrade = "A-";
            else if(points >= 87)
                letterGrade = "B+";
            else if (points >= 83 )
                letterGrade = "B";
            else if(points >= 80)
                letterGrade = "B-";
            else if(points >= 77)
                letterGrade ="C+";
            else if(points >= 70)
                letterGrade ="C";
            else if(points >= 60)
                letterGrade = "D";
            else
                letterGrade = "E";
            System.out.println("You got "+letterGrade+" grade"); // display result
        }
    }


}
