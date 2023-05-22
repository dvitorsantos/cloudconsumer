package lsdi.cloudconsumer.Controller;

import lsdi.cloudconsumer.DataTransferObjects.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class EventController {
    RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/event")
    public void event(@RequestBody Event request) {
        restTemplate.postForObject(request.getWebhookUrl(), request.getEvent(), Map.class);
    }
}
