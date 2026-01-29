package com.trashview.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrashController {
    List<String> trash;

    TrashController() {
        trash = List.of(
                "Plastic Near Park",
                "Garbage On Road"
        );
    }

    @GetMapping("/api/trash")
    public List<String> getAllTrash() {
        return trash;
    }

    @GetMapping("/api/trash/{id}")
    public String getTrashById(@PathVariable String id) {
        try{
            return trash.get(Integer.parseInt(id));
        }catch(NumberFormatException e){
            return "Give valid Trash ID no";
        }catch (IndexOutOfBoundsException e){
            return "Give Trash ID only from 0 to " + (trash.size()-1);
        }
    }
}
