import java.util.*;
public class Question3{
  public static void main(String[] args){
      Scanner s1 = new Scanner(System.in);
    //Read your first name in string
    
    //Read  your last name in string
   
     //Read  rollnumber in integer
    
    //Read  1st subject mark in float
    
    //Read  2nd subject mark in float
	
    // find the avg mark in the subject

    //Print the record in the format: name+" "+rollnumber+" "+avg_mark  
String apurva=s1.nextLine();
String a=s1.nextLine();

int roll=s1.nextInt();

double s1a=s1.nextDouble();
double s2a=s1.nextDouble();

double avg=(s1a+s2a)/2;

System.out.print(apurva+a+" "+roll+" "+avg);

  }
}
