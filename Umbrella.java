class Umbrella {

 static void start() {
    System.out.println("Umbrella Open");
        color("Blue");
  }
	static int length() {
        return 40;
    }

 static void color(String c) {
     System.out.println("Color: " + c);
         int l = length();
            System.out.println("Length: " + l);
  }
}

