package com.manuv.just4fun.lambda;

public class PlayingWithLambdas {

  public static void main(String[] args) {
    apply(() -> 3 * 2);
    apply(() -> 3 + 2);
    apply(() -> 3 - 2);
    apply(() -> 3 / 2);
    apply(() -> 3 % 2);

    System.out.println(String.format("thread: %s", Thread.currentThread().getId()));

    new Thread(
    // using Runnable as a functional interface
        () -> System.out.println(String.format("thread: %s", Thread.currentThread().getId()))).start();

    Runnable r = () -> System.out.println(String.format("thread: %s", Thread.currentThread().getId()));

    new Thread(r).start();

  }

  private static void apply(Operation operation) {
    System.out.println(String.format("result of the operation> %s", operation.calculate()));
  }

}
