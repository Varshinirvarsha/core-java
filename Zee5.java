class Zee5 {
    String showName;
    int episodes;
    float rating;

    public Zee5(){}

    public Zee5(String showName,int episodes,float rating){
        this.showName=showName;
        this.episodes=episodes;
        this.rating=rating;
    }

    public void display(){
        System.out.println(showName);
        System.out.println(episodes);
        System.out.println(rating);
        System.out.println("*************************");
    }
}