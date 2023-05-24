package OOPS_Lec1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Person P=new Person("Steve Arwin",22,180,"graduate");
//        System.out.println("Name->"+P.name+"Age->"+P.age+"Height->"+P.height+"Qualification->"+P.qualification);
//        Person P1=new Person("Shubham Narayan",62);
//        System.out.println("Name-"+P1.name+"Age->"+P1.age);
//        P is the reference variable of the object in the memory
//        P.name="Shubham Narayan";
//        P.age=25;
//        P.height=180;
//        P.qualification="B.tech";

//        Creating  agian a new object of the person  class
//        Person p1=new Person();
//        p1.name="Vikal Narayan";
//        p1.age=21;
//        p1.height=180;
//        p1.qualification="Undergrad";

//        ***Bank Account Part Starts from here ****
        System.out.println("Welcome to Lakshmi Cheat Fund  दो दिन में पैसा डबल :)");
        System.out.println("Please enter your accont no so that we can assist you better");
        Scanner sc=new Scanner(System.in);
        String accountNo=sc.nextLine();
        System.out.println(("Enter your name"));
        String name=sc.nextLine();
        System.out.println("Enter your initial balance");
        int balance=sc.nextInt();
        System.out.println("Enter your accout type");
        String accountType=sc.nextLine();

        BankAccount bankAccount=new BankAccount(accountNo,name,balance,accountType);

        System.out.println("Enter type of operation"+"\n"+"1. Check balance"+"\n"+"2. Add Money"+"\n"+"3. Withdraw Money"+"\n"+"4. Exit");

        int  choice=sc.nextInt();

        while(choice!=4){
            switch (choice){
                case 1:
                    int balanceGot=bankAccount.checkBalance();
                    System.out.println("The available balance is "+balanceGot);
                    break;
                case 2:
                    System.out.println("Enter the money to add ");
                    int money=sc.nextInt();
                    bankAccount.addMoney(money);
                    break;
                case 3:
                    System.out.println("Enter the money to withdraw ");
                    int moneyToWithdraw=sc.nextInt();
                    bankAccount.withdrawMoney(moneyToWithdraw);
                    break;


            }
            System.out.println("Thank you for operating !!");
            choice=sc.nextInt();
        }
    }
}
//This is a class: Blueprint of the object
class Person{
//        ****Constructors ******
        public  Person(String name,int age,int height,String qualification){
//            Sting name,int age are all the parametes and we are usign the this keyword in order to initilaize the local varia
//            name=newName;
//            age=newAge;
//            height=newHeight;
//            qualification=newqualification;
            this.name=name;
            this.age=age;
            this.height=height;
            this.qualification=qualification;
        }

//        ******* We can also have the constructors with diffrent no of parameters ****
    public Person(String name,int age){
            this.name=name;
            this.age=age;
    }
//        Local variables have been initialized with the help of constructors
//    These all are attributes that describe a particular class
    String name;
    int age;
    int height;
    String qualification;

//    Methods are the function which the object of this class can call

    public void sing(){
        System.out.println("This"+name+"is singing a song");
    }
}
class BankAccount{
    String accountNo;
    String accountName;
    int balance;
    String accountType;

//    constructors
    public BankAccount(String accountNo, String accountName,int balance,String accountType){
        this.accountNo=accountNo;
        this.accountName=accountName;
        this.balance=balance;
        this.accountType=accountType;
    }

//    Functions
    int checkBalance(){
        return balance;
    }
    public String addMoney(int money){
        balance=balance+money;
        return "Money added successfully in th balance the new balance is "+balance;
    }

    public String withdrawMoney(int money){
        if(balance>money){
            balance=balance-money;
            return "MOney withdrawn and new balance is "+balance;
        }
        else{
            return "Insufficient balance";
        }
    }
}