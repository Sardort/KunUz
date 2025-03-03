package org.example.kunuz.service;

import org.example.kunuz.dto.RegionDto;
import org.example.kunuz.model.Region;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {
    @Autowired
    RegionRepository regionRepository;

    //getAll
    public List<Region> getAll(){
        return regionRepository.findAll();
    }

    //getById
    public Region getById(Integer id){
        return regionRepository.findById(id).get();
    }

    //create
    public Result create(RegionDto regionDto){
        Region region = new Region();
        region.setOrder_number(regionDto.getOrder_number());
        region.setName_uz(regionDto.getName_uz());
        region.setName_ru(regionDto.getName_ru());
        region.setName_en(regionDto.getName_en());
        region.setVisible(regionDto.getVisible());
        region.setCreated_date(regionDto.getCreated_date());
        regionRepository.save(region);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, RegionDto regionDto){
        Optional<Region> regionOptional = regionRepository.findById(id);
        if (regionOptional.isPresent()){
            Region region = regionOptional.get();
            region.setOrder_number(regionDto.getOrder_number());
            region.setName_uz(regionDto.getName_uz());
            region.setName_ru(regionDto.getName_ru());
            region.setName_en(regionDto.getName_en());
            region.setVisible(regionDto.getVisible());
            region.setCreated_date(regionDto.getCreated_date());
            regionRepository.save(region);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        regionRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
