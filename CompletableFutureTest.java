pacakge sample;

public class Example1 {
    public static void main(String[] args) throws Exception{
        CompletableFuture<String> future = 
        CompletableFuture.supplyAsync(()->"Value");

        // Get results
        String msg = future.get();
        System.out.println(msg);
    }
}