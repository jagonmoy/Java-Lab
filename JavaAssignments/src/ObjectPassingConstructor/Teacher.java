
package ObjectPassingConstructor;


public class Teacher {
    String dept ;
    String post ;
    
    Teacher(String d , String p) {
        this.dept = d ;
        this.post = p ;
    }
    Teacher(Teacher t) {
        this.dept = t.dept ;
        this.post = t.post ;
    }
    void display() {
        System.out.println("Department is " + this.dept + " and position is " + this.post);
    }
}
