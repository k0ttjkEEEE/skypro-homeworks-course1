package pro.sky.java.course1.lesson8;

public class Main {


    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and peace", levTolstoy, 1865);
        System.out.println("warAndPeace.name = " + warAndPeace.name);
        System.out.println("warAndPeace.author = " + warAndPeace.author);
        System.out.println("warAndPeace.year = " + warAndPeace.year);

        Author fedorDostoevsky = new Author("Fedor", "Dostoevsky");
        Book crimeAndPunishment = new Book("Crime and punishment", fedorDostoevsky, 1866);
        System.out.println("crimeAndPunishment.name = " + crimeAndPunishment.name);
        System.out.println("crimeAndPunishment.author = " + crimeAndPunishment.author);
        System.out.println("crimeAndPunishment.year = " + crimeAndPunishment.year);

        warAndPeace.setYear(1866);
        System.out.println("warAndPeace.newYear = " + warAndPeace.year);

    }

}



