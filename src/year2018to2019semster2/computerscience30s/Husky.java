
/** required package class namespace */
package year2018to2019semster2.computerscience30s;


/**
 * Husky.java - represents a Husky. This class uses inheritance to inherit
 * the properties and methods from the Students class, which was already 
 * inheriting (extending) from the Person class. Therefore, this class 
 * inherits from both (a double inheritance).
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class Husky extends Student
{

    private int pride;                              // encapsulated property
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Husky
     * @param age the age for this Husky
     * @param isMale the gender for this Husky
     * @param courses all the course this student is taking
     */
    public Husky(String name, int age, boolean isMale, String[] courses) {
        super(name, age, isMale, courses);          // super constructor
        pride = 5;                                  // set internal properties
    }

    /**
     * Raises Husky pride
     */
    public void pepRally() {
        pride++;
    }
    
    /**
     * Lowers Husky pride
     */
    public void suspended() {
        pride--;
    }
    
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();       // call to super talk(), it calls super talk() also
        System.out.println("\tPride:   " + pride);
    }
   
}
