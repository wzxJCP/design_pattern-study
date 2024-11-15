package com.xing.pattern_23.structural_7.flyweight_7;

/**
 * @project：design_pattern-study
 * @since：2024/11/15 8:50
 * @author：wzx
 */
public class Manager implements Employee {

    private String department;
    private String noteContent;

    public Manager(String department) {
        this.department = department;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public void report() {
        System.out.println(this.noteContent);
    }
}
