// Assignment 5: Compare Two Persons by Age
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static Person compareByAge(Person p1, Person p2) {
        return p1.getAge() > p2.getAge() ? p1 : p2;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 45);

        Person senior = compareByAge(person1, person2);
        System.out.println("Senior Person:");
        senior.display();
    }
}
