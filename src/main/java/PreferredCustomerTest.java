public class PreferredCustomerTest {
    public static void main(String[] args) {
        System.out.println("--- Testing PreferredCustomer Class ---");

        PreferredCustomer pc = new PreferredCustomer();

        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        System.out.println("Initial state:");
        System.out.println(pc);
        System.out.println("Current Discount: " + pc.getDiscountLevel());
        System.out.println("--------------------------------------------------");

        System.out.println("Adding 700 points...");
        pc.addLoyaltyPoints(700);
        System.out.println(pc);
        System.out.println("--------------------------------------------------");

        System.out.println("Adding 800 more points (Total 1500)...");
        pc.addLoyaltyPoints(800);
        System.out.println(pc);
    }
}