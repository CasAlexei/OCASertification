package Tregulov.Lesson30;

import java.util.ArrayList;

public class Test1 {

}

class Student{
    String name;
    char sex;
    int age;
    double avgGrade;
    int course;

    Student(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.avgGrade = avgGrade;
        this.course = course;

    }
}
class StudentInfo{
    void printStudent(Student st){
        System.out.println("Student name=" + st.name + ", sex=" + st.sex + ", age=" + st.age + ", course=" +  st.course + ", average grade=" + st.avgGrade);
    }
//    void printStudentOverGrade(ArrayList<Student> aL, double avGrade){
//        for(Student st: aL){
//            if(st.age>avGrade){
//                System.out.println(st);
//            }
//        }
//    }
    void testStudent(ArrayList<Student> aL, StudentChecks sc){
        for(Student s: aL){
            if(sc.test(s)){
                printStudent(s);
            }
        }
    }
    void needStudent(ArrayList<Student> al, StudentNeed sn){
        for(Student st: al){
            if(sn.need(st)){
                printStudent(st);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3 , 8.3 );
        Student st2 = new Student("Nikolay", 'm', 28, 2 , 6.4 );
        Student st3 = new Student("Elena", 'f', 19, 1 , 8.9 );
        Student st4 = new Student("Petr", 'm', 35, 4 , 7 );
        Student st5 = new Student("Mariya", 'f', 23, 3 , 9.1 );
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        si.testStudent(list, new FindStudentOverGrade());
        System.out.println("1------------------------------------------------------------------------");
        si.testStudent(list, st->{return st.avgGrade > 8.5;});
        System.out.println("2------------------------------------------------------------------------");
        si.testStudent(list, (st)-> st.course > 2);
        System.out.println("3------------------------------------------------------------------------");
        si.testStudent(list, (Student st) -> {return st.sex=='m';});
        System.out.println("4------------------------------------------------------------------------");
        si.needStudent(list, (Student st) -> {return st.age<30;});
    }
}

interface StudentChecks{
    boolean test(Student s);
}
interface StudentNeed{
    boolean need(Student s);
}

class FindStudentOverGrade implements StudentChecks{
    public boolean test(Student s){
        return s.avgGrade > 8.5;
    }
}