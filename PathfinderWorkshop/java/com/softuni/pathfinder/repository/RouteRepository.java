package com.softuni.pathfinder.repository;

import com.softuni.pathfinder.Domain.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long> {
    @Query("SELECT r FROM Route AS r ORDER BY size(r.comments) DESC")
    List<Route> findMostCommented();
}
