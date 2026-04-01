class Snapchat{
String username;
String email;
int streak;
long phone;
boolean snapPlus;

public Snapchat(String a,String b,int c,long d,boolean e){
username=a;
email=b;
streak=c;
phone=d;
snapPlus=e;
}

public void display(){
System.out.println(username);
System.out.println(email);
System.out.println(streak);
System.out.println(phone);
System.out.println(snapPlus);
System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
}
}