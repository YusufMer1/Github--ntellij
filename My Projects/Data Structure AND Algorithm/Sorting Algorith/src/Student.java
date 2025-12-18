public class Student {
    public int rowno;
    public int studentID;
    public String firstname;
    public String lastname;
    public String section;
    public int grade;
    public String email;

    public Student(int rowno, int studentID, String firstname, String lastname, String section, int grade, String email) {
        this.rowno = rowno;
        this.studentID = studentID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.section = section;
        this.grade = grade;
        this.email = email;
    }
    public String StudentInfo(){
        return rowno +" | " + studentID + " | " + firstname + " | " + lastname + " | " + section + " | " + grade;
    }

}
