package MyLessons.Lesson32.Task1;

import java.util.Scanner;

public class LessonMain {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные Логин");
        String login = scanner.nextLine();
        System.out.println("Введите данные Пароль");
        String pass = scanner.nextLine();
        System.out.println("Введите данные Пароль еще раз");
        String conPass = scanner.nextLine();
        System.out.println(logCheck(login, pass, conPass, "[\\w]{1,20}"));
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
