package org.example.kunuz.service;

import org.example.kunuz.dto.SmsHistoryDto;
import org.example.kunuz.model.Result;
import org.example.kunuz.model.SmsHistory;
import org.example.kunuz.model.entity.StatusSmsRole;
import org.example.kunuz.repository.SmsHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmsHistoryService {
    @Autowired
    SmsHistoryRepository smsHistoryRepository;

    //getAll
    public List<SmsHistory> getAll(){
        return smsHistoryRepository.findAll();
    }

    //getById
    public SmsHistory getById(Integer id){
        return smsHistoryRepository.findById(id).get();
    }

    //create
    public Result create(SmsHistoryDto smsHistoryDto){
        SmsHistory smsHistory = new SmsHistory();
        smsHistory.setPhone(smsHistoryDto.getPhone());
        smsHistory.setMessage(smsHistoryDto.getMessage());
        smsHistory.setStatus(smsHistoryDto.getStatus());
        smsHistory.setType(smsHistoryDto.getType());
        smsHistory.setCreated_date(smsHistoryDto.getCreated_date());
        smsHistory.setStatusSmsRole(StatusSmsRole.USED);
        smsHistoryRepository.save(smsHistory);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, SmsHistoryDto smsHistoryDto){
        Optional<SmsHistory> smsHistoryOptional = smsHistoryRepository.findById(id);
        if (smsHistoryOptional.isPresent()){
            SmsHistory smsHistory = smsHistoryOptional.get();
            smsHistory.setPhone(smsHistoryDto.getPhone());
            smsHistory.setMessage(smsHistoryDto.getMessage());
            smsHistory.setStatus(smsHistoryDto.getStatus());
            smsHistory.setType(smsHistoryDto.getType());
            smsHistory.setCreated_date(smsHistoryDto.getCreated_date());
            smsHistory.setStatusSmsRole(StatusSmsRole.USED);
            smsHistoryRepository.save(smsHistory);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        smsHistoryRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
