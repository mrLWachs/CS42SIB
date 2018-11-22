
/** required package class namespace */
package computerscience30s;


/**
 * Person.java - defines what it is to be a person
 *
 * @author Mr. Wachs 
 * @since 19-Nov-2018 
 */
public class Person 
{
    
    // Properties: ------------------------------------------------------------
    
    String name;
    int age;
    boolean isAlive;
    boolean isMale;
        
    // Methods: ---------------------------------------------------------------
    
    /**
     * Constructor method for the class, sets class properties to default values
     */
    Person() {
        born();
        isMale = false;
        name   = "Jane Doe";
    }
    
    /**
     * Constructor method for the class, sets class properties
     * 
     * @param nameForThePerson the name for this person
     */
    Person(String nameForThePerson) {
        born();
        isMale = false;
        name   = nameForThePerson;
    }
    
    /**
     * When a person is born
     */
    void born() {
        isAlive = true;
        age     = 0;
    }
    
    /**
     * When a person dies
     */
    void die() {
        isAlive = false;
    }
    
    /**
     * A person talks (by outputting information to the screen)
     */
    void talk() {
        System.out.println(name + " is " + age + " and if you are " +
                        "wondering if I am male, the answer is " + isMale);
    }
    
    /**
     * A person has a birthday (their age goes up by one)
     */
    void birthday() {
        age++;
    }
    
    /**
     * A person has many birthdays
     * 
     * @param times how many birthdays to have
     */
    void birthday(int times) {
        for (int i = 0; i < times; i++) {
            birthday();
        }
    }
        
}
