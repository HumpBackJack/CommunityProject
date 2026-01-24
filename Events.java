public class Events{
    private String location;
    private double price;
    private String type;
    public Events(String loc, double p, String t){
        location = loc;
        price = p;
        type = t;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String l){
        location = l;  
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double pr){
       price = pr; 
    }
    public String getType(){
        return type;
    }
    public void setType(String ty){
       type = ty;
    }
    public String buyTickets(int num){
        return num + " Tickets Will Cost " + (double)num * price;
    }
    public static void main(String[]args){
        Events concert = new Events("NYC", 50.0, "Concert");
        System.out.println(concert.buyTickets(3));
        concert.setType("Country Concert");
        System.out.println("Type: " + concert.getType());
    }
}