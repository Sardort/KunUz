package org.example.kunuz.controller;

import org.example.kunuz.dto.AttachDto;
import org.example.kunuz.model.Attach;
import org.example.kunuz.model.Result;
import org.example.kunuz.service.AttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attach")
public class AttachController {
    @Autowired
    AttachService attachService;

    @GetMapping
    public List<Attach> getAll(){
        List<Attach> list = attachService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Attach getById(@PathVariable Integer id){
        return attachService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody AttachDto attachDto){
        Result result = attachService.create(attachDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody AttachDto attachDto){
        Result result = attachService.update(id, attachDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = attachService.delete(id);
        return result;
    }
}
