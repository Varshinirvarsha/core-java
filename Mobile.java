class Mobile {

    int battery()
	{
        int cost = 5000;
        return cost;
}
	void brand(String name) {
        System.out.println("Mobile: " + name);
        int power = battery();
        System.out.println("Battery: " + power);
          }
 void show() {
        System.out.println("Mobile Details");
            brand("Vivo");
  }
}