/*
 * This application crates a new Student Football Player, displays their information
 * and then pays tuition and buys books.
 */
package collegefbplayer;

/**
 *
 * @author briki
 */
public class CollegeFBPlayer{         
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StudentFBPlayer Brian = new StudentFBPlayer("IST", "Quarterback", 99, 77, 220, "Brian", "Kirby", 21);
        System.out.println(Brian.showInfo());
        Brian.payTuition(3100.25);
        Brian.buyBooks(3, 230.22);
        
    }
    
}

