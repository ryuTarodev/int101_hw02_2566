package work02;

import work01.Utilitor;

public class Person {
    /*
       2.1 Create a public class named "Person" in package named "work02Person".
           This class contains the following fields and methods.
       2.2 a private static field of type "int" named "nextId" initialized to 1.
       2.3 a private final field of type "int" named "id".
       2.4 a private field of type "String" named "firstname".
       2.5 a private field of type "String" named "lastname".
       2.6 a public constructor that receives "firstname" and "lastname"
           parameters to set the values of "firstname" and "lastname" fields.
           Check the correctness of the values of "firstname" and "lastname"
           parameters with "Utilitor.testString" method first.
           If nothing is wrong, set the value of "id" field to be the value
           of "nextId" field and increment the value of "nextId" by 1.
       2.7 @Override a public "toString" method that returns
           "Person(id,firstname,lastname)" where id, firstname, and lastname
           are the values of the coresponding fields of this "Person" object.
           Use "StringBuilder" to build the output string.
       2.8 public getters for "id", "firstname", and "lastname" fields.
       2.9 public setters for "firstname" and "lastname" fields.
           Use the "Utilitor.testString" method to check the correctness
           of the parameters first.
       2.10 @Override a public "equals" method that returns true
            if this object is the same as the object in the parameter
            (i.e., the same reference). Otherwise, it returns false.
       2.11 Show in this "work02Person" method how to use 2.6-2.10
            and check their correctness. */
    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;
    Utilitor utilitor = new Utilitor();

    public Person(String firstName, String lastName) {

        this.firstname = utilitor.testString(firstName);
        this.lastname = utilitor.testString(lastName);
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Person(");
        stringBuilder.append(id);
        stringBuilder.append(",");
        stringBuilder.append(firstname);
        stringBuilder.append(",");
        stringBuilder.append(lastname);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = utilitor.testString(firstname);
    }
    public void setLastname(String lastname) {
        this.lastname = utilitor.testString(lastname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // References are the same
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different classes or null
        }
        Person other = (Person) obj; // Cast to Person
        return (firstname == other.firstname && lastname == other.lastname);
    }
}
