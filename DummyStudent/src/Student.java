
public class Student {
    private String name;
    private int id;
    private double gpa;
    private Major major;


    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, Major major){
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public Student(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student(String name, int id, Major major, double gpa){
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }

    public void setMajor(Major major){
        this.major = major;
    }
    public Major getMajor(){
        return major;
    }

}
