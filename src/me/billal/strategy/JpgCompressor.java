package me.billal.strategy;

public class JpgCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
     System.out.println("Compressing Jpg ...");
    }
}
