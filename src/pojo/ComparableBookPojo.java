package pojo;

public class ComparableBookPojo implements Comparable<ComparableBookPojo> {
    public String title;
    public String author;
    public int year;

    public ComparableBookPojo(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public int compareTo(ComparableBookPojo other) {
        System.out.println(this.author + " is getting compared with " + "author name " + other.author + "-> " + Integer.compare(this.year, other.year));
        System.out.println("----------------------------");
        //return Integer.compare(this.year, other.year); // Natural ordering by title

        return this.title.compareTo(other.title); // Natural ordering by title
    }

}
