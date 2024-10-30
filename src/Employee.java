// Trieda Employee
class Employee implements Person {
    private String name;
    private String surname;
    private int age;
    private final int retirementAge = 62;

    // Konštruktor
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Výpočet rokov do dôchodku
    public int yearsToRetirement() {
        return Math.max(retirementAge - age, 0);
    }

    // Implementácia metódy getInfo()
    @Override
    public void getInfo() {
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
        System.out.println("Years to retirement: " + yearsToRetirement());
    }
}