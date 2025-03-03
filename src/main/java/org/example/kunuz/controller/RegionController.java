package org.example.kunuz.controller;

import org.example.kunuz.dto.RegionDto;
import org.example.kunuz.model.Region;
import org.example.kunuz.model.Result;
import org.example.kunuz.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {
    @Autowired
    RegionService regionService;

    @GetMapping
    public List<Region> getAll(){
        List<Region> list = regionService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public Region getById(@PathVariable Integer id){
        return regionService.getById(id);
    }

    @PostMapping
    public Result creaet(@RequestBody RegionDto regionDto){
        Result result = regionService.create(regionDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody RegionDto regionDto){
        Result result = regionService.update(id, regionDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = regionService.delete(id);
        return result;
    }
}
