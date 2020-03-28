import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/common/book';
import { BooksService } from 'src/app/services/books.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {


  books: Book[];

  constructor(private _bookService: BooksService) { }

  ngOnInit() {
    this.listBooks();
  }

  listBooks(){
    this._bookService.getBooks().subscribe(
      data=>this.books=data
    )
  }

}
