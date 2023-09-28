package creationalPattern.builderPattern;

public class User {

    private String name;
    private String userName;
    private String email;
    private int age;


    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.userName = builder.userName;
        this.email = builder.email;
        this.age = builder.age;
    }

    public static class UserBuilder {
        private String name;
        private String userName;
        private String email;
        private int age;

        public UserBuilder() {

        }

        public UserBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder buildUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder buildEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder buildAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
