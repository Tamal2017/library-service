package jo.training.library.controllers;

import java.util.ArrayList;
import java.util.List;
import jo.training.library.api.LibraryApi;
import jo.training.library.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController implements LibraryApi {

  @Override
  public ResponseEntity<List<Book>> getAllBooks() {
    List<Book> books = new ArrayList<>();
    Book book1 = new Book().name("The hand of God").author("J.C");
    Book book2 = new Book().name("The book").author("Joseph S.");
    books.add(book1);
    books.add(book2);

    return new ResponseEntity<>(books, HttpStatus.OK);
  }
}
