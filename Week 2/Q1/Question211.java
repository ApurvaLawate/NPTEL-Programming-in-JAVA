 // This is the outer class named School
class School { 
    // This is the inner class named Student
    class Student { 
		// This is a method in inner class Student
        public void print() { 
			System.out.println("Hi! I am inner class STUDENT of outer class SCHOOL."); 


System.out.println("NPTEL");
        } 
    } 
} 

public class Question211{ 
    public static void main(String[] args) { 
// Create an object of inner class Student

// Access the 'print()' method of the inner class Student using the inner class object
School s=new School();
School.Student c=s.new Student();
c.print();

     } 
}
