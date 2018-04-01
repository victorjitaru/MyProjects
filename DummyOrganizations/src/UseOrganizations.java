public class UseOrganizations {
    public static void main(String[] args){
        Organization profitOrganization = new Organization();

        profitOrganization.name = "XYZ Company";
        profitOrganization.revenue = 1000000.00;
        profitOrganization.profit = true;

        Organization nonProfitOrganization = new Organization();

        nonProfitOrganization.name = "ABC Company";
        nonProfitOrganization.revenue = 25000.00;
        nonProfitOrganization.profit = false;

        System.out.println(profitOrganization.name + " is a company with an annual revenue of " + profitOrganization.revenue);
        System.out.println(nonProfitOrganization.name + " is a company with an annual revenue of " + nonProfitOrganization.revenue);

    }
}
