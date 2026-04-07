class NailCutter {
     static void open() {
        System.out.println("Using Nail Cutter");
          type("Steel");
  }
static int pieces() {
  System.out.println("Checking pieces");
        return 2;
  }
static void type(String name) {
   System.out.println("Type: " + name);
     int p = pieces();
       System.out.println("Pieces: " + p);
    }
}
