class Moj {
    String videoTitle;
    int likes;
    boolean trending;

    public Moj(){}

    public Moj(String videoTitle,int likes,boolean trending){
        this.videoTitle=videoTitle;
        this.likes=likes;
        this.trending=trending;
    }

    public void display(){
        System.out.println(videoTitle);
        System.out.println(likes);
        System.out.println(trending);
        System.out.println("########################");
    }
}