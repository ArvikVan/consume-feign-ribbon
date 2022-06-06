package arv.consumefeignribbon.controller;

import arv.consumefeignribbon.models.Message;
import arv.consumefeignribbon.models.User;
import arv.consumefeignribbon.models.UserDTO;
import arv.consumefeignribbon.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.06.2022
 */
@RestController
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<User[]> getAll() {
        return new ResponseEntity<>(usersService.getALLInfoUsers(), HttpStatus.OK);
    }

    @GetMapping("/getDTO")
    public ResponseEntity<UserDTO[]> getALLUsersDTO() {
        return new ResponseEntity<>(usersService.getUserDTO(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserDTOById(@PathVariable Integer id) {
        return new ResponseEntity<>(usersService.getUserById(id), HttpStatus.OK);
    }

    @GetMapping("/getMessageInfo")
    public ResponseEntity<Message> getMessageInfo(@RequestParam String senderMsid,
                                                  @RequestParam String creationDate) {
        return new ResponseEntity<>(usersService.getMessageInfo(senderMsid, creationDate), HttpStatus.OK);
    }
}
