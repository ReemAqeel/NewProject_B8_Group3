
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
      ////////////////////////////////////////////////
     
     //view courses to registor 
       public static void VIEWCOURSES(int grade){
        //array of courses that grade 10 takes 
        ArrayList grade10=new ArrayList<String>();
        grade10.add("MATH-110");
        grade10.add("CHEMISTRY-210");
        grade10.add("PHYSICS-310");
        grade10.add("BIOLOGY-410");
        grade10.add("HISTORY-510");
        grade10.add("ENGLISH-610");
        grade10.add("SOCIAL_STUDIES-710");
        grade10.add("ISLAMIC-810");
        
        //array of courses that grade 11 takes
        ArrayList grade11=new ArrayList<String>();
        grade11.add("MATH-111");
        grade11.add("CHEMISTRY-211");
        grade11.add("PHYSICS-311");
        grade11.add("BIOLOGY-411");
        grade11.add("HISTORY-511");
        grade11.add("ENGLISH-611");
        grade11.add("BUSNIESS-711");
        grade11.add("ISLAMIC-811");
        
        // array of courses that grade 12 takes 
         ArrayList grade12=new ArrayList<String>();
        grade12.add("CALCULAS-112");
        grade12.add("CHEMISTRY-212");
        grade12.add("PHYSICS-321");
        grade12.add("BIOLOGY-412");
        grade12.add("HISTORY-512");
        grade12.add("ENGLISH-612");
        grade12.add("BUSNIESS-712");
        grade12.add("ISLAMIC-812");
        
        if(grade ==10){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("Courses avaliable to registor in grade (10): ");
            System.out.println("---------------------------------------------");
            System.out.println(grade10);
        }else if (grade==11){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("Courses avaliable to registor in grade (11): ");
            System.out.println("---------------------------------------------");
            System.out.println(grade11);
        }else if (grade==12){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("Courses avaliable to registor in grade (12): ");
            System.out.println("---------------------------------------------");
            System.out.println(grade12);
        }else{
            System.out.println("");
            System.out.println("No avalibale courses for this grade");

       }

       }
}
