package Layered.architecture.layered.rest;


import Layered.architecture.layered.entity.BookEntityClass;
import Layered.architecture.layered.serviceImpl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {

    @Autowired
    private BookService bs;


    @PostMapping("/add-book-details")
    public ResponseEntity<String> addBookDetails(@RequestBody BookEntityClass bnc) {
        String s = bs.addBook(bnc);
        return new ResponseEntity<>(s, HttpStatus.CREATED);

    }


    @GetMapping
    public ResponseEntity<List<BookEntityClass>> getAllTheBookDetails() {
        List<BookEntityClass> allBookDetails = bs.getAllBookDetails();

        return new ResponseEntity<>(allBookDetails, HttpStatus.OK);
    }

    @DeleteMapping("/delete-record/{idNumber}")
    public ResponseEntity<String> deleteTheRecord(@PathVariable("idNumber")Integer idNum){
        String s = bs.deleteBook(idNum);
        return new ResponseEntity<>(s,HttpStatus.OK);
    }
}
