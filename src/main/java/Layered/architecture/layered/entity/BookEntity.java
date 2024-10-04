package Layered.architecture.layered.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Book_Details")
@Data
public class BookEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookid;

	@Column(name = "book_name")
	private String bookname;

	@Column(name = "book_price")
	private Double bookprice;

}
