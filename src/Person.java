import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected OptionalInt age;
    protected String address = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, OptionalInt age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int happyBirthday() {
        int newAge = age.getAsInt();
        return newAge++;
    }

    public boolean hasAge() {
        return age.isPresent() ? false : true;
    }

    public void setAddress(String city) {
        this.address = city;
    }

    public boolean hasAddress() {
        return address == null ? false : true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age.getAsInt();
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address)
                .setAge(this.age.getAsInt());
    }

    @Override
    public String toString() {
        return "Person: \nName: " + name +
                "\nSurname: " + surname +
                "\nAge: " + age.getAsInt() +
                "\nAddress: " + address +
                "\n";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + age.getAsInt() + address.hashCode();
    }
}