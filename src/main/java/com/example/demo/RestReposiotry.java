package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource//create the api for us with defaults
public interface RestReposiotry extends CrudRepository<User,Integer> {
    //CrudRepository gives methods to



}
