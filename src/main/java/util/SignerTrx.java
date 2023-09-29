package util;

import java.time.Instant;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

public class SignerTrx {
    private static String secretKEY="/NqFL5Fk4qM=3QpYu5muyXekutmOVvRbvYqPCTDgw5a2l5nkqhi/PZlFuHgqZFWAB8sblbw96qn+YCW1YAIyYDKbYbvzvD9mRw==";
    private static long unixTimestamp = Instant.now().getEpochSecond();

    public static String getTimestampString() {
        return Long.toString(unixTimestamp);
    }

    public static String getSignature(String method, String url, String body) {
        String data = method + url + body;
        return new String(new Base64().encode(hmacSha256(data).getBytes()));
    }

    public static String hmacSha256(String data) {
    return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, secretKEY).hmacHex(data);
}

private SignerTrx(){}

}
