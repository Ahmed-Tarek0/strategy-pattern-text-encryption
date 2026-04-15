interface Strategy {
    String TextManipulation(String input);
}

class EncryptStrategy implements Strategy {
    @Override
    public String TextManipulation(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return encrypted.toString();
    }
}

class DecryptStrategy implements Strategy {
    @Override
    public String TextManipulation(String input) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            decrypted.append((char) (c - 3));
        }
        return decrypted.toString();
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String input) {
        return strategy.TextManipulation(input);
    }
}

public class Main {
    public static void main(String[] args) {
        String text = "ComputersAndArtificialIntellegence";

        Context context = new Context(new EncryptStrategy());
        String encrypted = context.executeStrategy(text);
        System.out.println("Encrypted: " + encrypted);

        context = new Context(new DecryptStrategy());
        String decrypted = context.executeStrategy(encrypted);
        System.out.println("Decrypted: " + decrypted);

        System.out.println("IDS:");
        System.out.println("Ahmed Tarek: 20230024");
        System.out.println("Ahmed Mostafa: 20230036");
        System.out.println("Mosatafa Abduljaeel: 20230403");
    }
}
