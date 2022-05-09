class Account{
//attributes of account
int id;
String name;
int balance;
Account(int id,String name,int balance){
    this.id=id;
    this.name=name;
    this.balance=balance;
System.out.println("constructor with args called");
}
 Account(){
 id=1;
 name="abc";
 balance=0;
 System.out.println("constructor without args called");
 }
 void deposit(int amt){
 balance+=amt;
 }
 void withdraw(int amt){
 balance-=amt;
 }
 void print(){
 System.out.println("******************");
 System.out.println("id:"+id);
 System.out.println("name:"+name);
 System.out.println("Balance:"+balance);
 }
 }
class Democonstructor{
public static void main(String[]args){
Account ob1=new Account();
Account ob2=new Account(2,"xyz",1000);
ob2.deposit(3000);
ob1.print();
ob2.withdraw(2000);
ob2.print();
}
}