package com.example.userservice.controller;

import com.example.userservice.dto.UserDto;
import com.example.userservice.service.UserService;
import com.example.userservice.vo.Greeting;
import com.example.userservice.vo.RequestUser;
import com.example.userservice.vo.ResponseUser;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-service")
public class UserController {

    private Greeting greeting;
    private UserService userService;

    private Environment env;

    @Autowired
    public UserController(Greeting greeting, UserService userService, Environment env) {
        this.greeting = greeting;
        this.userService = userService;
        this.env = env;
    }

    @GetMapping("/health_check")
    public String check() {
        return String.format("It's Working in User Service on PORT %s",
                env.getProperty("local.server.port"));
    }

    @GetMapping("/welcome")
    public String welcome() {
        return greeting.getMessage();
    }

    @PostMapping("/users")
    public ResponseEntity<ResponseUser> createUser(@RequestBody RequestUser user) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = mapper.map(user, UserDto.class);
        userService.createUser(userDto);

        ResponseUser responseUser = mapper.map(userDto, ResponseUser.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseUser);
    }
}
