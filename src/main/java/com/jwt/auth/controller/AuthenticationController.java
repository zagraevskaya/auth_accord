package com.jwt.auth.controller;

import com.jwt.auth.config.JwtTokenUtil;
import com.jwt.auth.model.ApiResponse;
import com.jwt.auth.model.AuthToken;
import com.jwt.auth.model.LoginUser;
import com.jwt.auth.model.User;
import com.jwt.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/token")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
    public ApiResponse<AuthToken> generateToken(@RequestBody LoginUser loginUser) throws AuthenticationException {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
        final User user = userService.findOne(loginUser.getUsername());
        final String token = jwtTokenUtil.generateToken(user);
        return new ApiResponse<>(200, "success",new AuthToken(token, user.getName()));
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/generate-token", method = RequestMethod.GET)
    public ApiResponse<AuthToken> generateTokenGet() throws AuthenticationException {
       // BCryptPasswordEncoder passwordEncoder;
        LoginUser loginUser=new LoginUser();
        loginUser.setUsername("nata");
        loginUser.setPassword("123456");

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
        final User user = userService.findOne(loginUser.getUsername());

        final String token = jwtTokenUtil.generateToken(user);
        return new ApiResponse<>(200, "success",new AuthToken(token, user.getName()));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ApiResponse<Void> logout() throws AuthenticationException {
        return new ApiResponse<>(200, "success",null);
    }

}
