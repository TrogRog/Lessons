package MyLessons.Lesson26.Task2;

import java.util.Objects;

public class User2 {
    private String login;
    private String password;

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.printf("User с Логин: %s and Пароль: %s отправил запрос\n", login, password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static void main(String[] args) {
        User2 user4 = new User2("login4", "password4");
        user4.createQuery();
    }

}
