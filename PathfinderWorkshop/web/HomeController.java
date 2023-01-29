package com.softuni.pathfinder.web;

import com.softuni.pathfinder.Domain.entities.Route;
import com.softuni.pathfinder.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final RouteService routeService;

    @Autowired
    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Route> routes = routeService.getMostCommented();
        Route mostCommentedRoute = routes.get(0);
        model.addAttribute("mostCommented", mostCommentedRoute);

        return "index";
    }
}
