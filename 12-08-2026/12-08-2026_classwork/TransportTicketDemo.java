abstract class TicketTransport {
    String source;
    String destination;
    double baseFare;

    TicketTransport(String source, String destination, double baseFare) {
        this.source = source;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    abstract double calculateFare();

    void displayTicket() {
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Final Fare: " + calculateFare());
        System.out.println();
    }
}

class TicketBus extends TicketTransport {
    TicketBus(String source, String destination, double fare) {
        super(source, destination, fare);
    }

    @Override
    double calculateFare() {
        return baseFare;
    }
}

class TicketTrain extends TicketTransport {
    TicketTrain(String source, String destination, double fare) {
        super(source, destination, fare);
    }

    @Override
    double calculateFare() {
        return baseFare + 100;
    }
}

class TicketFlight extends TicketTransport {
    TicketFlight(String source, String destination, double fare) {
        super(source, destination, fare);
    }

    @Override
    double calculateFare() {
        return baseFare + 1000;
    }
}

public class TransportTicketDemo {
    public static void main(String[] args) {
        TicketTransport t;

        t = new TicketBus("Chennai", "Coimbatore", 500);
        t.displayTicket();

        t = new TicketTrain("Chennai", "Bangalore", 800);
        t.displayTicket();

        t = new TicketFlight("Chennai", "Delhi", 5000);
        t.displayTicket();
    }
}