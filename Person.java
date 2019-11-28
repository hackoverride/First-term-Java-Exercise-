public class Person{

  //setting variables
  private int id = 0;
  private String fornavn;
  private String etternavn;
  private int telefon;
  private String epost;
  private int alder;
  
  public Person(int id, String fornavn, String etternavn, int telefon, String epost, int alder){
    this.id = id;
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.telefon = telefon;
    this.epost = epost;
    this.alder = alder;
  }
  
  public String toString(){
    String temp = "Name: " + fornavn + " " + etternavn + "\n" +
                  "Phone: " + telefon + " " + "Email: " + epost + "\n" +
                  "Age: " + alder + "\n";
    return temp;
  }

  public void setAge(int x){
    this.age = x;
  }
  public void setPhone(int x){
    this.telefon = x;
  }
  public void setEmail(String s){
    this.epost = s;
  }

}
