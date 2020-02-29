
package ObjectPassingInstanceMethod;


public class Test {
    
    public static void main(String[] args) {
        Student s1 = new Student("SWE",1);
        Student s2 = new Student("SWE",2);
        
        if ( s1.equal(s2) == 1) System.out.println("Same Dept and Same Year");
        else if ( s1.equal(s2) == 2) System.out.println("Same Dept But Not Same Year");
        else  if ( s1.equal(s2) == 3) System.out.println("Not Same Dept But Same Year");
        else  System.out.println("Not Same Dept and Not Same Year");
        
    }
}
