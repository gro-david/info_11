import java.sql.Date;

public class Person {
    String name;
    Date dateOfBirth;
    int phoneNumber;
    public Person(String name, Date dateOfBirth, int phoneNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
}
