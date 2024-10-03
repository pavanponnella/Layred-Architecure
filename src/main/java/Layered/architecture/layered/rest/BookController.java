package Layered.architecture.layered.rest;


import Layered.architecture.layered.entity.BookEntity;
import Layered.architecture.layered.serviceImpl.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class BookController {


    @Autowired
    private BookService bre;


    @PostMapping("/add-book-details")
    public ResponseEntity<String> addBookDetails(@RequestBody BookEntity bnc) {
        log.debug("Received request to add book details: {}", bnc);
        ResponseEntity<String> response;

        String s = bre.addBookDetails(bnc);
        log.debug("Book addition result: {}", s);
        if (true) {
            response = new ResponseEntity<>(s, HttpStatus.CREATED);
        } else {
            response = new ResponseEntity<>(s, HttpStatus.NOT_FOUND);
            log.debug("Returning failure response with status: {}", HttpStatus.NOT_FOUND);
        }

        return response;
    }

@GetMapping("/getAllBookDetails")
    public ResponseEntity<List<BookEntity>> getAllBookDetails() {
        ResponseEntity<List<BookEntity>> response;

        List<BookEntity> allBookDetails = bre.getAllBookDetails();

        if (true) {
            response = new ResponseEntity<>(allBookDetails, HttpStatus.OK);
        } else {
            response = new ResponseEntity<>(allBookDetails, HttpStatus.NOT_FOUND);
        }
        return response;
    }

    @DeleteMapping("/delete-record-by-id/{idNumber}")
    public ResponseEntity<String> deleteRecordById(@PathVariable Integer idNum){

        String s = bre.deleteBookDetailsById(idNum);

        return new ResponseEntity<>(s,HttpStatus.OK);
    }

}
