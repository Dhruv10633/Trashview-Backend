package com.trashview.backend.controllers;

import com.trashview.backend.service.TrashService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TrashController {

    private final TrashService trashService;

    TrashController(TrashService trashService) {
        this.trashService = trashService;
    }

    @GetMapping("/api/trash")
    public List<String> getAllTrash() {
        return trashService.getAllTrash();
    }

    @GetMapping("/api/trash/{id}")
    public String getTrashById(@PathVariable String id) {
        return trashService.getTrashById(id);
    }

    @GetMapping("/api/trash/search")
    public String getAllTrashByArea(@RequestParam String area) {
        return area;
    }
}
