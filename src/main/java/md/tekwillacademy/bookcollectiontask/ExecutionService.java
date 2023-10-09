package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {
        Book mihaisBook = new Book("Atomic Habits", "James C.");
        Book alexsBook = new Book("Crime and Punishment", "Feodor D.");
        Book ruxandasBook = new Book("Karamazov Brothers", "Feodor D.");
        Book veronicasBook = new Book("To Kill a Mockingbird", "Harper L.");
        Book mihais2Book = new Book("1984", "George O.");

        mihais2Book.printTheBookDetails();
        mihaisBook.printTheBookDetails();
        alexsBook.printTheBookDetails();
        ruxandasBook.printTheBookDetails();
        veronicasBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(veronicasBook);
        carturestiLibrary.addBook(ruxandasBook);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.addBook(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.deleteABookIfExists(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        carturestiLibrary.printAllTheBooks();

        Library victorsLibrary = new Library("Cartier");

        victorsLibrary.addBook(alexsBook);
        victorsLibrary.addBook(ruxandasBook);
        victorsLibrary.addBook(veronicasBook);

        System.out.println(victorsLibrary.getTheStockStatusNumber());
        victorsLibrary.printAllTheBooks();

        Map<String, Library> librariesMap = new HashMap<>();

        librariesMap.put("Str. Stefan cel Mare 136", carturestiLibrary);
        librariesMap.put("Str. Dacia 24/3 ap. 01", victorsLibrary);

        System.out.println(librariesMap.size());

        System.out.println(librariesMap.get("Str. Stefan cel Mare 136").getLibraryName());
        librariesMap.get("Str. Stefan cel Mare 136").printAllTheBooks();
        System.out.println(librariesMap.get("Str. Dacia 24/3 ap. 01").isThereSuchABookInTheStock(veronicasBook));

        int[] dataTable = new int[6];
        dataTable[1] = 575343;
        dataTable[2] = 12;
        dataTable[3] = 52;
        dataTable[4] = 5;
        dataTable[5] = 354354;
        dataTable[0] = 9;

        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));

        int[] dataTableShort = {3, 6, 5, 2, 4, 7, 4564, 35, 56, 1};

        System.out.println(IntNumberArrayService.findMin(dataTableShort));
        System.out.println(IntNumberArrayService.getAvg(dataTableShort));
    }
}
