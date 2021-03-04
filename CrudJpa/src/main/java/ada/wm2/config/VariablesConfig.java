package ada.wm2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VariablesConfig {

    @Bean
    public String welcomeText() {
        return new String("WELCOME");
    }
}
