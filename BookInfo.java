class BookInfo {

    static String bookTitle = "Java Basics";
    static int pages = 350;
    static float price = 499.99f;

    public static void main(String[] args) {

        String author = "Ravi";
        char grade = 'A';
        boolean available = true;

        System.out.println("Book Title: " + bookTitle);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);

        System.out.println("Author: " + author);
        System.out.println("Grade: " + grade);
        System.out.println("Available: " + available);
    }
}