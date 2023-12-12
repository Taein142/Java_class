package ch10_class.ex8;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
//        book.bookTitle = "책제목1";
        book.setBookTitle("판도라하츠");
        String title = book.getBookTitle();
        System.out.println("title = " + title);
        System.out.println(book.getBookTitle());

        book.setBookAuthor("Jun Mochizuki");
        System.out.println(book.getBookAuthor());
    }
}
