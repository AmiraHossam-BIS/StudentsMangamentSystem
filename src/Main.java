public class Main {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        // Add Students
        Student s1 = new Student(1, "Amira", "IT", 20, 3.8);
        Student s2 = new Student(2, "Ahmed", "CS", 21, 3.5);

        dao.addStudent(s1);
        dao.addStudent(s2);

        // Display Students
        System.out.println("Students:");
        dao.displayStudents();

        // Update Department
        dao.updateDepartment(1, "Information Systems");

        System.out.println("\nAfter Update:");
        dao.displayStudents();

        // Delete Student
        dao.deleteStudent(2);

        System.out.println("\nAfter Delete:");
        dao.displayStudents();
    }
}