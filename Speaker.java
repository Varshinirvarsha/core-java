class Speaker {
   static int volume() {
       System.out.println("Reading volume");
        return 80;
 }
    static void brand(String brand) 
	{
         System.out.println("Brand: " + brand);
        int vol = volume();
        System.out.println("Volume Level: " + vol);
    }

  static void open() {
        System.out.println("Speaker On");
        brand("Boat");
}
}

