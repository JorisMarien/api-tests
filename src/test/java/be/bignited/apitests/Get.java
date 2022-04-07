package be.bignited.apitests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootTest
public class Get {
        @Test
        void get() {
                URL url = new URL("http://localhost:3000/posts/1");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
        }
}


