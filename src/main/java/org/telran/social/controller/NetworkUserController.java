package org.telran.social.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.social.model.NetworkUser;
import org.telran.social.service.NetworkUserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class NetworkUserController {

    @Autowired
    private NetworkUserService userService;

    @GetMapping
    public List<NetworkUser> getAll() {
        return userService.getAll();
    }

    @GetMapping("{id}")
    public NetworkUser getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping
    public NetworkUser create(@RequestBody NetworkUser networkUser) {
        return userService.create(networkUser);
    }

    @GetMapping("/filter")
    public List<NetworkUser> filter(@RequestParam Long minAge, @RequestParam Long maxAge) {
        return userService.filterById(minAge, maxAge);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable(name = "id") Long id) {
        userService.deleteById(id);

    }
}
