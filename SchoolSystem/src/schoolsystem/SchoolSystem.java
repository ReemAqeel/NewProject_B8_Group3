package schoolsystem;

import java.util.*;

public class SchoolSystem {

    public static void main(String[] args) {
        //variables to send to methods 
        ArrayList STDschedual = new ArrayList<String>();
        String courseName;
        int grade;
        //taking id and pass from user 
        Scanner user = new Scanner(System.in);
        System.out.print("Please enter your ID: ");
        int id = user.nextInt();
        System.out.print("Please enter your password: ");
        int password = user.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("#Hello & Welcome to the High school Education System#");
        System.out.println("----------------------------------------------\n");

        //manue 
        for (int i = 1; i > 0; i++) {
            System.out.println("");
            System.out.println("----------------------------------------------");
            System.out.println("Please select from the following: ");
            System.out.println("----------------------------------------------");
            System.out.println("1. ADD COURSE TO STUDENT SCHEDUAL ");
            System.out.println("2. DELETE COURSE TO STUDENT SCHEDUAL ");
            System.out.println("3. VIEW COURSES TO REGISTOR");
            System.out.println("4. VIEW STUDENTS SCHEDULE");
            System.out.println("5. EXIT");
            System.out.println("----------------------------------------------");

            int selection = user.nextInt();

            //sending to add course method in school function class
            if (selection == 1) {
                System.out.print("Please Enter the name of the course you wish to add: ");
                courseName = user.next();
                SchoolFunctions.ADDCOURSE(STDschedual, courseName);

                //sending to add course method in school function class
            } else if (selection == 2) {
                System.out.print("Please Enter the name of the course you wish to delete: ");
                courseName=user.next();
                 SchoolFunctions.DELETECOURSE(STDschedual, courseName);

            } else if (selection == 3) {
                System.out.print("please enter number of grade you wish to view it's courses: ");
                grade=user.nextInt();
                SchoolFunctions.VIEWCOURSES(grade);

            } else if (selection == 4) {
                if(STDschedual.isEmpty()){
                    System.out.println("Student has not registor for any course yet ");
                }else{
                System.out.println("Student current schedual is: ");
                SchoolFunctions.print(STDschedual);
                }

            } else if (selection == 5) {
                System.out.println("Thank you for using our system, have a nice day :)");
                break;
            } else {
                System.out.println("Please try again");
        }
      }
    }
}