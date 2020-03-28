package in.sagarpawar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.sagarpawar.onlinebookstore.entity.Book;

@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long>{
	
//	@RestResource(path = "categoryid")
//	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
}