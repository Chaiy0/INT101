package account.id999;
//  2. create a class name "Person" in "account.id999" package.
public class Person {
//    2.1 add a private final field named "name" which is a "String".
//    2.2 add a private final field named "accounts" which is an array of "UserAccount" type 
//    and initialize its size to 5.
//    2.3 add a private field named "count" which is an "int" which is used to count 
//    the number of "accounts" in the "UserAccount" array.
    private final String name;
    private final UserAccount[] accounts = new UserAccount[5];
    private int count = 0;

//    2.4 add a public constructor that receives "name" parameter to initialize the "name" field.
    public Person(String name) {
        this.name = name;
    }
    
//    2.6 add a public "addAcount" method that receives a "userName" parameter of "String" type.
//    If this "userName" is valid and does not already exist (according to the methods in 
//    the "UserAccount" class), create a new "UserAccount" and add this account to the 
//    "accounts" array and return the newly-created "UserAccount". Otherwise, return null.
//    In case that the "accounts" array is full, return null as well.
    public UserAccount addAccount(String userName) {
        if (!UserAccount.isValid(userName) || UserAccount.exists(userName) || count >= accounts.length) {
            return null;
        }
        UserAccount newAccount = new UserAccount(userName, this);
        accounts[count] = newAccount;
        count++;
        return newAccount;
    }
    
//    2.7 add a package-private "getName" method that return the "name" of the "Person".
    String getName() {
        return name;
    }
//    2.5 override the "toString()" method to show the "name" field and all "UserAccount" 
//    in the "accounts" array.
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(name).append(", Accounts: [");
        for (int i = 0; i < count; i++) {
            builder.append(accounts[i].toString());
            if (i < count - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
