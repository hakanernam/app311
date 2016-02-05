package app311

import java.time.*

class Book {

   String title
   //LocalDateTime dateCreated
   //LocalDate published = LocalDate.now()
   BookType type = BookType.GOOD

    static constraints = {
      title blank:false
      //published nullable:true
    }
}


enum BookType{
    GOOD, BAD, BORING
}
