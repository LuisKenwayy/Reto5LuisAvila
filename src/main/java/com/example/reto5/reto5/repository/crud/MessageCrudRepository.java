package com.example.reto5.reto5.repository.crud;

import com.example.reto5.reto5.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository <Message, Integer>{
    
}
