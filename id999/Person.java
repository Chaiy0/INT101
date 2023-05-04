/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account.id999;

/**
 *
 * @author tinnapop
 */
public class Person {
//    2.1 add a private final field named "name" which is a "String".
    private final String name;
//2.2 add a private final field named "accounts" which is an array of "UserAccount" type 
//    and initialize its size to 5.
    private final UserAccount[] accounts = new UserAccount[5];
//2.3 add a private field named "count" which is an "int" which is used to count 
//    the number of "accounts" in the "UserAccount" array.
    private int count;
//2.4 add a public constructor that receives "name" parameter to initialize the "name" field.
    public Person(String name) {
        this.name = name;
    }
//2.5 override the "toString()" method to show the "name" field and all "UserAccount" 
//    in the "accounts" array.

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < accounts.length; i++) {
            sb.append(accounts[i]);
            
        }
      
        sb.append(" name=").append(name);
       
        sb.append('}');
        return sb.toString();
    }
    
    
//2.6 add a public "addAcount" method that receives a "userName" parameter of "String" type.
//    If this "userName" is valid and does not already exist (according to the methods in 
//    the "UserAccount" class), create a new "UserAccount" and add this account to the 
//    "accounts" array and return the newly-created "UserAccount". Otherwise, return null.
//    In case that the "accounts" array is full, return null as well.
    public UserAccount addAccount(String userName){
        if (UserAccount.isValid(userName) && !UserAccount.exists(userName)) {
            return accounts[count++] = new UserAccount(userName,new Person(""));
          
        }
        else if(count == 5){
            return null;
        }
        return null;
            
    }
    
//2.7 add a package-private "getName" method that return the "name" of the "Person".

    String getName() {
        return name;
    }


    

    
    
}
