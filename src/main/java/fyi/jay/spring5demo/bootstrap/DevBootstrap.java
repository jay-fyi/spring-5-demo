package fyi.jay.spring5demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import fyi.jay.spring5demo.model.Author;
import fyi.jay.spring5demo.model.Book;
import fyi.jay.spring5demo.model.Publisher;
import fyi.jay.spring5demo.repository.AuthorRepository;
import fyi.jay.spring5demo.repository.BookRepository;
import fyi.jay.spring5demo.repository.PublisherRepository;

/**
 * Created by jyu on 9/19/17.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){

        Publisher publisher1 = new Publisher("Jay Publisher", "1 st, SF CA");
        publisherRepository.save(publisher1);
        Author author1 = new Author("Jason", "Yu");
        Book book1 = new Book("Spring 5 Demo", "1234", publisher1);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        authorRepository.save(author1);
        bookRepository.save(book1);

        Publisher publisher2 = new Publisher("Demo Publisher", "2 st, SF CA");
        publisherRepository.save(publisher2);
        Author author2 = new Author("Jay", "Fyi");
        Book book2 = new Book("Spring 5 Demo Edition 2", "2345", publisher2);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        authorRepository.save(author2);
        bookRepository.save(book2);

    }
}
