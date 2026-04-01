class Microsoft {
    String product;
    int version;
    boolean licensed;

    public Microsoft(){}

    public Microsoft(String product,int version,boolean licensed){
        this.product=product;
        this.version=version;
        this.licensed=licensed;
    }

    public void display(){
        System.out.println(product);
        System.out.println(version);
        System.out.println(licensed);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}