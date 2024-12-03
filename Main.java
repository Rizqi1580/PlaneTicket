public class Main{
    public static void main(String[] args){
        Ticket economy = new Economy("Muhammad", 10);
        Ticket business = new Business("Rizqi", 20);
        Ticket first = new First("Rasyid", 30);
        
        System.out.println("Economy Ticket:");
        economy.displayTicketInfo();
        
        System.out.println("\nBusiness Ticket:");
        business.displayTicketInfo();
        
        System.out.println("\nFirst Ticket:");
        first.displayTicketInfo();
    }
}