package passwordgenerator;

import java.security.SecureRandom;

public class PasswordGenerator {
    String charactersToBeUsed;

    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int DEFAULT_PASSWORD_LENGTH = 8;

    // default constructor
    public PasswordGenerator() { 
        this(UPPERCASE_CHARACTERS);
    }

    // constructor
    public PasswordGenerator(String characters) {
        this.charactersToBeUsed = characters;
    }

    public String generate() {
        return generate(DEFAULT_PASSWORD_LENGTH);
    }

    public String generate(int length) {
        char[] password = new char[length];

        char[] possibleCharacters = charactersToBeUsed.toCharArray();
        SecureRandom r = new SecureRandom();

        for (int i = 0; i < length; i++) {
            password[i] = possibleCharacters[r.nextInt(possibleCharacters.length)];
        }
        return new String(password);
    }
}