package people;

import java.time.LocalDate;

public class Lecturer extends Person{
    private String degree;

    public Lecturer(String name, String surname, String dateOfBirth, String gender, String degree) {
        super(name, surname, dateOfBirth, gender);
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public void printOutPerson() {
        System.out.println("Name: " + this.getName() + " " + this.getSurname());
        System.out.println("Degree: " + this.getDegree());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Date of birth: " + this.getDateOfBirth());
    }
}
