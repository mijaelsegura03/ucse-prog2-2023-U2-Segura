package org.example;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AllCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> futureTask1 = CompletableFuture.supplyAsync(() -> randNumber());
        CompletableFuture<Integer> futureTask2 = CompletableFuture.supplyAsync(() -> randNumber());
        CompletableFuture<Integer> futureTask3 = CompletableFuture.supplyAsync(() -> randNumber());
        CompletableFuture<Integer> futureTask4 = CompletableFuture.supplyAsync(() -> randNumber());

        CompletableFuture<Void> allFutureTasks = CompletableFuture.allOf(futureTask1,futureTask2,futureTask3,futureTask4);

        CompletableFuture<Integer> futureSum = allFutureTasks.thenApply(v -> {
            try {
                return futureTask1.get() + futureTask2.get() + futureTask3.get() + futureTask4.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.printf("Suma de los números aleatorios: %s%n",futureSum.get());

    }
    public static int randNumber() {
        Random random = new Random();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return random.nextInt(100, 500);
    }
}