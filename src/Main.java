public class Main {
    public static void main(String[] args) {
        Author azimov = new Author("Айзек", "Азимов");
        Author clarke = new Author("Артур", "Кларк");
        Book imRobot = new Book("Я Робот", 1950, azimov);
        Book spaceOddity = new Book("Космическая одиссея", 1968, clarke);
        System.out.printf("%s-%s %s%n%s", imRobot.getTitle(), imRobot.getAuthor().getFirstName(), imRobot.getAuthor().getSurname(), imRobot.getYear());
        System.out.printf(   "" +"%n%s-%s %s%n%s", spaceOddity.getTitle(), spaceOddity.getAuthor().getFirstName(), spaceOddity.getAuthor().getSurname(), spaceOddity.getYear());
        spaceOddity.setYear(2001);
        System.out.println(" "+spaceOddity.getYear());
    }
}