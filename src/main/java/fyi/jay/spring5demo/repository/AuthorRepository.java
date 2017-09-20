package fyi.jay.spring5demo.repository;

import org.springframework.data.repository.CrudRepository;

import fyi.jay.spring5demo.model.Author;

/**
 * Created by jyu on 9/19/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
