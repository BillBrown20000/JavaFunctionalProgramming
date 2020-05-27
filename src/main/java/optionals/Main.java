package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("Hello")
                .ifPresent(value -> {
                    System.out.println(value);
                });

    }
}
