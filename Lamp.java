class Lamp {

static int watts() {
        System.out.println("Reading power");
        return 12;
    }
static void brand(String band) 
{
        System.out.println("Lamp Brand: " + band);
        int power = watts();
        System.out.println("Watts: " + power);
    }

   static void start()
   {
        System.out.println("Lamp On");
        brand("Philips");
    }
}