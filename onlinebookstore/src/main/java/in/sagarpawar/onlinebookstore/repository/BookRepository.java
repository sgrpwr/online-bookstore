package in.sagarpawar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.sagarpawar.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
//	@RestResource(path = "categoryid")
//	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
}