import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The Helpers class provides utility methods for various operations.
 */
public final class Helpers {
    /**
     * Calculates the SHA-256 hash value of the given input string.
     *
     * @param input the input string to calculate the hash value for
     * @return the SHA-256 hash value of the input string
     */
    public static String getSHA(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return String.valueOf(md.digest(input.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
