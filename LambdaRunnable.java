// lambda example for Runnable interface
import java.lang.Thread;
import java.lang.Runnable;

class LambdaRunnable{

    public static void main(String[] args) {
        /**
         * Java 8 prior
         */

        Runnable runnable1 = new Runnable() {
        	@Override
			public void run() {
        	  System.out.println("Runnable 1");	
        	}
        };

        new Thread(runnable1).start(); 
        
        new Thread(new Runnable() {
        	@Override
        	public void run() {
        		System.out.println("Runnable 2");
        	}
        }).start(); 
        
        
        /**
         * Using Lambda
         */
        Runnable runnableLambda1 = () -> {
        	System.out.println("Runnable Lambda 1");
        };
        
        new Thread(runnableLambda1).start();
        
        Runnable runnableLambda2 = () -> System.out.println("Runnable Lambda 2");
        
        new Thread(runnableLambda2).start();
        
        new Thread(() -> System.out.println("Runnable Lambda 3"));
        
    }
}