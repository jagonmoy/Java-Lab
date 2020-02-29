
package ObjectPassingConstructor;


public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("SWE","LECTURER");
        Teacher t2 = new Teacher(t1);
        
        t1.display();
        t2.display();
     }
    
}
