
package ObjectPassingStaticMethod;


public class Test {
       public static void main(String[] args) {
        Player p1 = new Player("Bangladeshi","BATSMAN");
        Player p2 = new Player("AUSTRALIAN","BATSMAN");
        
        if ( Player.equal(p1,p2) == 1) System.out.println("Same Nationality and Same Role");
        else if ( Player.equal(p1,p2) == 2) System.out.println("Same Nationality But Not Same Role");
        else  if ( Player.equal(p1,p2) == 3) System.out.println("Not Same Nationality But Same Role");
        else  System.out.println("Not Same Nationality and Not Same Role");
        
    }
}
