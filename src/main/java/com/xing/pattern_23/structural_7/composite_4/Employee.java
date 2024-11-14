package com.xing.pattern_23.structural_7.composite_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 9:17
 * @author：wzx
 */
// 定义一个Employee类，用于表示公司的员工信息
public class Employee {
    // 员工姓名
    private String name;
    // 员工所在部门
    private String dept;
    // 员工薪资
    private Long salary;
    // 员工管理的下级员工列表
    private List<Employee> employeeList;

    // 构造方法，初始化员工的基本信息
    public Employee(String name, String dept, Long salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        // 初始化下级员工列表
        this.employeeList = new ArrayList<>();
    }

    // 添加下级员工的方法
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    // 移除下级员工的方法
    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    // 获取员工姓名
    public String getName() {
        return name;
    }

    // 设置员工姓名
    public void setName(String name) {
        this.name = name;
    }

    // 获取员工所在部门
    public String getDept() {
        return dept;
    }

    // 设置员工所在部门
    public void setDept(String dept) {
        this.dept = dept;
    }

    // 获取员工薪资
    public Long getSalary() {
        return salary;
    }

    // 设置员工薪资
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    // 获取下级员工列表
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // 设置下级员工列表
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    // 重写toString方法，方便打印员工信息
    @Override
    public String toString() {
        return "姓名='" + name + '\'' +
                ", 部门编号='" + dept + '\'' +
                ", 薪资=" + salary;
    }
}
