class LinkedIn{
String name;
String email;
int connections;
long phone;
boolean premium;

public LinkedIn(String a,String b,int c,long d,boolean e){
name=a;
email=b;
connections=c;
phone=d;
premium=e;
}

public void display(){
System.out.println(name);
System.out.println(email);
System.out.println(connections);
System.out.println(phone);
System.out.println(premium);
System.out.println("####################");
}
}