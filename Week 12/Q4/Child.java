class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}
public class Child extends Parent {
   public static void testClassMethod() {
        
    }
public static void main(String[] args) {
        
     // Call the instance method in the Parent class 
		
     // Call the static method in the Parent class
  Child a=new Child(); 
            a.testInstanceMethod();
            Parent.testClassMethod();
  }
}
