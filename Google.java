class Google {
    String service;
    int users;
    float rating;

    public Google(){}

    public Google(String service,int users,float rating){
        this.service=service;
        this.users=users;
        this.rating=rating;
    }

    public void display(){
        System.out.println(service);
        System.out.println(users);
        System.out.println(rating);
        System.out.println("?????????????????????????");
    }
}