public class Student {
    // Instance variables
    private String firstName;
    private String lastName;
    private String studentId;
    private String email;
    private String major;
    private String minor;

    // Constructor
    public Student(String firstName, String lastName, String studentId, String email, String major, String minor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
        this.major = major;
        this.minor = minor;
    }

 

    // Getters and setters (optional, but recommended for accessing and modifying private fields)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }
}
