package Layered.architecture.layered.serviceImpl;

import Layered.architecture.layered.entity.BookEntityClass;

import java.util.List;

public interface BookService {

    public String addBook(BookEntityClass book);


    public List<BookEntityClass> getAllBookDetails();


    public String deleteBook(Integer book);


}
