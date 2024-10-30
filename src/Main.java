public class Main {
    public static void main(String[] args) {
        // Vytvorenie objektu Student
        Student student = new Student(101, "John", "Doe", 20);
        student.getInfo();

        System.out.println(); // Pre lepšiu čitateľnosť výstupu

        // Vytvorenie objektu Employee
        Employee employee = new Employee("Jane", "Smith", 45);
        employee.getInfo();
    }
}