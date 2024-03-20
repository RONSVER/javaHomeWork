package org.example.prof.lessonEight.custom;

public class MyNode {
    private Integer data;
    private MyNode next;

    public MyNode(Integer data, MyNode next) {
        this.data = data;
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
