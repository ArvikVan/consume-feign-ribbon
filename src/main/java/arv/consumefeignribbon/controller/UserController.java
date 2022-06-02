package arv.consumefeignribbon.controller;

import arv.consumefeignribbon.models.User;
import arv.consumefeignribbon.models.UserDTO;
import arv.consumefeignribbon.service.UsersService;
import org.apache.catalina.LifecycleState;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<User[]> getAll(UsersService usersService) {
        return new ResponseEntity<>(usersService.getALLInfoUsers(), HttpStatus.OK);
    }

    @GetMapping("/getDTO")
    public ResponseEntity<UserDTO[]> getALLUsersDTO(UsersService usersService) {
        return new ResponseEntity<>(usersService.getUserDTO(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserDTOById(UsersService usersService, @PathVariable Integer id) {
        return new ResponseEntity<>(usersService.getUserById(id), HttpStatus.OK);
    }
}
