class SmartPoint{
    public static void main(String[] args){
        String[] stationery={
                "Notebook","Pen","Pencil","Marker","Highlighter",
                "Scale","Eraser","Sharpener","Sketch Pen","Color Pencil",
                "File","Folder","Sticky Notes","White Board","Board Marker" };

     String[] electronics={"USB Cable","Charger","Earphones","Powerbank","Extension Box"};
      String[] toys={"Toy Car","Doll","Puzzle","Ball","Blocks"};
       String[] gifts={"Gift Box","Greeting Card","Photo Frame","Show Piece"};
        String[] daily={"Umbrella","Torch","Battery","Lock","Keychain"};

        System.out.println("Stationery");
        System.out.println("0:"+stationery[0]);
        System.out.println("1:"+stationery[1]);
        System.out.println("2:"+stationery[2]);
        System.out.println("3:"+stationery[3]);
        System.out.println("4:"+stationery[4]);
        System.out.println("5:"+stationery[5]);
        System.out.println("6:"+stationery[6]);
        System.out.println("7:"+stationery[7]);
        System.out.println("8:"+stationery[8]);
        System.out.println("9:"+stationery[9]);
        System.out.println("10:"+stationery[10]);
        System.out.println("11:"+stationery[11]);
        System.out.println("12:"+stationery[12]);
        System.out.println("13:"+stationery[13]);
        System.out.println("14:"+stationery[14]);

   System.out.println("Electronics");
   
     for(int i=0;i<electronics.length;i++) {
         System.out.println(electronics[i]);
        }

        System.out.println("Toys");
   for(String x:toys) {
            System.out.println(x);
        }

        System.out.println("Gifts");
     for(int i=0;i<gifts.length;i++){
            System.out.println(gifts[i]);
        }

        System.out.println("Daily");
            for(String y:daily){
            System.out.println(y);
        }
    }
}