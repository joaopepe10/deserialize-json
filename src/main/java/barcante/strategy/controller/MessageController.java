package barcante.strategy.controller;

import barcante.strategy.domain.model.impl.EventsNotification;
import barcante.strategy.service.ProcessEvent;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
@AllArgsConstructor
public class MessageController {

    private final ProcessEvent processEvent;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public EventsNotification sendMessage(@RequestBody EventsNotification message) {
        processEvent.processEvent(message);
        return message;
    }

    @GetMapping
    public String get(){
        return "Hello World";
    }
}
