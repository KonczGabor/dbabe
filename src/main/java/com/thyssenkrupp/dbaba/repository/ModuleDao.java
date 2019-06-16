package com.thyssenkrupp.dbaba.repository;

import com.thyssenkrupp.dbaba.domain.Module;
import org.springframework.data.repository.CrudRepository;

public interface ModuleDao  extends CrudRepository<Module, Long> {

}
