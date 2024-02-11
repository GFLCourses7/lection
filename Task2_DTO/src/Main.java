public class Main {
    public static void main(String[] args) {

        BookDTO book = new BookDTO();
        book.setId(1L);
        book.setTitle("To Kill a Mockingbird");
        book.setAuthor("Harper Lee");


        System.out.println("Book Information:");
        System.out.println("ID: " + book.getId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());


        System.out.println("\nUsing toString() method:");
        System.out.println(book.toString());
    }
}