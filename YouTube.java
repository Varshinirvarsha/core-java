class YouTube{
String channelName;
String email;
int subscribers;
long phone;
boolean monetized;

public YouTube(String a,String b,int c,long d,boolean e){
channelName=a;
email=b;
subscribers=c;
phone=d;
monetized=e;
}

public void display(){
System.out.println(channelName);
System.out.println(email);
System.out.println(subscribers);
System.out.println(phone);
System.out.println(monetized);
System.out.println("@@@@@@@@@@@@@@@@@");
}
}