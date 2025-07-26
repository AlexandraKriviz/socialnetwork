package org.telran.social.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.social.dto.NetworkUserResponsDTO;
import org.telran.social.model.NetworkUser;
import org.telran.social.service.NetworkUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class NetworkUserController {

    @Autowired
    private NetworkUserService userService;

    @GetMapping
    public List<NetworkUserResponsDTO> getAll() {

        return userService.getAll().stream().map(user -> NetworkUserResponsDTO.builder()
                .name(user.getName())
                .id(user.getId())
                .surname(user.getSurname())
                .build())
                .collect(Collectors.toList());
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

