package org.example.kunuz.service;

import org.example.kunuz.dto.EmailHistoryDto;
import org.example.kunuz.model.EmailHistory;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.EmailHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailHistoryService {
    @Autowired
    EmailHistoryRepository emailHistoryRepository;

    //getAll
    public List<EmailHistory> getAll(){
        return emailHistoryRepository.findAll();
    }

    //getById
    public EmailHistory getById(Integer id){
        return emailHistoryRepository.findById(id).get();
    }

    //create
    public Result create(EmailHistoryDto emailHistoryDto){
        EmailHistory emailHistory = new EmailHistory();
        emailHistory.setMessage(emailHistoryDto.getMessage());
        emailHistory.setEmail(emailHistoryDto.getEmail());
        emailHistory.setCreated_data(emailHistoryDto.getCreated_data());
        emailHistoryRepository.save(emailHistory);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, EmailHistoryDto emailHistoryDto){
        Optional<EmailHistory> emailHistoryOptional = emailHistoryRepository.findById(id);
        if (emailHistoryOptional.isPresent()){
            EmailHistory emailHistory = emailHistoryOptional.get();
            emailHistory.setMessage(emailHistoryDto.getMessage());
            emailHistory.setEmail(emailHistoryDto.getEmail());
            emailHistory.setCreated_data(emailHistoryDto.getCreated_data());
            emailHistoryRepository.save(emailHistory);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        emailHistoryRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
