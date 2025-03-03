package org.example.kunuz.controller;

import org.example.kunuz.dto.ProfileDto;
import org.example.kunuz.model.Profile;
import org.example.kunuz.model.Result;
import org.example.kunuz.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping
    public List<Profile> getAll(){
        List<Profile> list = profileService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Profile getById(@PathVariable Integer id){
        return profileService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody ProfileDto profileDto){
        Result result = profileService.create(profileDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody ProfileDto profileDto){
        Result result = profileService.update(id, profileDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = profileService.delete(id);
        return result;
    }
}
