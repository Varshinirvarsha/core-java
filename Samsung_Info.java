class Samsung_Info {

   
    static String[] mobileNames = {"Galaxy A10", "Galaxy A20", "Galaxy A30", "Galaxy A40", "Galaxy A50", "Galaxy A60", "Galaxy A70", "Galaxy A80"};
    static int[] prices = {12000,15000,18000,20000,22000,25000,28000,30000};
    static String[] colors = {"Black","Blue","White","Green","Silver","Gold","Purple","Red"};
    static int[] storage = {32,64,128,256,64,128,256,512};
    static int[] battery = {4000,4500,5000,4500,5000,6000,4500,5000};

    static String[] getMobileNames() {
        return mobileNames;
    }

    static int[] getPrices() {
        return prices;
    }

    static String[] getColors() {
        return colors;
    }

    static int[] getStorage() {
        return storage;
    }

    static int[] getBattery() {
        return battery;
    }
}