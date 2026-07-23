package exercise_1_singleton_pattern;

public class Main {
    public static void main(String[] args){

    Cache cache = Cache.getCache();
    System.out.println(cache.hashCode());

    Cache cache2 = Cache.getCache();
    System.out.println(cache2.hashCode());
    }
}
