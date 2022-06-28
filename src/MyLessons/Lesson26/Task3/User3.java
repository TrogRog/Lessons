package MyLessons.Lesson26.Task3;

import MyLessons.Lesson26.Task1.User1;

import java.util.Objects;

public class User3 {
    private static String login;
    private static String password;

    public static class Query {
        public void printToLog() {
            System.out.printf("User с Логин: %s and Пароль: %s отправил запрос\n", login, password);
        }
    }

    public static void initUser(String login, String password) {
        User3.login = login;
        User3.password = password;
    }

    public static void main(String[] args) {
        initUser("login5", "password5");
        User3.Query query5 = new Query();
        query5.printToLog();
    }
}
