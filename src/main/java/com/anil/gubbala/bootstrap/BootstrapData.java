package com.anil.gubbala.bootstrap;

import com.anil.gubbala.domain.Author;
import com.anil.gubbala.domain.Book;
import com.anil.gubbala.repositories.AuthorRepository;
import com.anil.gubbala.repositories.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class BootstrapData implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evan");
        Book ddd = new Book("Document Driven Development", "4098");
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEjb = new Book("J2EE Development without EJB's", "5487");

        rod.getBooks().add(noEjb);
        noEjb.getAuthor().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEjb);

        log.info("Started in Bootstrap");
        log.info("Number of Books:: {}", bookRepository.count());

    }
}
