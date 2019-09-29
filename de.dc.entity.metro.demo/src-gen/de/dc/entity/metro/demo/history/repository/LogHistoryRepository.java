package de.dc.entity.metro.demo.history.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.dc.entity.metro.demo.history.model.LogHistory;

@Repository
public interface LogHistoryRepository extends JpaRepository<LogHistory, Long>{
}
