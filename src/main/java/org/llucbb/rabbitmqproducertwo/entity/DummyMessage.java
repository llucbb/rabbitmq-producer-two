package org.llucbb.rabbitmqproducertwo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DummyMessage {

    private String content;

    private int publishOrder;
}
