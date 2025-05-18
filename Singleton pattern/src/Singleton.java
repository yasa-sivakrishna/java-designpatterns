public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){
        // To prevent instantiation via reflection
        if(null!=instance){
            throw new RuntimeException("Please use getInstance method..");
        }
    }

    public static Singleton getInstance(){
        if(null==instance){
            return new Singleton();
        }
        return instance;
    }

}
