package org.example.prof.lessonEight.custom;

public class MySecondNode {
    private Integer data;
    private MySecondNode next;
    private MySecondNode prev;

    public MySecondNode(Integer data, MySecondNode next, MySecondNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public MySecondNode getNext() {
        return next;
    }

    public void setNext(MySecondNode next) {
        this.next = next;
    }

    public MySecondNode getPrev() {
        return prev;
    }

    public void setPrev(MySecondNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
