package com.kurtulussahin.codekata.http.elegantobjectshttpserver;

import com.jcabi.http.request.JdkRequest;
import com.jcabi.http.response.RestResponse;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class AppTest {

    @Test
    public void testWorks() throws Exception {
        int port = 12345;
        final Thread thread = new Thread(() -> {
            App app = new App();
            try {
                app.start(port);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new IllegalStateException(e);
            }
        });
        thread.setDaemon(true);
        thread.start();
        for (int attempt = 0; attempt < 10; attempt++) {
            String response = new JdkRequest("http://localhost:12345")
                    .fetch().as(RestResponse.class).body();
            MatcherAssert.assertThat(response, Matchers.containsString("Hello, world!"));
        }
        thread.interrupt();
        thread.join();
    }
}
