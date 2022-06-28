package MyLessons.Lesson26.Task1;

import java.util.Objects;

public class User1 {
    private String login;
    private String password;

    public class Query {
        public void printToLog() {
            System.out.printf("User с Логин: %s and Пароль: %s отправил запрос\n", login, password);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }


    public User1(String login, String password) {
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
        User1 user1 = new User1("login1", "password1");
        User1.Query query = user1.new Query();
        query.printToLog();

        user1.createQuery();

        User1.Query query2 = new User1("login2", "password2").new Query();
        query2.printToLog();
    }
}
