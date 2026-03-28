class BloodCampMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Blood Donation Camp");

        String name = "Rahul";
        int age = 22;

        String result = BloodBank.checkAge(name, age);

        System.out.println(result);
    }

}