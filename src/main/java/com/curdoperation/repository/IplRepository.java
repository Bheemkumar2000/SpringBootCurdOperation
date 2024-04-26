package com.curdoperation.repository;

import com.curdoperation.entity.IplTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IplRepository extends JpaRepository<IplTeam,Integer> {
}
