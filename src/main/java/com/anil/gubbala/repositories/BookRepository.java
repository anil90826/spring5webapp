package com.anil.gubbala.repositories;

import com.anil.gubbala.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
