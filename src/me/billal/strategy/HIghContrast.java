package me.billal.strategy;

public class HIghContrast implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying using high-contract filter");
    }
}
