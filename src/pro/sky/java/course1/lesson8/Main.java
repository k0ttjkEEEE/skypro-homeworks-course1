package pro.sky.java.course1.lesson8;

public class Main {


    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and peace", levTolstoy, 1865);
        System.out.println("warAndPeace.name = " + warAndPeace.getName());
        System.out.println("warAndPeace.author = " + warAndPeace.getAuthor());
        System.out.println("warAndPeace.year = " + warAndPeace.getYear());

        Author fedorDostoevsky = new Author("Fedor", "Dostoevsky");
        Book crimeAndPunishment = new Book("Crime and punishment", fedorDostoevsky, 1866);
        System.out.println("crimeAndPunishment.name = " + crimeAndPunishment.getName());
        System.out.println("crimeAndPunishment.author = " + crimeAndPunishment.getAuthor());
        System.out.println("crimeAndPunishment.year = " + crimeAndPunishment.getYear());

        warAndPeace.setYear(1866);
        System.out.println("warAndPeace.newYear = " + warAndPeace.getYear());
    }
}