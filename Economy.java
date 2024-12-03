public class Economy extends Ticket{
    public Economy(String passengerName, double baseFare){
        super(passengerName, baseFare);
    }
    
    @Override
    public double calculateFare(){
        return baseFare;
    }
}
