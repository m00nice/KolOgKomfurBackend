package com.example.kologkomfurbackend.Service.ServiceImpl;

import com.example.kologkomfurbackend.Model.Collection;
import com.example.kologkomfurbackend.Repository.CollectionRepository;
import com.example.kologkomfurbackend.Service.IService.ICollectionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CollectionService implements ICollectionService {
    private CollectionRepository collectionRepository;
    public CollectionService(CollectionRepository collectionRepository){
        this.collectionRepository = collectionRepository;
    }
    @Override
    public Set<Collection> findAll(){
        Set<Collection> collections = new HashSet<>();
        collectionRepository.findAll().forEach(collections::add);
     return collections;
    }
    @Override
    public Collection save(Collection object) {
        return collectionRepository.save(object);
    }
    @Override
    public void delete(Collection object){
        collectionRepository.delete(object);
    }
    @Override
    public void deleteById(Long aLong){
        collectionRepository.deleteById(aLong);
    }
    @Override
    public Optional<Collection> findById(Long aLong){
        return collectionRepository.findById(aLong);

}}
