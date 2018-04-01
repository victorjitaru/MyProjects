public class UseImprovedAccount {
    public static void main(String[] args){
        Account myAccount = new Account();

        myAccount.setName("Barry Burd");
        myAccount.setAddress("222 CyberSpace LAne");
        myAccount.setBalance(24.02);

        Account yourAccount = new Account();

        yourAccount.setName("Jane Q Public");
        yourAccount.setAddress("111 Consumer Street");
        yourAccount.setBalance(55.63);

        myAccount.display();
        System.out.println("This account has an interest of: " + myAccount.getInterest(2.9));
        System.out.println();
        yourAccount.display();
        System.out.println("This account has an interest of: " + yourAccount.getInterest(3.98));
    }
}
