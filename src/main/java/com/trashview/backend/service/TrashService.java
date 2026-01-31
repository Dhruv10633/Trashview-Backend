package com.trashview.backend.service;

import com.trashview.backend.exception.TrashNotfoundException;
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

    public String getTrashById(@PathVariable int id) {
        if(id < 0 || id >= trash.size()) {
            throw new TrashNotfoundException("Give valid id from 0 to "+(trash.size()-1) );
        }
        return trash.get(id);

    }
}
