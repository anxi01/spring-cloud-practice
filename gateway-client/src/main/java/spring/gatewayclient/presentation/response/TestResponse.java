package spring.gatewayclient.presentation.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record TestResponse(
        UUID id,
        String body,
        String title,
        String writerNickname
) {
}
