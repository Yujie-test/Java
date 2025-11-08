package chapter18;

import java.util.Objects;

public class Test04 {
    public static void main(String[] args) {

        Student stu1 = new Student(111, "No.2 Middle School");
        Student stu2 = new Student(111, "No.2 Middle School");
        System.out.println(stu1 == stu2); // false
        System.out.println(stu1.equals(stu2)); // true

        System.out.println(stu1.school == stu2.school);
        Student stu3 = new Student(111, new String("No.2 Middle School"));
        Student stu4 = new Student(111, new String("No.2 Middle School"));
        System.out.println(stu3.school == stu4.school);
    }
}

class Student{
    // 学号
    int no;
    // 所在学校
    String school;

    public Student() {
    }

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    // 重写toString()方法
    @Override
    public String toString() {
        return "no: " + no +
                ", school: '" + school + '\'';
    }

    // 重写equals()方法
    // 需求：当一个学生的学号相等，并且学校相同时，表示同一个学生
    // equals方法的编写模式都是固定的，架子差不多
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Student)) return false;
        Student student = (Student) o;
        return no == student.no && school.equals(student.school);

        // 字符串不可以采用“==”比较
        //return no == student.no && school == student.school;
    }
}
