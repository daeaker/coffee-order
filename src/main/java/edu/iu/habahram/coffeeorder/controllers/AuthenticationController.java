package edu.iu.habahram.coffeeorder.controllers;


import edu.iu.habahram.coffeeorder.model.Customer;
import edu.iu.habahram.coffeeorder.repository.CustomerFileRepository;
import edu.iu.habahram.coffeeorder.repository.CustomerRepository;
import edu.iu.habahram.coffeeorder.security.TokenService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    CustomerRepository customerFileRepository;
    public AuthenticationController(CustomerRepository customerFileRepository, AuthenticationManager authenticationManager, TokenService tokenService) {
        this.customerFileRepository = customerFileRepository;
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }
    @PostMapping("/signup")
    public void signup(@RequestBody Customer customer) {
        try {
            BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
            String passwordEncoded = bc.encode(customer.getPassword());
            customer.setPassword(passwordEncoded);
            customerFileRepository.save(customer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @PostMapping("/signin")
    public String login(@RequestBody Customer customer) {
        Authentication authentication = authenticationManager
                .authenticate(
                        new UsernamePasswordAuthenticationToken(
                                customer.getUsername(), customer.getPassword()));
        return tokenService.generateToken(authentication);
    }

}
