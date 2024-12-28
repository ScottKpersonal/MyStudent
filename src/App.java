public class App {
    public static void main(String[] args) {
        // Create a new student object
        Student student1 = new Student("John", "Doe", "12345", 
                "john.doe@university.edu", "Computer Science", "Mathematics", "CS");
        
        // Create another student object
        Student student2 = new Student("Jane", "Smithsonian", "67890",
                "jane.smith@university.edu", "Physics", "Chemistry", "Life Science");
        
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
        
        
        // Create some university class instances
        UniversityClass mathClass = new UniversityClass(
                "Calculus I", 
                "MATH101", 
                1, 
                "Mathematics", "CS"
            );
            
        UniversityClass programmingClass = new UniversityClass(
                "Introduction to Programming", 
                "CS101", 
                2, 
                "Computer Science", "CS"
            );
            
            // Print the class information
            System.out.println("Math Class Details:");
            System.out.println(mathClass);
            
            System.out.println("\nProgramming Class Details:");
            System.out.println(programmingClass);
            
            // Demonstrate using some getters and setters
            mathClass.setNumberOfSemesters(2);
            System.out.println("\nUpdated Math Class Semesters: " + 
                              mathClass.getNumberOfSemesters());
        }
    }
