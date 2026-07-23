package exercise_1_singleton_pattern;

public class Cache {
    private static Cache cache;
    private Cache() {

    }
    public static Cache getCache() {
        if(cache == null){
            cache = new Cache();
        }
        return cache;
    }
}
