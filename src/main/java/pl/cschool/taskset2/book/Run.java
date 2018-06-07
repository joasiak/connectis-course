package pl.cschool.taskset2.book;

public class Run {

    public static void main (String[] args) {

        Book myBook = new Book("The cat in the hat", new Author("Eric Freeman", 1974),2005);
        myBook.setPublishedBy("Helion");
        System.out.println(myBook.toString());
        Book bookOne = new Book("Head first",new Author("John Braun", 1962),2011);
        bookOne.setPublishedBy("Sowa");
        bookOne.setBestseller(Bestseller.YES);
        System.out.println(bookOne.toString());
    }

}
