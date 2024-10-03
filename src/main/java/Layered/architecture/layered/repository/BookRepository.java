package Layered.architecture.layered.repository;

import Layered.architecture.layered.entity.BookEntityClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BookRepository extends JpaRepository<BookEntityClass, Serializable> {

}
