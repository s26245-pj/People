package people;


public class Student extends Person{
    protected String index;

    public Student(String name, String surname, String dateOfBirth, String gender, String index) {
        super(name, surname, dateOfBirth, gender);
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public void printOutPerson() {
        System.out.println("Name: " + this.getName() + " " + this.getSurname());
        System.out.println("Index: " + this.getIndex());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Date of birth: " + this.getDateOfBirth());
    }

}
