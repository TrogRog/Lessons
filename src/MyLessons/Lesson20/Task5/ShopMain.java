package MyLessons.Lesson20.Task5;


import java.util.ArrayList;
import java.util.Scanner;

public class ShopMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();
        User user = new User("log", "pass");

        Item[] items = new Item[]{
                new Item("item one", 100, Category.CAT1),
                new Item("item second", 300, Category.CAT2),
                new Item("item third", 50, Category.CAT1),
                new Item("item four", 50, Category.CAT2),
                new Item("good food", 600, Category.CAT3),
                new Item("bad food", 300, Category.CAT3),
                new Item("small food", 200, Category.CAT3),
        };


        UiState currentState = UiState.AUTH;
        Category currentCategory = Category.CAT1;

        boolean quit = false;
        while (!quit) {
            switch (currentState) {
                case AUTH:
                    System.out.println("Введите данные Логин и Пароль");
                    String login = scanner.nextLine();
                    String pass = scanner.nextLine();
                    if (user.auth(login, pass)) {
                        currentState = UiState.CATALOG;
                    } else {
                        System.out.println("Login or Password is not correct.\nBye, see you.");
                        quit = true;
                    }
                    break;
                case CATALOG:
                    System.out.println("--- Catalog ---");
                    for (Category category : Category.values()) {
                        System.out.println(category.getCategory());
                    }
                    System.out.println("enter category: ");
                    String categoryName = scanner.next();
                    for (Category category : Category.values()) {
                        if (category.getCategory().equals(categoryName)) {
                            currentCategory = category;
                            currentState = UiState.LIST;
                            break;
                        }
                    }

                    break;
                case LIST:
                    System.out.println("--- " + currentCategory.getCategory().toUpperCase() + " ---");
                    for (Item item : items) {
                        if (item.getCategory().equals(currentCategory)) {
                            System.out.println(item.getIndex() + " " + item.getName());
                        }
                    }
                    System.out.println("enter item to add into card: ");
                    int itemIndex = scanner.nextInt();
                    Item currentItem = null;
                    for (Item item : items) {
                        if (item.getIndex() == itemIndex) {
                            currentItem = item;
                            break;
                        }
                    }
                    if (currentItem != null) {
                        cart.add(new CartItem(currentItem, 1));
                    }
                    currentState = UiState.CART;

                    break;
                case CART:
                    System.out.println("--- Cart ---");
                    int total = 0;
                    for (CartItem cartItem : cart) {
                        System.out.println("name: " + cartItem.item.getName()
                                + " price:" + cartItem.item.getPrice() + " amount: " + cartItem.amount);
                        total += cartItem.item.getPrice() * cartItem.amount;
                    }
                    System.out.println("   Total price: " + total + " money");
                    System.out.println("enter command buy, catalog, quit");

                    String cartSelect = scanner.next();
                    switch (cartSelect) {
                        case "quit":
                            System.out.println("Good luck.");
                            quit = true;
                            break;
                        case "catalog":
                            currentState = UiState.CATALOG;
                            break;
                        case "buy":
                            System.out.println("Thank You. Welcome again");
                            cart.clear();
                            break;
                        default:
                            System.out.println("wrong command, try again");
                    }
                    break;
            }
        }
    }
}


