package MyLessons.Lesson20.Task5;

import java.util.Objects;

public enum Category {
    CAT1("clothes"),CAT2("things"),CAT3("food");

    private String category;

    Category(String category) {
        this.category = category;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
