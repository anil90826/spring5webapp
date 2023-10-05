package com.anil.gubbala.repositories;

import com.anil.gubbala.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
