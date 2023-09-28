package creationalPattern.prototypePattern;

public class PrototypePattern {

    public static void main(String[] args) {

        var registry = new Registry();

        //with ShallowClone

        Movie movieInstanceOne = (Movie) registry.createItemWithClone("MOVIES");
        movieInstanceOne.setTitle("Oppenheimer");
        movieInstanceOne.setRent(600.0);
        movieInstanceOne.setUrl("");
        movieInstanceOne.setRunTime(3.0);
        movieInstanceOne.getDirector().setName("James Cameroon");

        System.out.println(movieInstanceOne);
        System.out.println(movieInstanceOne.getTitle());
        System.out.println(movieInstanceOne.getDirector());
        System.out.println(movieInstanceOne.getDirector().getName());
        //creationalPattern.prototypePattern.Movie@764c12b6
        //Oppenheimer
        //creationalPattern.prototypePattern.Director@18b4aac2
        //James Cameroon

        Movie movieInstanceTwo = (Movie) registry.createItemWithClone("MOVIES");
        movieInstanceTwo.setTitle("Jurassic Park");
        movieInstanceTwo.setRent(600.0);
        movieInstanceTwo.setUrl("");
        movieInstanceTwo.setRunTime(2.0);
        movieInstanceTwo.getDirector().setName("Steven Spielberg");

        System.out.println(movieInstanceTwo);
        System.out.println(movieInstanceTwo.getTitle());
        System.out.println(movieInstanceTwo.getDirector());
        System.out.println(movieInstanceTwo.getDirector().getName());
        //creationalPattern.prototypePattern.Movie@4e0e2f2a
        //Jurassic Park
        //creationalPattern.prototypePattern.Director@18b4aac2
        //Steven Spielberg

        //both address are same for Director Objects

        //with DeepClone

        Movie movieInstanceOneDeep = (Movie) registry.createItemWithDeepClone("MOVIES");
        movieInstanceOneDeep.setTitle("Oppenheimer");
        movieInstanceOneDeep.setRent(600.0);
        movieInstanceOneDeep.setUrl("");
        movieInstanceOneDeep.setRunTime(3.0);
        movieInstanceOneDeep.getDirector().setName("James Cameroon");

        System.out.println(movieInstanceOneDeep);
        System.out.println(movieInstanceOneDeep.getTitle());
        System.out.println(movieInstanceOneDeep.getDirector());
        System.out.println(movieInstanceOneDeep.getDirector().getName());
        //creationalPattern.prototypePattern.Movie@73d16e93
        //Oppenheimer
        //creationalPattern.prototypePattern.Director@659e0bfd
        //James Cameroon

        Movie movieInstanceTwoDeep = (Movie) registry.createItemWithDeepClone("MOVIES");
        movieInstanceTwoDeep.setTitle("Jurassic Park");
        movieInstanceTwoDeep.setRent(600.0);
        movieInstanceTwoDeep.setUrl("");
        movieInstanceTwoDeep.setRunTime(2.0);
        movieInstanceTwoDeep.getDirector().setName("Steven Spielberg");

        System.out.println(movieInstanceTwoDeep);
        System.out.println(movieInstanceTwoDeep.getTitle());
        System.out.println(movieInstanceTwoDeep.getDirector());
        System.out.println(movieInstanceTwoDeep.getDirector().getName());
        //creationalPattern.prototypePattern.Movie@2a139a55
        //Jurassic Park
        //creationalPattern.prototypePattern.Director@15db9742
        //Steven Spielberg

        //both Directors have different address after deep clone
    }
}
