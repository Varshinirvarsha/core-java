class Telegram{
String username;
String email;
int groups;
long phone;
boolean premium;

public Telegram(String a,String b,int c,long d,boolean e){
username=a;
email=b;
groups=c;
phone=d;
premium=e;
}

public void display(){
System.out.println(username);
System.out.println(email);
System.out.println(groups);
System.out.println(phone);
System.out.println(premium);
System.out.println("$$$$$$$$$$$$$$$$$$$$$");
}
}