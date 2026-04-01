class Twitter{
String username;
String email;
int followers;
long phone;
boolean verified;

public Twitter(String a,String b,int c,long d,boolean e){
username=a;
email=b;
followers=c;
phone=d;
verified=e;
}

public void display(){
System.out.println(username);
System.out.println(email);
System.out.println(followers);
System.out.println(phone);
System.out.println(verified);
System.out.println("*******************");
}
}