public class App {
    public static void main(String[] args) {
        // Create a new student object
        Student student1 = new Student("John", "Doe", "12345", 
                "john.doe@university.edu", "Computer Science", "Mathematics");
        
        // Create another student object
        Student student2 = new Student("Jane", "Smiths", "67890",
                "jane.smith@university.edu", "Physics", "Chemistry");
        
        // Display student1 information
        System.out.println("Student 1 Information:");
        System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("ID: " + student1.getStudentId());
        System.out.println("Email: " + student1.getEmail());
        System.out.println("Major: " + student1.getMajor());
        System.out.println("Minor: " + student1.getMinor());
        
        // Modify student2 information using setters
        student2.setMajor("Mathematics");
        student2.setMinor("Computer Science");
        
        // Display student2 information
        System.out.println("\nStudent 2 Information:");
        System.out.println("Name: " + student2.getFirstName() + " " + student2.getLastName());
        System.out.println("ID: " + student2.getStudentId());
        System.out.println("Email: " + student2.getEmail());
        System.out.println("Major: " + student2.getMajor());
        System.out.println("Minor: " + student2.getMinor());
    }

    }
