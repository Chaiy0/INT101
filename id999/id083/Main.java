package account.id083;

import account.id083.UserAccount;

public class Main {
    public static void main(String[] args) {
//        testToString();
//        testPerson();
//        testPersonToString();
        testAddAccount();
    }

    private static void testToString(){
        Person p1 = new Person("Sarawit");
        UserAccount user1 = new UserAccount("BomScoob", p1);
        System.out.println(user1);
        System.out.println(p1);
    }

    private static void testPerson(){
        Person p1 = new Person("Sarawit");
    }

    private static void testPersonToString(){
        Person p1 = new Person("Sarawit");
        System.out.println(p1);
    }

    private static void testAddAccount(){
        Person p1 = new Person("Sarawit");
        UserAccount user1 = new UserAccount("BomScoob", p1);
        UserAccount user2 = new UserAccount("BomScoob2", p1);
        System.out.println("Add account 3:" + p1.addAccount("BomScoob3"));
        System.out.println("Add account already exists :" + p1.addAccount("BomScoob"));

        System.out.println(p1.toString2());
    }
}