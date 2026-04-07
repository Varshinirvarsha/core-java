class Bus {
        void start() {
        System.out.println("Bus Service");
        route("Mandya");
		}
int seats() {
        int stand = 40;
        return stand;
    }
void route(String place) {
    System.out.println("Route: " + place);
        int number= seats();
          System.out.println("Seats: " +number);
    }
}
