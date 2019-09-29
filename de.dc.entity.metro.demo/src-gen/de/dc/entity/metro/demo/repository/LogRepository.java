package de.dc.entity.metro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.dc.entity.metro.demo.model.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Long>{
}
