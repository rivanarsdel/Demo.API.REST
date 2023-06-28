package dev.RIV.Demo.API.REST.repositories;

import dev.RIV.Demo.API.REST.models.Generic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GenericRepository  extends JpaRepository<Generic, Integer> {
}
