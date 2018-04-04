
public class ShowStudent {

    public static void main(String[] args) {
        String format1 = "Student %s (id %d) doesn't have a Major and a GPA yet%n";
        String format2 = "Student %s (id %d) has a Major in %s and a GPA of %4.2f%n";
        String format3 = "Student %s (id %d) has a Major in %s and no GPA results yet%n";
        String format4 = "Student %s (id %d) has no Major yet but has a GPA of %4.2f%n";

        System.out.println("List Mode");
        Student stud1 = new Student("John Wick", 101);
        System.out.printf(format1, stud1.getName(), stud1.getId());
        System.out.println();

        Student stud2 = new Student("Mike Mickey", 95, Major.PHYSICS, 4.00);
        System.out.printf(format2, stud2.getName(), stud2.getId(), stud2.getMajor(), stud2.getGpa());
        System.out.println();

        Student stud3 = new Student("Joan Collins", 21, Major.COMPUTER_SCIENCE);
        System.out.printf(format3, stud3.getName(), stud3.getId(), stud3.getMajor());
        System.out.println();

        Student stud4 = new Student("Hunky Dorry", 2, 2.59);
        System.out.printf(format4, stud4.getName(), stud4.getId(), stud4.getGpa());
        System.out.println();

        System.out.println("Name\t\tID\t\tGPA\t\tMajor");
        System.out.println(stud1.getName() + "\t" + stud1.getId() + "\t\t" + stud1.getGpa() + "\t\t" + stud1.getMajor());
        System.out.println(stud2.getName() + "\t" + stud2.getId() + "\t\t" + stud2.getGpa() + "\t\t" + stud2.getMajor());
        System.out.println(stud3.getName() + "\t" + stud3.getId() + "\t\t" + stud3.getGpa() + "\t\t" + stud3.getMajor());
        System.out.println(stud4.getName() + "\t" + stud4.getId() + "\t\t" + stud4.getGpa() + "\t\t" + stud4.getMajor());

    }
}
