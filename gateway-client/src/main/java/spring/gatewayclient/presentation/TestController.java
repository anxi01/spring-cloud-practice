package spring.gatewayclient.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.gatewayclient.presentation.response.TestResponse;

import java.util.UUID;

@RestController
public class TestController {

    @GetMapping("/v1/test")
    public ResponseEntity<?> test() {
        TestResponse testResponse = TestResponse.builder()
                .id(UUID.randomUUID())
                .title("Test")
                .body("It is test")
                .writerNickname("test")
                .build();

        return ResponseEntity.ok(testResponse);
    }
}
