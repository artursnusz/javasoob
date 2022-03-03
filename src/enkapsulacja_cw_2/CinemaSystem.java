package enkapsulacja_cw_2;

class CinemaSystem {
    public static void main(String[] args) {
        MovieShow movie1 = new MovieShow("Omen", "horror", 128, 16, 72);
        Client client1 = new Client("Jan", "Kowalski", 150);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);

        Client client2 = new Client("Anna", "Zalewska", 198);
        Ticket ticket2 = ticketSystem.createTicket(movie1, client2);


        System.out.println(ticket2 + "Test");

        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());

        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + ( movie1.getFreeSeats() - movie1.getMaxSeats()));
    }
}