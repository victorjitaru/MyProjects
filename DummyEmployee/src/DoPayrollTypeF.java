public class DoPayrollTypeF {
    public static void main(String[] args){
        FullTimeEmployee ftEmp = new FullTimeEmployee();

        ftEmp.setName("Barry Burd");
        ftEmp.setJobTitle("CEO");
        ftEmp.setWeekSalary(5000.00);
        ftEmp.setBenefitDeduction(500.00);
        ftEmp.cutCheck(ftEmp.findPaymentAmount());
        System.out.println();

        PartTimeEmployee ptEmp = new PartTimeEmployee();

        ptEmp.setName("Steve Source");
        ptEmp.setJobTitle("driver");
        ptEmp.setHourlyRate(7.53);
        ptEmp.cutCheck(ptEmp.findPaymentAmount(10));
    }
}
