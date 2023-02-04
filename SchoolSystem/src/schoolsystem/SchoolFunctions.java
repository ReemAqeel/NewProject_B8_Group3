
package schoolsystem;

import java.util.ArrayList;


public class SchoolFunctions {
    
    //Add courses to students method 
    public static void ADDCOURSE(ArrayList<String> STDschedual,String courseName){
        if(STDschedual.contains(courseName)){
            System.out.println("The course is already in the student schedual");
        }else{
            STDschedual.add(courseName);
            System.out.println("Course is added to student schedual ");
        }
    }
    
}
