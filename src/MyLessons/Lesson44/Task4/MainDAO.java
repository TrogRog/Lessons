package MyLessons.Lesson44.Task4;

public class MainDAO {
    public static void main(String[] args) {
        PhoneDAO phoneDAO = new PhoneDAO();
        System.out.println(phoneDAO.findAll());
        System.out.println(phoneDAO.findEntityById(1).toString());
        System.out.println(phoneDAO.findEntityById(3).getPhone_number());
    }
}