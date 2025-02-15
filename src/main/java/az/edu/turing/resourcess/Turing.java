package az.edu.turing.resourcess;

import java.io.Serializable;

public class Turing implements Serializable {

   private String companyName;
   private int foundationYear;

    public Turing(String companyName, int foundationYear) {
        this.companyName = companyName;
        this.foundationYear = foundationYear;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
}
