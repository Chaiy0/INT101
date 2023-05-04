package account.id083;

import java.util.Arrays;


public class Person {
    private final String name;
    private final UserAccount[] accounts = new UserAccount[5];
    private int count;

    public Person(String name){
        this.name = name;
    }

    public UserAccount addAccount(String userName){
        if (count == accounts.length) return null;
        if (!UserAccount.exists(userName) && UserAccount.isValid(userName)){
            UserAccount newAccount = new UserAccount(userName,this);
            accounts[count++] = newAccount;
            return newAccount;
        }
        return null;
    }
    String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                ", count=" + count +
                '}';
    }
    //sb builder
    public String toString2() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Hello My Boyyyy \n");
        sb.append("Name:").append(name).append("\n");
        for (int i = 0; i < accounts.length; i++) {
            sb.append(accounts[i]).append(", \n");
        }
        sb.append("Member in array").append(count);
        return sb.toString();
    }
}