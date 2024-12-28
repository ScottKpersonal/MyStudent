public class UniversityClass {
    // Instance variables
    private String className;
    private String classId;
    private int numberOfSemesters;
    private String faculty;

    // Constructor
    public UniversityClass(String className, String classId, int numberOfSemesters, 
                          String teacher, String faculty) {
        this.className = className;
        this.classId = classId;
        this.numberOfSemesters = numberOfSemesters;
        this.faculty = faculty;
    }

    // Getters and Setters
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // toString method for easy printing of class information
    @Override
    public String toString() {
        return "UniversityClass{" +
                "className='" + className + '\'' +
                ", classId='" + classId + '\'' +
                ", numberOfSemesters=" + numberOfSemesters +
                ", faculty='" + faculty + '\''+
                '}';
    }
}
