package springsec.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain SecurityFilterChain(HttpSecurity http){
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
        return http.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/accounts/*", "/balances/*", "/loans/total", "/cards/*").authenticated()
                        .requestMatchers("/notices/data", "/contact-info/info", "/error").permitAll())
//        http.formLogin(withDefaults());
                // Disable form login
                .formLogin(AbstractHttpConfigurer::disable)
                .httpBasic(withDefaults())
                .build();
    }
}
