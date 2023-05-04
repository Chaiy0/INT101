package account.id083;

import java.util.Arrays;

public class UserAccount {
    private final String userName;
    Person owner;
    private static final String[] allUsers = new String[10];
    private static int userNameCount;

    //1.5
    UserAccount(String userName, Person owner) {
        this.userName = userName;
        this.owner = owner;
        allUsers[userNameCount++] = userName;
        this.owner.addAccount(userName);
    }

    static boolean exists(String userName){
        if (userName.isBlank()) return false;
        for (int i = 0; i < userNameCount; i++){
            if (allUsers[i] == userName) return true;
        }
        return false;
    }

    static boolean isValid(String userName){
        return userName != null && !userName.isBlank();
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "UserName ='" + userName +
                ", OwnerName =" + owner.getName() + '}';
    }
}
