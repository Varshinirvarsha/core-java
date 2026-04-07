class Hospital {

        int beds() {
        int testcost = 20;
        return testcost;
    }
    void ward(String name) {
        System.out.println("Ward: " + name);
        int bedNo = beds();
        System.out.println("Beds: " + bedNo);
    }

 void open() {
    System.out.println("Hospital Details");
        ward("General");
    }
}