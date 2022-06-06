package arv.consumefeignribbon.service;

import arv.consumefeignribbon.models.Message;
import arv.consumefeignribbon.models.MessageType;
import arv.consumefeignribbon.models.User;
import arv.consumefeignribbon.models.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.LocalDateTime;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.06.2022
 */
@Service
public class UsersService {

    private final WebClient webClient;
    private static String TOKEN = "83d70801-3d6c-4399-abab-f357204f4b84";

    public UsersService(WebClient.Builder webClient, @Value("${mts.json.url}") String baseUrl) {
        this.webClient = webClient.baseUrl(baseUrl).build();
    }

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

    public Message getMessageInfo(String token, String dateFrom, String dateTo, String msids, MessageType type) {
        token = TOKEN;
        return webClient
                .get()
                .uri("?dateFrom=" + dateFrom + "&dateTo=" + dateTo + "&msids=" + msids + "&type=All")
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .bodyToMono(Message.class).block();
    }

    public Message getMessageByMessageId(String token, Integer messageID) {
        token = TOKEN;
        return webClient
                .get()
                .uri("/"+ messageID)
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .bodyToMono(Message.class).block();
    }
}
