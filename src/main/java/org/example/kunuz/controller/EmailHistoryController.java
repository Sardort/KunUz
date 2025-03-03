package org.example.kunuz.controller;

import org.example.kunuz.dto.EmailHistoryDto;
import org.example.kunuz.model.EmailHistory;
import org.example.kunuz.model.Result;
import org.example.kunuz.service.EmailHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emailhistory")
public class EmailHistoryController {
    @Autowired
    EmailHistoryService emailHistoryService;

    @GetMapping
    public List<EmailHistory> getAll(){
        List<EmailHistory> list = emailHistoryService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public EmailHistory getById(@PathVariable Integer id){
        return emailHistoryService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody EmailHistoryDto emailHistoryDto){
        Result result = emailHistoryService.create(emailHistoryDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody EmailHistoryDto emailHistoryDto){
        Result result = emailHistoryService.update(id, emailHistoryDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = emailHistoryService.delete(id);
        return result;
    }
}
