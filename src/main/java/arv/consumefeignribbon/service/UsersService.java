package arv.consumefeignribbon.service;

import arv.consumefeignribbon.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.06.2022
 */
@Service
public class UsersService {

    private final WebClient webClient;

    public UsersService(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://jsonplaceholder.typicode.com/").build();
    }

    public User[] getUsers() {
        return webClient
                .get()
                .uri("/users")
                .retrieve()
                .bodyToMono(User[].class).block();
    }
}
