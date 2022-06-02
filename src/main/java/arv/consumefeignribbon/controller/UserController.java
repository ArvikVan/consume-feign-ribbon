package arv.consumefeignribbon.controller;

import arv.consumefeignribbon.models.User;
import arv.consumefeignribbon.service.UsersService;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.06.2022
 */
@RestController
public class UserController {

    @GetMapping("/getAll")
    public List<User> getAll(UsersService usersService) {
        return List.of(usersService.getUsers());
    }
}
