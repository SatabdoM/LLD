public class TransportService {
    public static void main(String args[]){
        // Transport car= new Car();
        // Transport bike =new Bike();
        Transport bus= new TransportFactory.createTransport("bus");
        bus.deliver();
        //if we want to add a new bs then we have to explicity write another clas
    }    
}
