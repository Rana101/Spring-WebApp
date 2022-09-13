package rana.springframework.Spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import rana.springframework.Spring5WebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
