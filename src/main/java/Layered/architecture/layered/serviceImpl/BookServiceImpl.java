package Layered.architecture.layered.serviceImpl;

import Layered.architecture.layered.entity.BookEntity;
import Layered.architecture.layered.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService{

@Autowired
   private  BookRepository br;


    @Override
    public String addBookDetails(BookEntity ber) {

        Integer bookId = ber.getBookId();
        BookEntity save = br.save(ber);
        if(bookId==null) {
            return "record inserted successfully";
        }else{
            return "record updated";
        }
    }

    @Override
    public List<BookEntity> getAllBookDetails() {
        return br.findAll();
    }

    @Override
    public String deleteBookDetailsById(Integer id) {
        br.deleteById(id);
        return  "record deleted successfully";
    }
}
