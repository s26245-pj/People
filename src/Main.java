import people.Lecturer;
import people.Person;
import people.Student;

import javax.management.loading.MLetContent;

public class Main {


    public static void main(String[] args) {
        Student student = new Student("Student",
                            "Studentski",
                            "12.02.2006",
                            "male",
                             "23562");
        student.printOutPerson();

        System.out.println("\n\n\n");

        Lecturer lecturer = new Lecturer("lecture",
                                "Lectorski",
                                "16.02.1970",
                                "female",
                                "doctor");

        lecturer.printOutPerson();
    }

}
