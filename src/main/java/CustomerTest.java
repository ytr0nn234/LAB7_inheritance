public class CustomerTest {
    public static void main(String[] args) {
        System.out.println("--- Testing Customer Class ---");
        Customer part1Customer = new Customer(
                "Alice Smith",
                "1 High Street",
                "0851234567",
                1001,
                true
        );

        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

        System.out.println("Customer 1 (Constructor): " + part1Customer);
        System.out.println("Customer 2 (Setters): " + part2Customer);
    }
}