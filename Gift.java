class Gift {
   static int items() {
      System.out.println("Counting items");
         return 5;
}
static void name(String name) {
        System.out.println("Gift: " + name);
        int no= items();
        System.out.println("Items: " + no);
    }

    static void open() {
        System.out.println("Gift Box");
        name("Chocolate Set");
    }
}