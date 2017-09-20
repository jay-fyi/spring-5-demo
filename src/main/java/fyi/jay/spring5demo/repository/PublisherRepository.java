package fyi.jay.spring5demo.repository;

import org.springframework.data.repository.CrudRepository;

import fyi.jay.spring5demo.model.Publisher;

/**
 * Created by jyu on 9/19/17.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
