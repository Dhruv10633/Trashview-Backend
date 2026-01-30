package com.trashview.backend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TrashService {
    public final List<String> trash = List.of(
            "Plastic Near Park",
            "Garbage On Road"
    );

    public List<String> getAllTrash() {
        return trash;
    }

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
