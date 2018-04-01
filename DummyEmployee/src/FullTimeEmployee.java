public class FullTimeEmployee extends Employee {
    private double weekSalary;
    private double benefitDeduction;

    public void setWeekSalary(double weekSalary){
        this.weekSalary = weekSalary;
    }
    public double getWeekSalary(){
        return weekSalary;
    }

    public void setBenefitDeduction(double benefitDeduction){
        this.benefitDeduction = benefitDeduction;
    }
    public double getBenefitDeduction(){
        return benefitDeduction;
    }

    public double findPaymentAmount(){
        return weekSalary - benefitDeduction;
    }
}
