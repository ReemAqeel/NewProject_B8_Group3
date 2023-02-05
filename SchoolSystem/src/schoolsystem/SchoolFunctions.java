
package schoolsystem;

import java.util.ArrayList;


public class SchoolFunctions {
    
    //Method to print student schedual 
    public static void print(ArrayList<String> STDschedual){
        System.out.println("*******************");
        System.out.println("Student Schedual ");
        System.out.println("*******************");
        System.out.println("-----------------------");
        for (int i=0;i<STDschedual.size();i++){
            String crr=STDschedual.get(i);
            System.out.println(crr);
            System.out.println("-----------------------");
        }
    }
    
    //Add courses to students method 
    public static void ADDCOURSE(ArrayList<String> STDschedual,String courseName){
        if(STDschedual.contains(courseName)){
            System.out.println("The course is already in the student schedual");
            SchoolFunctions.print(STDschedual);
        }else{
            STDschedual.add(courseName);
            System.out.println("Course is successfully added to student schedual ");
            SchoolFunctions.print(STDschedual);
        }
    }
    ////////////////////////////////////////////////
    
    //Delete courses to student method 
     public static void DELETECOURSE(ArrayList<String> STDschedual, String courseName) {
        if(STDschedual.contains(courseName)){
            STDschedual.remove(courseName);
            System.out.println("");
            System.out.println("Course is successfully removed from your schedual  ");
            SchoolFunctions.print(STDschedual);
            
        }else{
            System.out.println("");
            System.out.println("course is not on your schedual, please try again");
            SchoolFunctions.print(STDschedual);
        }
        
    }
    
}
