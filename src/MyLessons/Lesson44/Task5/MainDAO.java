package MyLessons.Lesson44.Task5;

public class MainDAO {
    public static void main(String[] args) {
        AddressDAO addressDAO = new AddressDAO();
        Address address1 = new Address();
        address1.setCountry("DC");
        address1.setCity("Gotham City");
        address1.setStreet("Arkham street 2");
        address1.setPostCode("22222");

        addressDAO.create(address1);
        System.out.println(addressDAO.findAll());
        System.out.println(addressDAO.findEntityById(1).toString());
        System.out.println(addressDAO.findEntityById(3).getStreet());

    }
}