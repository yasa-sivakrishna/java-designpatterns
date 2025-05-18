public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    private User(Builder builder){
         this.firstName=builder.firstName;
         this.lastName=builder.lastName;
         this.age= builder.age;
         this.phone=builder.phone;
         this.address=builder.address;
    }

    public static class Builder {
        private final String firstName;
        private final String lastName;
        private int age = 0;
        private String phone = null;
        private String address = null;
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) { this.age = age; return this; }
        public Builder phone(String phone) { this.phone = phone; return this; }
        public Builder address(String address) { this.address = address; return this; }

        public User build(){
            if(null==this.firstName&&null==lastName){
                throw  new IllegalArgumentException("Firstname and lastname is required!.");
            }
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
