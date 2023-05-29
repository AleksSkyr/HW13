package hw12;

public class Main {

    public static void main(String[] args) {

        Author author = new Author("Говарда", "Лавкрафта");
        Author author1 = new Author("Джордж", "Оруэлл");

        Book theMountainsOfMadness = new Book(author, "Хребет безумия.", 1936);
        Book nineteenEightyFour = new Book(author1, "1984.", 1949);

        theMountainsOfMadness.setPublishingYear(1928);
        nineteenEightyFour.setPublishingYear(1456);

        System.out.println("Автор: " + author + " Название книги: "
                + theMountainsOfMadness.getBookName() + " Изданна в: " + theMountainsOfMadness.getPublishingYear());
        System.out.println("Автор: " + author1 + " Название книги: "
                + nineteenEightyFour.getBookName() + " Изданна в: " + nineteenEightyFour.getPublishingYear());

        System.out.println("Автор: " + author.foolAuthor());
        System.out.println("Автор: " + author1.foolAuthor());

        nineteenEightyFour.printBook();
        theMountainsOfMadness.printBook();


    }
}

