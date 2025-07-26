package org.telran.social.dto;

public record PostCreateRequestDTO (String content,
                                   String postStatus,
                                   Long userId) {
}
