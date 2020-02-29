
package ObjectPassingInstanceMethod;


public class Student {
    String dept ;
    int year ;
    
    Student(String d , int y) {
        dept = d ;
        year = y ;
    }
    
    int equal(Student s) {
         if ( this.dept.equals(s.dept) && this.year == s.year) return 1 ;
         else if ( this.dept.equals(s.dept) && this.year != s.year) return 2 ;
         else if ( !this.dept.equals(s.dept) && this.year == s.year) return 3 ;
         else return 4 ;
    }
}
