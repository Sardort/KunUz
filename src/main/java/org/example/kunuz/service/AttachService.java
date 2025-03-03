package org.example.kunuz.service;

import org.example.kunuz.dto.AttachDto;
import org.example.kunuz.model.Attach;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.AttachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttachService {
    @Autowired
    AttachRepository attachRepository;

    //getAll
    public List<Attach> getAll(){
        return attachRepository.findAll();
    }

    //getById
    public Attach getById(Integer id){
        return attachRepository.findById(id).get();
    }

    //create
    public Result create(AttachDto attachDto){
        Attach attach = new Attach();
        attach.setOriginal_name(attachDto.getOriginal_name());
        attach.setPath(attachDto.getPath());
        attach.setSize(attachDto.getSize());
        attach.setExtension(attachDto.getExtension());
        attach.setCreated_date(attachDto.getCreated_date());
        attachRepository.save(attach);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, AttachDto attachDto){
        Optional<Attach> attachOptional = attachRepository.findById(id);
        if (attachOptional.isPresent()){
            Attach attach = attachOptional.get();
            attach.setOriginal_name(attachDto.getOriginal_name());
            attach.setPath(attachDto.getPath());
            attach.setSize(attachDto.getSize());
            attach.setExtension(attachDto.getExtension());
            attach.setCreated_date(attachDto.getCreated_date());
            attachRepository.save(attach);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        attachRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
