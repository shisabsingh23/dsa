import pojo.ComparableBookPojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorMainRunner

{
    public static void main(String[] args) {
        List<ComparableBookPojo> comparableBookPojos = new ArrayList<>(Arrays.asList(
                new ComparableBookPojo("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new ComparableBookPojo("Moby Great", "Herman Melville", 1851),
                new ComparableBookPojo("Great Singer secret ", "Zen Malik", 1834),
                new ComparableBookPojo("Zebra Longevity ", "Dr Sam", 1834),
                new ComparableBookPojo("A unique book", "Adam  ", 1851),
                new ComparableBookPojo("1984", "George Orwell", 1949)
        ));

        Collections.sort(comparableBookPojos);

        for (ComparableBookPojo comparableBookPojo : comparableBookPojos) {System.out.println(comparableBookPojo.author);}

    }

}
