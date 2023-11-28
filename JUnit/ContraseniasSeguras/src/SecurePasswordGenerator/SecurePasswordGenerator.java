package SecurePasswordGenerator;

import java.security.SecureRandom;

/**
 *
 * @author renem
 */
public class SecurePasswordGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    private static final SecureRandom RANDOM = new SecureRandom();

    private String password;

    public SecurePasswordGenerator() {
    }

    public SecurePasswordGenerator(String password) {
        this.password = password;
    }

    public static String generarContraseniaSegura() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }
        return password.toString();
        
    }
    
    
}
