package arv.consumefeignribbon.controller;

import arv.consumefeignribbon.models.*;
import arv.consumefeignribbon.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.06.2022
 */
@RestController
@RequestMapping("/api/v1")
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

    @GetMapping("/")
    public ResponseEntity<Datum> getMessageInfo(@RequestHeader("Authorization") String token,
                                                @RequestParam String dateFrom,
                                                @RequestParam String dateTo,
                                                @RequestParam String msids,
                                                @RequestParam MessageType type
    ) {
        return usersService.getMessageInfo(token, dateFrom, dateTo, msids, type)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());
                       
    }
    //Failed to convert value of type 'java.lang.String' to required type 'java.lang.Integer';
    //откуда тут стринга зарисовалась хуйзнат
    @GetMapping("/getById/{messageID}")
    public ResponseEntity<Message> getMessageByMessageID(@RequestHeader("Authorization") String token,
                                                         @PathVariable String messageID) {

        //return new ResponseEntity<>(usersService.getMessageByMessageId(token, messageID), HttpStatus.OK);
        return usersService.getMessageByMessageId(token, messageID)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());

    }
}
