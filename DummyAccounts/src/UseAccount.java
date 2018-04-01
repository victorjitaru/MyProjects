public class UseAccount {
    public static void main(String[] args){
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.setName("Barry Burd");
        myAccount.setAddress("222 Cyberspace Lane");
        myAccount.setBalance(24.02);

        yourAccount.setName("Jane Q Public");
        yourAccount.setAddress("111 Consumer Street");
        yourAccount.setBalance(55.63);

        System.out.print(myAccount.getName() + " (" + myAccount.getAddress() + " ) has $" + myAccount.getBalance() + ".");
        System.out.println();
        System.out.print(yourAccount.getName() + "( " + yourAccount.getAddress() + " ) has $" + yourAccount.getBalance() + ".");

    }
}
