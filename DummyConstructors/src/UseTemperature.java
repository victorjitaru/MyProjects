public class UseTemperature {
    public static void main(String[] args) {

        String format = "%5.2f degrees %s\n";

        Temperature temp = new Temperature();
        System.out.printf(format, temp.getNumber(), temp.getScale());
        temp.setNumber(70.00);
        temp.setScale(TempScale.FAHRENHEIT);
        System.out.printf(format, temp.getNumber(), temp.getScale());
        System.out.println();
        temp = new Temperature(32.00);
        System.out.printf(format, temp.getNumber(), temp.getScale());
        System.out.println();
        temp = new Temperature(TempScale.CELSIUS);
        System.out.printf(format, temp.getNumber(), temp.getScale());
        System.out.println();
        temp = new Temperature(2.73, TempScale.KELVIN);
        System.out.printf(format, temp.getNumber(), temp.getScale());
    }
}
