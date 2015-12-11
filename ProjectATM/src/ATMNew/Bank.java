/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMNew;

/**
 *
 * @author Benjamin
 */
import java.util.*;
public class Bank 
{
    private String name;
    private ArrayList<User> users;
    private ArrayList<Account> accounts;
    
    /**
     * Create a new Bank object with empty lists of users and accounts
     * @param name 
     */
    public Bank(String name)
    {
        this.name = name;
        this.accounts = new ArrayList<Account>();
        this.users = new ArrayList<User>();
    }
    
    public String getNewUserUUID() 
    {
       //init
        String uuid;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique;
        
        // continuous loop until unique ID is created
        do 
        {
            //generate number
            uuid = "";
            for (int c = 0; c < len; c++)
            {
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
            
            // check to make sure ID is unique
            nonUnique = false;
            for(User u : this.users)
            {
                if (uuid.compareTo(u.getUUID()) == 0)
                {
                    nonUnique = true;
                    break;
                }
            }
            
        }
        while(nonUnique);
        
        return uuid;
    }
    /**
     * Generate a new universally unique ID for an account
     * @return the uuid
     */
    public String getNewAccountUUID()
    {
    //init
    String uuid;
    Random rng = new Random();
    int len = 10;
    boolean nonUnique;

    // continuous loop until unique ID is created
    do 
    {
        //generate number
        uuid = "";
        for (int c = 0; c < len; c++)
        {
            uuid += ((Integer)rng.nextInt(10)).toString();
        }

        // check to make sure ID is unique
        nonUnique = false;
        for(Account a : this.accounts)
        {
            if (uuid.compareTo(a.getUUID()) == 0)
            {
                nonUnique = true;
                break;
            }
        }

    }
    while(nonUnique);

    return uuid;
   }

    /**
     * 
     * @param anAcct 
     */
    public void addAccount(Account anAcct)
    {
        this.accounts.add(anAcct);
    }
    
    public User addUser(String firstName, String lastName, String pin)
    {
        // create a new User object and add it to our list
        User newUser = new User(firstName, lastName, pin, this);
        this.users.add(newUser);
        //create a savings account for the user
        // accounts list
        Account newAccount = new Account("Savings", newUser, this);
        newUser.addAccount(newAccount);
        this.accounts.add(newAccount);
        return newUser;
    }
    /**
     * 
     * @param userID
     * @param pin
     * @return 
     */
    public User userLogin(String userID, String pin)
    {
       // search through list of users
        for (User u : this.users)
        {
            if (u.getUUID().compareTo(userID) == 0 && u.validatePin(pin))
            {
                return u;
            }
        }
        // if we haven't found the user or have invalid pin
        return null;
        
    }
    /**
     * Returns name
     * @return 
     */
    public String getName()
    {
        return this.name;
    }
    
}
