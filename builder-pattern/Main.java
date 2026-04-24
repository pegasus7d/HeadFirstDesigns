public class Main {
    public static void main(String[] args) {

        User user1 = new User.Builder("Debayan", 25)
                .setCity("Kolkata")
                .setCountry("India")
                .setActive(true)
                .build();

        User user2 = new User.Builder("Alex", 30)
                .setVerified(true)
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
