package fr.ycaby.dp.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonTest {
    public static List values = new ArrayList();
    @Test
    public void testSingleton() throws InterruptedException {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(threadFoo);
        es.execute(threadBar);
        es.awaitTermination(800, TimeUnit.MILLISECONDS);
        Assert.assertEquals(values.get(0),values.get(1));
    }
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.getValue());
            values.add(singleton.getValue());
        }
    }
    static class ThreadBar implements Runnable  {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.getValue());
            values.add(singleton.getValue());
        }
    }
}
