/*
 * The FootballPlayer class
 */
package collegefbplayer;

/**
 *
 * @author briki
 */
public class FootballPlayer extends Person{

    private String position;
    private int jerseyNumber;
    private int heightInches;
    private int weightLbs;

    public FootballPlayer() {
        super();
        position = " ";
        jerseyNumber = 0;
        heightInches = 0;
        weightLbs = 0;
        
    }

    public FootballPlayer(String inf_position, int inf_jerseyNumber, int inf_heightInches, int inf_weightLbs, String inf_firstName, String inf_lastName, int inf_age) {
        super(inf_firstName, inf_lastName, inf_age);
        this.position = inf_position;
        this.jerseyNumber = inf_jerseyNumber;
        this.heightInches = inf_heightInches;
        this.weightLbs = inf_weightLbs;
    }

    public String showInfo(){
    String playerInfo = "\nFirst name: " + getFirstName() +
            "\nJersey Number: "+ getJerseyNumber()+
            "\nPosition: " + getPosition() + 
            "\nHeight (in inches): " + getHeightInches()+
            "\nWeight (in punds): " + getWeightLbs();
    return playerInfo;
    }
    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the jerseyNumber
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * @return the heightInches
     */
    public int getHeightInches() {
        return heightInches;
    }

    /**
     * @param heightInches the heightInches to set
     */
    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    /**
     * @return the weightLbs
     */
    public int getWeightLbs() {
        return weightLbs;
    }

    /**
     * @param weightLbs the weightLbs to set
     */
    public void setWeightLbs(int weightLbs) {
        this.weightLbs = weightLbs;
    }
    
    
    
}
