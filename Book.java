package OOP_Projects.Fetching_DataToFile;
public abstract class Book implements info, Comparable<Book>
{
  private String title;
  private String author;
  private String ISBN;

  public Book() 
  {

  }

  public Book(String title, String author, String iSBN) 
  {
    this.title = title;
    this.author = author;
    ISBN = iSBN;
  }

  public String getTitle() 
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getAuthor() 
  {
    return author;
  }

  public void setAuthor(String author) 
  {
    this.author = author;
  }

  public String getISBN() 
  {
    return ISBN;
  }

  public void setISBN(String iSBN) 
  {
    ISBN = iSBN;
  }

  @Override
  public abstract void display();

  @Override
  public int compareTo(Book compare) {
    return this.title.compareToIgnoreCase(compare.title);
  }

  
  
}
