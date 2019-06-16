package com.thyssenkrupp.dbaba.controller;

import com.thyssenkrupp.dbaba.domain.Module;
import com.thyssenkrupp.dbaba.repository.ModuleDao;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/module")
public class ModuleController {

  @Autowired
  ModuleDao moduleDao;

  @GetMapping("/get-all")
  public Iterable<Module> sayHello(){

    return moduleDao.findAll();

  }

  @GetMapping("/populate")
  public void populate(){
    moduleDao.save(new Module(
        "module_name_1",
        "module_id_1",
        "c_person_1",
        LocalDateTime.now() , "m_person_1",
        LocalDateTime.now()));

    moduleDao.save(new Module(
        "module_name_2",
        "module_id_2",
        "c_person_1",
        LocalDateTime.now() , "m_person_1",
        LocalDateTime.now()));

    moduleDao.save(new Module(
        "module_name_3",
        "module_id_3",
        "c_person_1",
        LocalDateTime.now() , "m_person_1",
        LocalDateTime.now()));
  }

  @GetMapping("/delete-all")
  public void deleteAll(){
    moduleDao.deleteAll();
  }



}
