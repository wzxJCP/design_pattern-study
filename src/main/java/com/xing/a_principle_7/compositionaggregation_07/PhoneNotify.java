package com.xing.a_principle_7.compositionaggregation_07;

public class PhoneNotify implements Notify {

    private Parent parent;

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void phoneNotify() {
        parent.meeting();
    }
}
