package arv.consumefeignribbon.service;

import arv.consumefeignribbon.models.Message;
import arv.consumefeignribbon.models.User;
import arv.consumefeignribbon.models.UserDTO;
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

    public UsersService(WebClient webClient) {
        this.webClient = WebClient.create("https://jsonplaceholder.typicode.com/");
    }

  /*  public UsersService(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://jsonplaceholder.typicode.com/").build();
    }*/

    public User[] getALLInfoUsers() {
        return webClient
                .get()
                .uri("/users")
                .retrieve()
                .bodyToMono(User[].class).block();
    }

    public UserDTO[] getUserDTO() {
        return webClient
                .get()
                .uri("/users")
                .retrieve()
                .bodyToMono(UserDTO[].class).block();
    }

    public UserDTO getUserById(Integer id) {
        return webClient
                .get()
                .uri("/users/" + id)
                .retrieve()
                .bodyToMono(UserDTO.class).block();
    }

    public Message getMessageInfo(String senderMsid, String creationDate) {
        return webClient
                .get()
                .uri("/users/?dateFrom="+creationDate+"&msids="+senderMsid)
                .retrieve()
                .bodyToMono(Message.class).block();
    }
}
