public class Secretary implements Runnable {
    private static Students[] studentsInCampus = new Students[200];
    private int studentID;
    private Students student;
    private static int ctr = 0;
//    public void int stu

    public Secretary(int num){
        this.studentID = num;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        student = new Students(studentID, name);
        System.out.println("the wonderful secretery : " + name + " is working on: " + student.getName());
        excecuteStudent(student);
        System.out.println("the wonderful secretery : " + name + "has finished with " + student.getName());
    }

    private static synchronized void excecuteStudent(Students student) {
        studentsInCampus[ctr] = student;
        ctr++;
    }
    public static void print(){
        for (int i = 0 ; i < studentsInCampus.length ; i++){
            System.out.println(studentsInCampus[i]);
        }
    }
}
