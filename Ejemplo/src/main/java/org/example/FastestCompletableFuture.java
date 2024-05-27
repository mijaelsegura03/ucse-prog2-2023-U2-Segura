package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FastestCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> futureTask1 = CompletableFuture.supplyAsync(() -> AllCompletableFuture.randNumber());
        CompletableFuture<Integer> futureTask2 = CompletableFuture.supplyAsync(() -> AllCompletableFuture.randNumber());
        CompletableFuture<Integer> futureTask3 = CompletableFuture.supplyAsync(() -> AllCompletableFuture.randNumber());
        CompletableFuture<Integer> futureTask4 = CompletableFuture.supplyAsync(() -> AllCompletableFuture.randNumber());

        CompletableFuture<Object> fastestTask = CompletableFuture.anyOf(futureTask1,futureTask2,futureTask3,futureTask4);

        System.out.printf("Primer número aleatorio: %s%n", fastestTask.get());
    }
}
