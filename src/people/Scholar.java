package people;

import java.time.LocalDate;

public class Scholar extends Student{
    private int scholarship;

    public Scholar(String name, String surname, String dateOfBirth, String gender, String index, int scholarship) {
        super(name, surname, dateOfBirth, gender, index);
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.index = index;
        this.scholarship = scholarship;

    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public void printOutPerson() {
        System.out.println("Name: " + this.getName() + " " + this.getSurname());
        System.out.println("Index: " + this.getIndex());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Date of birth: " + this.getDateOfBirth());
        System.out.println("Scholar: " + this.scholarship + "$");
    }

}
