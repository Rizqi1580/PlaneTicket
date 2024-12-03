public class First extends Ticket{
    public First(String passengerName, double baseFare){
        super(passengerName, baseFare);
    }
    
    @Override
    public double calculateFare(){
        return baseFare * 1.50;
    }
}
