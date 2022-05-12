package civilite;

public enum Civilite {
	  
    MADAME("Mme"), MADEMOISELLE("Mlle"), MONSIEUR("M") ;  
      
     private String abreviation ;  
      
     private Civilite(String abreviation) {  
         this.abreviation = abreviation ;  
    }  
      
     public String getAbreviation() {  
         return  this.abreviation ;  
    }  
     
}
