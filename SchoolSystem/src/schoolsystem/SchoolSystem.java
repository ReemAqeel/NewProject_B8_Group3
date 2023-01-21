
package schoolsystem;
import java.util.*;

public class SchoolSystem {

//Add courses to students method 
    public static void ADDCOURSE(ArrayList<String> STDschedual,String courseName){
        if(STDschedual.contains(courseName)){
            System.out.println("The course is already in the student schedual");
        }else{
            STDschedual.add(courseName);
            System.out.println("Course is added to student schedual ");
        }
    }
    /////////////////////////////////////////
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList STDschedual=new ArrayList<String>();
        STDschedual.add("MATH-101");
        STDschedual.add("HISTORY-404");
        STDschedual.add("ENGLISH-202");
        //taking course name from the user (teacher,adminstrator,student)
        Scanner user=new Scanner(System.in);
        System.out.print("please enter name of the course you wish to add in your schedual: ");
        String courseName=user.next();
        //sending to the method add course 
        ADDCOURSE(STDschedual,courseName);
        
    }
    
}
