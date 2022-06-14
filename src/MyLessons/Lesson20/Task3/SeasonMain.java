package MyLessons.Lesson20.Task3;

public class SeasonMain {
    public static void main(String[] args) {
        System.out.println("----------------");
        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println("----------------");
        print(Season.AUTUMN);
        print(Season.SUMMER);
        System.out.println("----------------");
        printSeason();

    }

    public static void print(Season season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SUMMER -> System.out.println("Я люблю лето");
            case SPRING -> System.out.println("Я люблю весну");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }

    public static void printSeason() {
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.getAvrTmperature() + " " + s.getDescription());
        }
    }
}
