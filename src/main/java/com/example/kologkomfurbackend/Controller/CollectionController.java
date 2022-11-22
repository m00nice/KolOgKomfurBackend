package com.example.kologkomfurbackend.Controller;

import com.example.kologkomfurbackend.Model.Collection;
import com.example.kologkomfurbackend.Service.ServiceImpl.CollectionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/collection")
public class CollectionController {
    CollectionService collectionService;
    @GetMapping
    public ResponseEntity<Set<Collection>> getAllCollections(){
        return new ResponseEntity<>(collectionService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Collection> addCollection (Collection newCollection) {
        return new ResponseEntity<>(collectionService.save(newCollection), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Set<Collection>> deleteCollection(@PathVariable Collection collection){
        collectionService.delete(collection);
        return new ResponseEntity<>(collectionService.findAll(),HttpStatus.OK);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Collection> editCollection(@PathVariable Collection collection) {
        Optional<Collection> collectionTemp = collectionService.findById(collection.getId());
        if (collectionTemp.isPresent()) {
            if (collection.getId() == null) {
                collection.setId(collection.getId());
            }
            if (collection.getName() == null) {
                collection.setName(collection.getName());
            }
            collectionService.save(collection);
        return new ResponseEntity<>(collection, HttpStatus.OK);
    } else {
            return new ResponseEntity<>(collection, HttpStatus.OK);
        }
    }
}
