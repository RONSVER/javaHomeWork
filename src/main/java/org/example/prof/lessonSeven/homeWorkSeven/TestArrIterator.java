package org.example.prof.lessonSeven.homeWorkSeven;

public class TestArrIterator {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15};
        CustomIterator customIterator = new CustomIterator(arrInt);
        while (customIterator.hasNext()) {
            System.out.println(customIterator.next());
        }
    }
}
