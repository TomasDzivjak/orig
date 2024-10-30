class Student implements Person {
    private int studentID; // súkromná premenná
    private String name;
    private String surname;
    private int age;

    public Student(int studentID, String name, String surname, int age) {
        this.studentID = studentID; // priradenie premenných
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getStudentID() { // verejná metóda na získanie studentID
        return studentID;
    }

    @Override
    public void getInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
    }
}

