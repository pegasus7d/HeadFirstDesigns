public class User {

    // Required fields
    private final String name;
    private final int age;

    // Optional fields
    private final String city;
    private final String country;
    private final boolean isActive;
    private final boolean isVerified;

    // Private constructor
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
        this.country = builder.country;
        this.isActive = builder.isActive;
        this.isVerified = builder.isVerified;
    }

    // Static Builder Class
    public static class Builder {

        // Required fields
        private final String name;
        private final int age;

        // Optional fields (default values)
        private String city = "";
        private String country = "";
        private boolean isActive = false;
        private boolean isVerified = false;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age +
                ", city='" + city + "', country='" + country +
                "', active=" + isActive +
                ", verified=" + isVerified + "}";
    }
}
