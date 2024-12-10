package az.edu.turing.OppSimpleProject;

import java.util.Objects;

public class Book extends İtem{

    private String author;
    private String genre;

    public Book(String title,int id,boolean borrowed,String author,String genre){
        super(title,id,borrowed);
        this.author=author;
        this.genre=genre;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre=genre;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author:"+author+"\n"+"Genre:"+genre);
    }

    @Override
    public String toString(){
        return getTitle()+"\n"+getId()+"\n"+borrowed+"\n"+author+"\n"+genre;
    }

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null || getClass()!=o.getClass()) return  false;
        Book book=(Book) o;
        return  Objects.equals(book,book.author) &&   Objects.equals(book,book.genre);
    }

    @Override
    public int hashCode(){
        return Objects.hash(author,genre);
    }
}
