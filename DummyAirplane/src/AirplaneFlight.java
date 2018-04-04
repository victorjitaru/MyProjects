import java.time.LocalTime;

public class AirplaneFlight {
    private int flightNumber;
    private Airport departAirport;
    private Airport arrivalAirport;
    private LocalTime departTime;
    private LocalTime arrivalTime;

    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    public int getFlightNumber(){
        return flightNumber;
    }

    public void setDepartAirport(Airport airport){
        departAirport = airport;
    }
    public Airport getDepartAirport(){
        return departAirport;
    }

    public void setArrivArirport(Airport airport){
        arrivalAirport = airport;
    }
    public Airport getArrivalAirport(){
        return arrivalAirport;
    }

    public void setArrivalTime(LocalTime arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    public LocalTime getArrivalTime(){
        return arrivalTime;
    }

    public void setDepartTime(LocalTime departTime){
        this.departTime = departTime;
    }
    public LocalTime getDepartTime(){
        return departTime;
    }

    public AirplaneFlight(int flightNumber, Airport departAirport, Airport arrivalAirport){
        this.flightNumber = flightNumber;
        this.departAirport = departAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public AirplaneFlight(int flightNumber, Airport departAirport, Airport arrivalAirport, LocalTime departTime){
        this.flightNumber = flightNumber;
        this.departAirport = departAirport;
        this.arrivalAirport = arrivalAirport;
        this.departTime = departTime;
    }

    public AirplaneFlight(int flightNumber, Airport departAirport, Airport arrivalAirport, LocalTime arrivalTime){
        this.flightNumber = flightNumber;
        this.departAirport = departAirport;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
    }

}
