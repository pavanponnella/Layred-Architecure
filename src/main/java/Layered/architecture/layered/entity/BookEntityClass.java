package Layered.architecture.layered.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Book_Details")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class BookEntityClass {


    @Id
    @Column(name = "book_id")
    private Integer bookId;


    @Column(name = "book_Name")
    private String bookName;


    @Column(name = "book_price")
    private Double bookPrice;


}
