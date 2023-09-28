package creationalPattern.builderPattern;

public class BuilderPattern {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .buildName("Sanjay")
                .buildUserName("SanjayS0695")
                .buildEmail("sanjay.suresh@ust.com")
                .buildAge(28)
                .build();
        System.out.println(user.getName() + " " + user.getUserName() + " " + user.getEmail() + " " + user.getAge());
        //Sanjay SanjayS0695 sanjay.suresh@ust.com 28
    }
}
