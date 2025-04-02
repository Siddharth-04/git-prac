class Flight<T>{
    private T flightNumber;
    public String departure;
    private String destination;

    public Flight(T flightNumber,String departure,String destination){
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }

    public T getFlightNumber(){
        return flightNumber;
    }

    public void getFlightInformation(){
        System.out.println( "Flight Number :  " + flightNumber);
        System.out.println("Departure Time : "+ departure);
        System.out.println("Destination : " + destination);
    }
}
public class Generics {
    public static void main(String[] args) {
        Flight<Integer> flight = new Flight(101,"10:00AM","Delhi");
        flight.getFlightInformation();
    }
}
