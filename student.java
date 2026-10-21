public class Student {
    private String studentId;
    private String name;
    private String department;
    private int semester;
    private String email;
    public Student(String studentId, String name,
                   String department, int semester,
                   String email) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.semester = semester;
        this.email = email;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getSemester() {
        return semester;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
