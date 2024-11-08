package com.xing.pattern_23.creational_5.prototype_4;
import java.util.Date;

public class ConcretePrototype_1 implements Prototype_1, Cloneable {
    private String id;
    private Date creationDate;

    public ConcretePrototype_1(String id) {
        this.id = id;
        this.creationDate = new Date();
    }

    // 实现 clone 方法
    @Override
    public Prototype_1 clone() {
        try {
            // 使用 Java 的 Object 类中的 clone 方法进行浅复制
            // 如果需要深复制，可以手动复制每个字段
            ConcretePrototype_1 cloned = (ConcretePrototype_1) super.clone();
            // 手动深复制日期对象
            cloned.creationDate = new Date(this.creationDate.getTime());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cannot clone", e);
        }
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "id='" + id + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}