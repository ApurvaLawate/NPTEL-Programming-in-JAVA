 // This is the class named School
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question212{ 
    public static void main(String[] args) { 

// Create an object of class Student
Student s=new Student();
// Call 'print()' method of class Student 
s.print();
// Create an object of class School
School c=new School();
// Call 'print()' method of class School
c.print();
     } 
}
