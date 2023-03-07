package fundamentals.objAndClassesExer.Students;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;

    public Students(String firstName, String lastName, Double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public Double getGrade() {
        return grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
