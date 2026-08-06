import java.sql.*;

public class StudentDAO {

    Connection conn = DBConnection.getConnection();

    // Add Student
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (id, name, age, department) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getDepartment());

            ps.executeUpdate();
            System.out.println("Student added successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Display Students
    public void displayStudents() {
        String sql = "SELECT * FROM students";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getString("department"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update Student Department
    public void updateDepartment(int id, String department) {
        String sql = "UPDATE students SET department = ? WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, department);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student updated successfully.");
            else
                System.out.println("Student not found.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Student
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student deleted successfully.");
            else
                System.out.println("Student not found.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}