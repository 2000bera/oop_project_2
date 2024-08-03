package OOP_Projects.Fetching_DataToFile;

import java.util.ArrayList;
import java.util.Collections;

public class TestProgram 
{
  public static void main(String[] args) 
  {
    ArrayList<Book> books = new ArrayList<Book>(6);

    books.add(new EBook("The C++ Programming Language", "Bjarne Stroustrup", "1321563841", 203178));
    books.add(new EBook("The Grapes of Wrath", "John Steinbeck", "167001617X", 9590));
    books.add(new EBook("To Kill A Mockingbird", "Harper Lee", "1162420715", 3503));
    books.add(new PrintBook("The C++ Programming Language", "Bjarne Stroustrup","0321563840",1365, 1.7));
    books.add(new PrintBook("Head First Java", "Kathy Sierra", "0596009208", 688, 1.3));
    books.add(new PrintBook("Beginning Programming for Dummies", "Barry Burd", "0018407803", 430, 0.64));

   Collections.sort(books);

   for(int i = 0; i < books.size(); i++) {
    books.get(i).display();
    System.out.println();
   }
   
  }
  
}
