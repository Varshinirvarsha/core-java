class HairBand {
static int size() {
    System.out.println("Checking size");
        return 3;
  }
static void style(String size)
 {
        System.out.println("Style: " + size);
        int type = size();
        System.out.println("Size: " + type);
  }
 static void open() {
    System.out.println("HairBand Pack");
      style("Elastic");
   }
}

