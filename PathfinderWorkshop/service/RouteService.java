package com.softuni.pathfinder.service;

import com.softuni.pathfinder.Domain.entities.Route;
import com.softuni.pathfinder.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    private final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }
    public List<Route> getMostCommented() {
        return routeRepository.findMostCommented();
    }
}
