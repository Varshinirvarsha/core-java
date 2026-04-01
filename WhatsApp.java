class WhatsApp {
String username;
long phone;
int chats;
String status;
boolean online;

public WhatsApp(String a,long b,int c,String d,boolean e){
username=a;
phone=b;
chats=c;
status=d;
online=e;
}

public void display(){
System.out.println(username);
System.out.println(phone);
System.out.println(chats);
System.out.println(status);
System.out.println(online);
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
}
}