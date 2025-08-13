package org.telran.social.model;

import lombok.*;
import org.telran.social.enams.MessageStatus;

@Getter
@Setter
@Builder
@ToString
@Data
@AllArgsConstructor
public class Message {

        private Long id;

        private String text;

        private Long senderId;

        private Long receiverId;

        private MessageStatus status;

    public Message() {
        //
    }
}
