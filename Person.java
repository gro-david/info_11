import java.sql.Date;

/**
 * Represents a person with a name, date of birth, and phone number.
 */
public class Person {
    String name;
    Date dateOfBirth;
    int phoneNumber;

    /**
     * Constructs a Person object with the specified name, date of birth, and phone number.
     * @param name the name of the person
     * @param dateOfBirth the date of birth of the person
     * @param phoneNumber the phone number of the person
     */
    public Person(String name, Date dateOfBirth, int phoneNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public boolean is(Person _person){
        return this.name.equals(_person.name) && this.dateOfBirth.equals(_person.dateOfBirth) && this.phoneNumber == _person.phoneNumber;
    }
}
