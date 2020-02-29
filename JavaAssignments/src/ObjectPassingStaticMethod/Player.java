
package ObjectPassingStaticMethod;


public class Player {
    String nationality ;
    String role ;
    
    Player(String n , String r) {
        nationality = n ;
        role = r ;
    }
    
    static int equal(Player p1,Player p2) {
         if ( p1.nationality.equals(p2.nationality) && p1.role.equals(p2.role)) return 1 ;
         else if ( p1.nationality.equals(p2.nationality) && !p1.role.equals(p2.role)) return 2 ;
         else if ( !p1.nationality.equals(p2.nationality) && p1.role.equals(p2.role)) return 3 ;
         else return 4 ;
    }
}
