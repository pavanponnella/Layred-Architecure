package Layered.architecture.layered.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Book_Details")
@Data
public class BookEntity {

    private Integer bookId;


    private String bookName;

    private Double bookPrice;


}
