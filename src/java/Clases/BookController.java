package Clases;

/**
 *
 * @author JP
 */
public class BookController {
      Book[] arrayBook;
    int indiceArray;
    
    public BookController(){
        this.arrayBook = new Book[100];
        this.indiceArray=0;
    }
    
     public void saveBook(Book alumno){
        this.arrayBook[this.indiceArray]=alumno;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public Book[] getBook(){
        return this.arrayBook;
    }
    
}
