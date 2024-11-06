package com.xing.principle.compositionaggregation_07;

public class WxNotify implements Notify {

    private Parent parent;

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void wxNotify() {
        parent.meeting();
    }
}
