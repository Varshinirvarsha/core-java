class Netflix {
    String series;
    int seasons;
    double rating;

    public Netflix(){}

    public Netflix(String series,int seasons,double rating){
        this.series=series;
        this.seasons=seasons;
        this.rating=rating;
    }

    public void display(){
        System.out.println(series);
        System.out.println(seasons);
        System.out.println(rating);
        System.out.println("/////////////////////////");
    }
}