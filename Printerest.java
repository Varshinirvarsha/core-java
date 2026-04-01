class Pinterest {
String username;
String email;
int pins;
long phone;
boolean businessAccount;

public Pinterest(String a,String b,int c,long d,boolean e){
username=a;
email=b;
pins=c;
phone=d;
businessAccount=e;
}

public void display(){
System.out.println(username);
System.out.println(email);
System.out.println(pins);
System.out.println(phone);
System.out.println(businessAccount);
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
}
}