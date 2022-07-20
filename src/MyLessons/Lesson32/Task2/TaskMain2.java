package MyLessons.Lesson32.Task2;


import MyLessons.Lesson32.Task1.WrongLoginException;
import MyLessons.Lesson32.Task1.WrongPasswordException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TaskMain2 {
    public static void main(String[] args) {

        Map<String, String> users = new HashMap<>();

        users.put("LogA", "PassA");
        users.put("LogB", "PassB");
        users.put("LogC", "PassC");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные Логин");
        String inputLogin = scanner.nextLine();
        System.out.println("Введите данные Пароль");
        String inputPass = scanner.nextLine();


        boolean userFound = false;
        boolean ok = false;
        for (Map.Entry<String, String> entry : users.entrySet())
            if (entry.getKey().equals(inputLogin)) {
                userFound = true;
                if (entry.getValue().equals(inputPass)) {
                    System.out.println("Аутентификация прошла успешно!");
                    ok = true;
                }
            }
        if (!ok) {
            if (!userFound)
                System.out.println("Такой пользователь не найден");
            else System.out.println("Неверный пароль");
            boolean okLog = logCheck(inputLogin, inputPass, inputPass, "[\\w]{1,20}");
            if (okLog) {
                System.out.println("Логин и Пароль корректны");
            } else {
                System.out.println("Логин или Пароль не корректны");
            }
        }
    }


    public static boolean logCheck(String log, String pass, String conPass, String regex) {
        boolean x = true;
        try {
            if (!log.matches(regex)) {
                x = false;
                throw new WrongLoginException();
            }
            if (!(pass.matches(regex) && pass.equals(conPass))) {
                x = false;
                throw new WrongPasswordException();
            }

        } catch (WrongLoginException e) {
            System.err.println("Login is incorrect");
        } catch (WrongPasswordException e) {
            System.err.println("Password is incorrect");
        }

        return x;
    }
}