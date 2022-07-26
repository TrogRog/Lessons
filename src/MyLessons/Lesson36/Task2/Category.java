package MyLessons.Lesson36.Task2;

import java.io.Serializable;

public enum Category  implements Serializable {
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
