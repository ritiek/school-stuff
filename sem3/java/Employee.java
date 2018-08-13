class BasicInformation {
    String name;
    int age;
    String birthday;
    int salary;

    BasicInformation(String name, int age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}

class PersonalInformation {
    String name;
    int age;
    String birthday;
    int salary;

    PersonalInformation(BasicInformation employee, int salary) {
        this.name = employee.name;
        this.age = employee.age;
        this.birthday = employee.birthday;
        this.salary = salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        BasicInformation adam = new BasicInformation("Adam", 25, "5th August");
        PersonalInformation adam_complete = new PersonalInformation(adam, 45000);

        System.out.println(adam_complete.name);
        System.out.println(adam_complete.salary);
    }
}