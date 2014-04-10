package com.manuv.just4fun.lambda;

public class PlayingWithLambdas {

  public static void main(String[] args) {
    apply(r -> 3 * 2);
    apply(r -> 3 + 2);
    apply(r -> 3 - 2);
    apply(r -> 3 / 2);
    apply(r -> 3 % 2);
  }

  private static void apply(Operation operation) {
    System.out.println(String.format("result of the operation> %s", operation.calculate()));
  }

}
