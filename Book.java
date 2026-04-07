class Book {
      void begin() {
        System.out.println("Book Info");
           title("PHP");
    }
 int pages() {
        int prices = 250;
        return prices;
    }
void title(String name) {
      System.out.println("Book Name: " + name);
           int pageNo = pages();
             System.out.println("Pages: " + pageNo);
    }
}