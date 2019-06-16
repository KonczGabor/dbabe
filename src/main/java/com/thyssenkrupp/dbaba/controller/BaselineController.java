package com.thyssenkrupp.dbaba.controller;

import com.thyssenkrupp.dbaba.domain.Baseline;
import com.thyssenkrupp.dbaba.repository.BaselineDao;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/baseline")
public class BaselineController {

  @Autowired
  BaselineDao baselineDao;

  @GetMapping("/get-all")
  public Iterable<Baseline> getAll(){
    return baselineDao.findAll();
  }

  @GetMapping("/populate")
  public void populate(){
    baselineDao.save(new Baseline(
        "Baseline_name_1",
        "Baseline_type_1",
        "Baseline_Version_1", "module_id_1", "Baseline_creator_1",
        LocalDateTime.now() , "Baseline_modifier_1",
        LocalDateTime.now()));

    baselineDao.save(new Baseline(
        "Baseline_name_2",
        "Baseline_type_2",
        "Baseline_Version_1", "module_id_1", "Baseline_creator_1",
        LocalDateTime.now() , "Baseline_modifier_1",
        LocalDateTime.now()));

    baselineDao.save(new Baseline(
        "Baseline_name_3",
        "Baseline_type_1",
        "Baseline_Version_1", "module_id_3", "Baseline_creator_1",
        LocalDateTime.now() , "Baseline_modifier_1",
        LocalDateTime.now()));
  }

  @CrossOrigin(origins="http://localhost:4200/find-by-module/{moduleId}")
  @GetMapping("/find-by-module/{moduleId}")
  public Iterable<Baseline> findByModule(@PathVariable String moduleId){
   return baselineDao.findByModuleId(moduleId);
  }



  @GetMapping("/delete-all")
  public void deleteAll(){
    baselineDao.deleteAll();
  }


}
