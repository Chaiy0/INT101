/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account.id999;

/**
 *
 * @author tinnapop
 */
public class UserAccount {
    private final String userName;
    final Person owner;
    private static final String[] allUsers = new String[10];
    private static int userNameCount ;
//    1.5 add a package-private (default) constructor that receives a "userName" of "String" type
//    and an "owner" of "Person" type. This constructor initializes the respective fields.
//    It also adds this "userName" to the "allUsers" array and increases the "userNameCount" by 1.

    UserAccount(String userName, Person owner) {
        this.userName = userName;
        this.owner = owner;
        allUsers[userNameCount] = userName;
        userNameCount++;
        
    }
//    1.6 add a package-private (default) static method named "exists". This method receives 
//    a "userName" of "String" type and returns a "boolean".  This method returns "true" 
//    if the "userName" parameter is in the "allUsers" array. Otherwise, it returns "false".
    static boolean exists(String userName){
        for (int i = 0; i < allUsers.length; i++) {
            if ( allUsers[i].equals(userName)) {
                return true;
            }
        }
       return false;
    }    
    
//    1.7 add a package-private (default) static method named "isValid". This method receives 
//    a "userName" of "String" type and returns a "boolean".  This method returns "true" 
//    if the "userName" parameter is not null and not blank.  Otherwise, it returns "false".
    static boolean isValid(String userName){
        if (!userName.isEmpty() && userName != null) {
             return true; 
        }
        return false;
    }
    
//    1.8 override the "toString()" method to show the "userName" and the "name" of the "owner".

    @Override
    public String toString() {
        return "UserAccount{" + "userName=" + userName + ", owner=" + owner.getName() + '}';
    }
    
    
    
}
