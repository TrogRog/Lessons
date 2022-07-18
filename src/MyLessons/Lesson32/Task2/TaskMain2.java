package MyLessons.Lesson32.Task2;


import MyLessons.Lesson32.Task1.WrongLoginException;
import MyLessons.Lesson32.Task1.WrongPasswordException;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class TaskMain2 {
    public static void main(String[] args) {

        Map<String, String> users = new HashMap<>();

        users.put("LogA", "PassA");
        users.put("LogB", "PassB");
        users.put("LogC", "PassC");

        String inputLogin = "LogB";
        String inputPass = "PassB";




        if (inputPass.equals(users.get(inputLogin))) {
            System.out.println("Welcome! You logged in");
        } else {
            System.out.println("User not found");
            boolean ok = logCheck(inputLogin, inputPass, inputPass, "[\\w]{1,20}");
            if (ok) {
                System.out.println("You can register");
            } else {
                System.out.println("Credentials is incorrect");
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
        } catch (WrongLoginException e) {
            System.err.println("Login is incorrect");
        }
        try {
            if (!(pass.matches(regex) && pass.equals(conPass))) {
                x = false;
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException e) {
            System.err.println("Password is incorrect");
        }
        return x;
    }
}