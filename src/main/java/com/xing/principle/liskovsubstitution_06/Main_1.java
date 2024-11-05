package com.xing.principle.liskovsubstitution_06;

public class Main_1 {
    public static void main(String[] args) {
        Person_1 person = new Person_1("Alice");
        System.out.println(person.introduce());
        System.out.println("可以教书: " + person.canTeach());

        Student_1 student = new Student_1("Bob", 10);
        System.out.println(student.introduce());
        System.out.println("可以教书: " + student.canTeach());
        System.out.println(student.study());

        Teacher_1 teacher = new Teacher_1("Charlie", "Math");
        System.out.println(teacher.introduce());
        System.out.println("可以教书: " + teacher.canTeach());
        System.out.println(teacher.teach());

        // 里氏替换原则测试
        Person_1 person1 = new Student_1("David", 9);
        System.out.println(person1.introduce());
        System.out.println("可以教书: " + person1.canTeach());

        Person_1 person2 = new Teacher_1("Eve", "Science");
        System.out.println(person2.introduce());
        System.out.println("可以教书: " + person2.canTeach());
    }
}

/**
 * 基类 Person：定义了所有人的共同属性和方法，如 introduce 和 canTeach。
 * 子类 Student：继承自 Person，并添加了学生特有的属性和方法，如 grade 和 study。重写了 introduce 和 canTeach 方法。
 * 子类 Teacher：继承自 Person，并添加了教师特有的属性和方法，如 subject 和 teach。重写了 introduce 和 canTeach 方法。
 * 测试代码：创建了 Person、Student 和 Teacher 对象，并验证了里氏替换原则。通过将 Student 和 Teacher 对象赋值给 Person 类型的变量，
 * 确保子类对象可以安全地替换基类对象，而不影响程序的正确性。
 */
/**
 * Hello,我是 Alice。
 * 可以教书: false
 * Hello,我是 Bob。 学生 10。
 * 可以教书: false
 * Bob 学习 10。
 * Hello,我是 Charlie。 老师 Math.
 * 可以教书: true
 * Charlie 任教 Math.
 * Hello,我是 David。 学生 9。
 * 可以教书: false
 * Hello,我是 Eve。 老师 Science.
 * 可以教书: true
 */