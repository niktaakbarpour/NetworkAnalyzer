package com.network.analyzer.controller;

import com.network.analyzer.network.entity.PacketModel;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private final SimpMessagingTemplate template;

    public WebSocketController(SimpMessagingTemplate template) {
        this.template = template;
    }


    public void sendPacket(PacketModel packetModel) {
        template.convertAndSend("/network/packet", packetModel);
    }
}
