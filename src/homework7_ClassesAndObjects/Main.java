package homework7_ClassesAndObjects;

public class Main {
    public static void main (String[] args) {
        Author julianBarns = new Author("Julian", "Barns");
        Author vicktorPelevin = new Author("Виктор", "Пелевин");
        Book theOnlyStory = new Book("The Only Story", julianBarns, 2018);
        Book t = new Book ("t", vicktorPelevin, 2009);

        t.setYearOfPublication(2011);

        System.out.println(theOnlyStory);
        System.out.println(t);
    }
}