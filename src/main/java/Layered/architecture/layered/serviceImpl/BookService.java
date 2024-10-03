package Layered.architecture.layered.serviceImpl;

import Layered.architecture.layered.entity.BookEntity;

import java.util.List;

public interface BookService {




    public String addBookDetails(BookEntity ber);


    public List<BookEntity> getAllBookDetails();

    public String deleteBookDetailsById(Integer id);



}
