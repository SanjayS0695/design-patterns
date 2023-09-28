package creationalPattern.singletonPattern;

public class SingletonPattern {

    public static void main(String[] args) {
        DBSingleton instanceOne = DBSingleton.getInstance();
        DBSingleton instanceTwo = DBSingleton.getInstance();

        System.out.println(instanceOne);
        System.out.println(instanceTwo);

//        creationalPattern.DBSingleton@7e9e5f8a
//        creationalPattern.DBSingleton@7e9e5f8a
    }
}
