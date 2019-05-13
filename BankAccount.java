/** BankAccount is a class for a very simple bank account created with
 *  the three fields accountNumber, balance, and setupFee of types
 *  int, int, and int. We provide a constructor of signature
 *  public BankAccount(int accountNumber, int initialDeposit, int setupFee),
 *  getters for all three fields, and a setter for the balance;
 *  furthermore a toString() method.
 *
 *  The initial deposit is the amount of money that the customer pays in
 *  when they open their account.  The setup fee is charged to the
 *  account upon construction.
 *
 *  @author   Manfred Kerber
 *  @version  2018-10-09
 */
public class BankAccount{
    private int     accountNumber;
    private int     balance;
    private int     setupFee;

    /** BankAccount is a constructor for a very simple bank account created.
     *  @param  accountNumber The account number of the new bankaccount.
     *  @param  initialDeposit The amount payed in on opening the account.
     *  @param  setupFee The fee charged for opening the account.
     */
    public BankAccount(int     accountNumber, 
		       int     initialDeposit,
                       int     setupFee){
        this.accountNumber      = accountNumber;
        this.balance            = initialDeposit - setupFee;
        this.setupFee           = setupFee;
    }

    /* Now we write methods to get the parts of a BankAccount,
     * so called accessor methods.
     */

    /** 
     *  Getter for the account number.
     *  @return The account number of a BankAccount.
     */
    public int getAccountNumber(){
        return accountNumber;
    }

    /** 
     *  Getter for the balance.
     *  @return The balance of a BankAccount 
     */
    public int getBalance(){
        return balance;
    }

    /** 
     *  Getter for the setup fee.
     *  @return The fee to set up the account on construction.
     */
    public int getSetupFee(){
	return setupFee;
    }

    /** 
     *  Setter for the balance.
     *  @param balance The new updated balance of the bank account.
     */
    public void setBalance(int balance){
        this.balance = balance;
    }

    /** 
     *  toString defines how to print a BankAccount
     *  
     *  @return  the print type of an account
     */
    public String toString(){
	return "Account " + accountNumber + 
               " has a balance of \u00A3"       + balance +
            " (setup fee: \u00A3"    + setupFee + ")";
    }

    /*
     *  main method to test the class.
     */
    public static void main(String[] args) {
        BankAccount marysBankAccount = new BankAccount(54, 100, 20);
        System.out.println(marysBankAccount);
    }
}
