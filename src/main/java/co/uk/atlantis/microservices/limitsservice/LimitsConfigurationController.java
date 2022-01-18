package co.uk.atlantis.microservices.limitsservice;

import co.uk.atlantis.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private Configuration configuration;

    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitFromConfiguration() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
