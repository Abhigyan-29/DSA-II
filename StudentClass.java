public class StudentClass {
//creating a new data type with multiple attribute
    public static class Student {
        String name;
        int roll;
        double percent;
    }


    public static void main(String[] args) {
        Student x = new Student(); //declaration
        x.name = "Raghav";
        x.roll = 76;
        x.percent = 92.5;

        Student s = new Student();
        s.name = "akshit";
        s.roll = 34;
        s.percent = 45.53;
    }
}
