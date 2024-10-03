package Layered.architecture.layered.serviceImpl;

import Layered.architecture.layered.entity.BookEntityClass;
import Layered.architecture.layered.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookRepository br;


    @Override
    public String addBook(BookEntityClass book) {
        Integer bookId = book.getBookId();


        BookEntityClass save = br.save(book);


        if (bookId == null) {
            return "Record inserted successfully";
        } else {
            return "Record updated successfully";
        }

    }

    @Override
    public List<BookEntityClass> getAllBookDetails() {


        return br.findAll();
    }

    @Override
    public String deleteBook(Integer bookID) {
        br.deleteById(bookID);
        return "BookDeleted successfully";
    }
}
