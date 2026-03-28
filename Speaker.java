class Speaker {

    public static void main(String[] args) {

        System.out.println("Welcome to Smart Speaker System");
		
		System.out.println("i need speaker prices");
		System.out.println(getPrices());
		System.out.println("ok i seed ");
		int cost=5;
		int prices=getPrices(cost);
		System.out.println(prices);
		
		
		startDevice();  

        int volumeLevel = 15;
        float bassLevel = 7.5f;
        adjustSound(volumeLevel, bassLevel);  

        float deviceVersion = getSoftwareVersion(); 
        System.out.println("Software Version: " + deviceVersion);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
     static void startDevice() {
        System.out.println("Speaker is starting...");
        System.out.println("Device is ready to use.");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
	
    }

    static void adjustSound(int volume, float bass) {
        System.out.println("Adjusting sound settings...");
        System.out.println("Volume Level: " + volume);
        System.out.println("Bass Level: " + bass);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
	
	static int getPrices(int prices){
		System.out.println("yes i will");
		return Prices;
	}

    static float getSoftwareVersion() {
        System.out.println("Checking software version...");
        float version = 2.1f;
        return version;
    }
}