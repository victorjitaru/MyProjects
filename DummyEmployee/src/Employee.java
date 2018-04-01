public class Employee {
    private String name;
    private String jobTitle;

    public void setName(String name){
        if(!name.equals("")) {
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }

    public void cutCheck(double amountPayed){
        System.out.printf("Pay to the order of %s (%s) ***$%.2f%n", name, jobTitle, amountPayed);
    }
}
