package com.xing.principle.compositionaggregation_07;

public class Test {
    public static void main(String[] args) {
        //老师让学生通知家长,开家长会
//        Teacher teacher = new Teacher();
//        teacher.call();
//        Student student = new Student();
//        student.notifyMetting();
//        Parent parent = new Parent();
//        parent.metting();

        //可以采用微信或电话的方式,通知家长,开家长会
        //而不用通过学生进行转达
        Teacher teacher = new Teacher();
        WxNotify wxNotify = new WxNotify();
        // PhoneNotify phoneNotify = new PhoneNotify();
        teacher.setNotify(wxNotify);
        // teacher.setNotify(phoneNotify);

        Parent parent = new Parent();
        wxNotify.setParent(parent);
        // phoneNotify.setParent(parent);
        teacher.call();
    }
}
/**
 * 老师类、学生类、家长类、通知类、电话通知类、微信通知类；老师→通知学生→通知家长→开会。
 * 在这个场景中，可以利用合成复用原则来设计类之间的关系，以实现灵活的通知机制。
 * 在这个设计中，通过使用组合而不是继承，我们使得通知方式更加灵活，可以随时更换不同的通知方式。
 * 同时，这样的设计也更加符合现实世界中的逻辑关系，提高了代码的可读性和可维护性。
 */
/**
 * 小明,通知你的家长,在本周五下午,开家长会。
 * 使用微信通知家长
 * 父母去开家长会。
 */