/*
 * A student football player is a football player that implements the Student interface
 */
package collegefbplayer;

/**
 *
 * @author briki
 */
public class StudentFBPlayer extends FootballPlayer implements Student{
    
    private String major;
    private String status;

    public StudentFBPlayer() {
        super();
        major = " ";
        status = " ";
                
    }

    public StudentFBPlayer(String inf_major, String inf_position, int inf_jerseyNumber, int inf_heightInches, int inf_weightLbs, String inf_firstName, String inf_lastName, int inf_age) {
        super(inf_position, inf_jerseyNumber, inf_heightInches, inf_weightLbs, inf_firstName, inf_lastName, inf_age);
        this.major = inf_major;
        if (getAge() <= 25) status = "Traditional";
	else status = "Non-Traditional";
    }
    

    @Override
    public void buyBooks(int inf_nuBooks, double inf_bookCosts) {
        System.out.println("This college football player purchased "+inf_nuBooks + 
                " at a cost of " + inf_bookCosts);

    }

    @Override
    public void payTuition(double inf_tuitionCosts) {
        System.out.println("This college football player paid " + inf_tuitionCosts + " in tuition.");
        }

    @Override
    public String showInfo() {
        String studentPlayerInfo = super.showInfo() + "\n Their major is " + getMajor()
                + "\n Their status is: " + getStatus();
        return studentPlayerInfo;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
