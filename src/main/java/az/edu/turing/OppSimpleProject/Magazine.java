package az.edu.turing.OppSimpleProject;

import java.util.Objects;

public class Magazine extends İtem{

    private int issueNumber;
    private String publicationDate;

    public Magazine(String title,int id,boolean borrowed,int issueNumber,String publicationDate){
        super(title,id,borrowed);
        this.issueNumber=issueNumber;
        this.publicationDate=publicationDate;
    }

    public int getIssueNumber(){
        return issueNumber;
    }

    public String getPublicationDate(){
        return publicationDate;
    }

    public  void setIssueNumber(int issueNumber){
        this.issueNumber=issueNumber;
    }

    public void setPublicationDate(String publicationDate){
        this.publicationDate=publicationDate;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("IssueNumber:"+issueNumber+"\n"+"PublicationDate:"+publicationDate);
    }

    @Override
    public String toString(){
        return getTitle()+"\n"+getId()+"\n"+issueNumber+"\n"+publicationDate;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Magazine magazine=(Magazine) o;
        return issueNumber==magazine.issueNumber && Objects.equals(publicationDate,magazine.publicationDate);
    }

    @Override
    public  int hashCode(){
        return Objects.hash(issueNumber,publicationDate);
    }
}
