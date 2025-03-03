package org.example.kunuz.controller;

import org.example.kunuz.dto.SmsHistoryDto;
import org.example.kunuz.model.Result;
import org.example.kunuz.model.SmsHistory;
import org.example.kunuz.service.SmsHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/smshistory")
public class SmsHistoryController {
    @Autowired
    SmsHistoryService smsHistoryService;

    @GetMapping
    public List<SmsHistory> getAll() {
        List<SmsHistory> list = smsHistoryService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public SmsHistory getById(@PathVariable Integer id) {
        SmsHistory smsHistory = smsHistoryService.getById(id);
        return smsHistory;
    }

    @PostMapping
    public Result create(@RequestBody SmsHistoryDto smsHistoryDto) {
        Result result = smsHistoryService.create(smsHistoryDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody SmsHistoryDto smsHistoryDto){
        Result result = smsHistoryService.update(id, smsHistoryDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Result result = smsHistoryService.delete(id);
        return result;
    }
}
