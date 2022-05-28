package people;

import java.time.LocalDate;

public class Scholar extends Student{
    private int scholarship;

    public Scholar(String name, String surname, String dateOfBirth, String gender, String index, int scholarship) {
        super(name, surname, dateOfBirth, gender, index);
        this.index = index;
        this.scholarship = scholarship;

    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}
