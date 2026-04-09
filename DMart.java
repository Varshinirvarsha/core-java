class DMart{
    public static void main(String[] args){
        String[] cleaning={
                "Harpic","Lizol","Vim","Surf Excel","Ariel",
                "Dettol","Colin","Domex","Pril","Comfort",
                "Wheel","Henko","Genteel","Safewash","Ujala" };

        String[] bath={"Lux","Dove","Pears","Santoor","Liril",
                "Clinic Plus","Pantene","Sunsilk","Tresemme","Head & Shoulders"};

        String[] utensils={ "Pressure Cooker","Tawa","Kadai","Pan","Knife",
                "Spatula","Peeler","Grater","Ladle","Tong"};

        String[] storage={"Bucket","Mug","Dustbin","Basket","Hanger",
                "Cloth Stand","Storage Box","Drawer","Rack","Shelf"};

        String[] plastic={"Water Bottle","Lunch Box","Container","Jar","Tray",
                "Basket","Plate","Glass","Bowl","Spoon"};

        System.out.println("Cleaning Items");
        System.out.println("0:"+cleaning[0]);
        System.out.println("1:"+cleaning[1]);
        System.out.println("2:"+cleaning[2]);
        System.out.println("3:"+cleaning[3]);
        System.out.println("4:"+cleaning[4]);
        System.out.println("5:"+cleaning[5]);
        System.out.println("6:"+cleaning[6]);
        System.out.println("7:"+cleaning[7]);
        System.out.println("8:"+cleaning[8]);
        System.out.println("9:"+cleaning[9]);
        System.out.println("10:"+cleaning[10]);
        System.out.println("11:"+cleaning[11]);
        System.out.println("12:"+cleaning[12]);
        System.out.println("13:"+cleaning[13]);
        System.out.println("14:"+cleaning[14]);

  System.out.println("Bath Items");
     for(int i=0;i<bath.length;i++) {
            System.out.println(bath[i]);
        }

        System.out.println("Utensils");
    for(String x:utensils) {
            System.out.println(x);
        }

        System.out.println("Storage");
   for(int i=0;i<storage.length;i++) {
            System.out.println(storage[i]);
        }

        System.out.println("Plastic");
    for(String y:plastic) {
            System.out.println(y);
        }
 }
}