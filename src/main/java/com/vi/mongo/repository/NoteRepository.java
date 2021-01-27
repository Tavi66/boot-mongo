package com.vi.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vi.mongo.model.Note;

@Repository
public interface NoteRepository extends MongoRepository<Note, Integer> {

}
