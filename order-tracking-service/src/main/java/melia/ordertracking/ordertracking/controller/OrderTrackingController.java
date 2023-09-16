package melia.ordertracking.ordertracking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/api/v1/")
public class OrderTrackingController {

    @Value("${welcome.msg}")
    private String welcomeMessage;

    @GetMapping("/")
    public String getWelcomeMsg() {
        return welcomeMessage;
    }
}
