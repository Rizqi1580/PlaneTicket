public class Business extends Ticket{
    public Business(String passengerName, double baseFare){
        super(passengerName, baseFare);
    }
    
    @Override
    public double calculateFare(){
        return baseFare * 1.25;
    }
}
