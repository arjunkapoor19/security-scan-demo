import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class WeakCrypto {
    public static void main(String[] args) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        SecretKeySpec key = new SecretKeySpec("12345678".getBytes(), "DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }
}
