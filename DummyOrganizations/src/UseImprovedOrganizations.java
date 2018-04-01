public class UseImprovedOrganizations {
    public static void main(String[] args){
        Organization profOrg = new Organization();

        profOrg.name = "XYZ Company";
        profOrg.revenue = 100000.00;
        profOrg.profit = true;

        Organization nonProfOrg = new Organization();

        nonProfOrg.name = "ABC Company";
        nonProfOrg.revenue = 50000.00;
        nonProfOrg.profit = false;

        profOrg.display();
        System.out.println( "The tax for this company is " + profOrg.taxAmmount(10) + ".");
        System.out.println();
        nonProfOrg.display();
        System.out.println("The tax for this company is " + nonProfOrg.taxAmmount(2) + ".");
    }
}
