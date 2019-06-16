package com.thyssenkrupp.dbaba.repository;

import com.thyssenkrupp.dbaba.domain.Baseline;
import org.springframework.data.repository.CrudRepository;

public interface BaselineDao extends CrudRepository<Baseline, Long> {

  Iterable<Baseline> findByModuleId(String moduleId);
}
