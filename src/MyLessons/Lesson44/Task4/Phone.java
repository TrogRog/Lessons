package MyLessons.Lesson44.Task4;

public class Phone {
    int id;
    int user_id;
    int phone_number;

    public Phone(int id, int user_id) {
        this.id = id;
        this.user_id = user_id;
    }

    public Phone(int id, int user_id, int phone_number) {
        this.id = id;
        this.user_id = user_id;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getPhone_number() {
        return phone_number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", phone_number=" + phone_number +
                '}';
    }
}
