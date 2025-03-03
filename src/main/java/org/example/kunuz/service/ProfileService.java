package org.example.kunuz.service;

import org.example.kunuz.dto.ProfileDto;
import org.example.kunuz.model.Profile;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    //getAll
    public List<Profile> getAll(){
        return profileRepository.findAll();
    }

    //getById
    public Profile getById(Integer id){
        return profileRepository.findById(id).get();
    }

    //create
    public Result create(ProfileDto profileDto){
        Profile profile = new Profile();
        profile.setName(profileDto.getName());
        profile.setSurname(profileDto.getSurname());
        profile.setEmail(profileDto.getEmail());
        profile.setPhone(profileDto.getPhone());
        profile.setPassword(profileDto.getPassword());
        profile.setStatus(profileDto.getStatus());
        profile.setRole(profileDto.getRole());
        profile.setVisible(profileDto.getVisible());
        profile.setCreated_date(profileDto.getCreated_date());
        profile.setPhoto_id(profileDto.getPhoto_id());
        profileRepository.save(profile);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, ProfileDto profileDto){
        Optional<Profile> profileOptional = profileRepository.findById(id);
        if (profileOptional.isPresent()){
            Profile profile = profileOptional.get();
            profile.setName(profileDto.getName());
            profile.setSurname(profileDto.getSurname());
            profile.setEmail(profileDto.getEmail());
            profile.setPhone(profileDto.getPhone());
            profile.setPassword(profileDto.getPassword());
            profile.setStatus(profileDto.getStatus());
            profile.setRole(profileDto.getRole());
            profile.setVisible(profileDto.getVisible());
            profile.setCreated_date(profileDto.getCreated_date());
            profile.setPhoto_id(profileDto.getPhoto_id());
            profileRepository.save(profile);
            return new Result(true, "O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        profileRepository.deleteById(id);
        return new Result(true, "O'chirildi");
    }
}
