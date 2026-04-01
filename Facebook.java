class Facebook{
String name;
String email;
int friends;
long phone;
boolean active;

public Facebook(String a,String b,int c,long d,boolean e){
name=a;
email=b;
friends=c;
phone=d;
active=e;
}

public void display(){
System.out.println(name);
System.out.println(email);
System.out.println(friends);
System.out.println(phone);
System.out.println(active);
System.out.println("&&&&&&&&&&&&&&&&");
}
}