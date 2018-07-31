/*
 * The person class is a superclass for any other class that is based on a person
 * 
 */
package collegefbplayer;

/**
 *
 * @author briki
 */
public class Person {
    //Attributes
    private String firstName;
    private String lastName;
    private int age;
    
    //Empty Constructor
    Person (){
        firstName = " ";
        lastName = " ";
        age = 0;
    }

    public Person(String inf_firstName, String inf_lastName, int inf_age) {
        this.firstName = inf_firstName;
        this.lastName = inf_lastName;
        this.age = inf_age;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
