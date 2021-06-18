public class Students {
    private int studentID;
    private String name;

    public Students(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "Student " + name + "and student ID=" + studentID ; }
}
