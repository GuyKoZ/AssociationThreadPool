import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("***********start****************");

        for (int i =1 ; i <= 200 ; i++ )
        {
            Runnable Secretary = new Secretary(i);
            executor.execute(Secretary);
        }
        executor.shutdown();
        while(!executor.isTerminated());
        System.out.println("***********finish****************");
        System.out.println("The students list : ");
        Secretary.print();
    }
}
