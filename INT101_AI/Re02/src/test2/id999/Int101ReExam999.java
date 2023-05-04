package test2.id999;

import account.id999.Person;
import account.id999.UserAccount;

public class Int101ReExam999 {
    public static void main(String[] args) {
        Person person = new Person("John Smith");
        System.out.println(person); // expected output: "Name: John Smith, Accounts: []"

        UserAccount account1 = person.addAccount("jsmith01");
        System.out.println(account1); // expected output: "Username: jsmith01, Owner Name: John Smith"

        UserAccount account2 = person.addAccount("jsmith01");
        System.out.println(account2); // expected output: "null"

        UserAccount account3 = person.addAccount("");
        System.out.println(account3); // expected output: "null"

        UserAccount account4 = person.addAccount("jsmith02");
        System.out.println(account4); // expected output: "Username: jsmith02, Owner Name: John Smith"

        UserAccount account5 = person.addAccount("jsmith03");
        UserAccount account6 = person.addAccount("jsmith04");
        UserAccount account7 = person.addAccount("jsmith05");
        UserAccount account8 = person.addAccount("jsmith06");
        UserAccount account9 = person.addAccount("jsmith07");
        UserAccount account10 = person.addAccount("jsmith08");
        UserAccount account11 = person.addAccount("jsmith09");
        System.out.println(account11); // expected output: "null"

        System.out.println(person); // expected output: "Name: John Smith, Accounts: [Username: jsmith01, Owner Name: John Smith, Username: jsmith02, Owner Name
        }
}