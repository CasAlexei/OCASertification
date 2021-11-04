package Tregulov.Lesson22;

public class Test1 {
    public static void main(String[] args) {
        boolean bol1 = false;
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee de = new Doctor();
        Doctor d = new Doctor();
        Doctor d2 = new Doctor();
        emp.eat();
        de.eat();
        d.lechit();
        System.out.println("de.age = " + de.age);
        System.out.println("de.salary = " + de.salary);
        System.out.println("d.age = " + d.age);
        System.out.println("d.salary = " + d.salary);

        emp2.in1++;
        d2.in1++;
        System.out.println("in1 from Employee = " + emp.in1);
        System.out.println("in1 from Employee2 = " + emp2.in1);
        System.out.println("in1 from Doctor = " + d.in1);
        System.out.println("in1 from Doctor2 = " + d2.in1);

        String str = new String[]{"one", "two", "three"}[2];
        System.out.println(str);

        while(bol1){
            System.out.println("privet");
        }

        int[] array1 = {-3,5,4,8};
        int[] array2 = {9,0,3,-10};
        System.out.println(array1[(array1=array2)[2]]);


    }
}

class Employee{
    static int in1 = 5;
    String name;
    int age = 100;
    double salary;

    Employee( ){
        System.out.println("Constructor Employee");
    }
    void eat(){
        System.out.println("Employee eats");
    }
}

class Doctor extends Employee{
    int in1 = 650;
    int age = 200;
    double salary = 500.0;
    Doctor(){
        System.out.println("Constructor Doctor");
    }

    @Override
    void eat() {
        System.out.println("Doctor eats");
    }
    void lechit(){
        System.out.println("Doctor lechit");
    }
}
