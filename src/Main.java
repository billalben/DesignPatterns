import me.billal.strategy.*;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpgCompressor(), new BalckAndWhiteFilter());

        System.out.println("--------------------------");

        imageStorage.store("a", new PngCompressor(), new HIghContrast());
    }
}