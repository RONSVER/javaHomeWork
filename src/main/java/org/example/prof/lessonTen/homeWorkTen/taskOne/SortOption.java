package org.example.prof.lessonTen.homeWorkTen.taskOne;

public enum SortOption {

    TITLE(1, "title"),
    PUBLISHING(2, "publishing"),
    PAGES(3, "pages"),
    AUTHORS_BIRTH(4, "authors birth");

    private int option;

    private String description;

    SortOption(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public static SortOption getByOption(int option) {
        for (SortOption sortOption : values()) {
            if (sortOption.getOption() == option) {
                return sortOption;
            }
        }

        return TITLE;
    }
}
