package me.billal.strategy;

public class BalckAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying using b&w filter");
    }
}
