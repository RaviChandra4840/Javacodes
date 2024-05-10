public class AirPerson {
    String name;
    String nationality;
    String dateOfBirth;
    int seatNumber;
    public AirPerson(String  name, String nationality, String dateOfBirth, int seatNumber){
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.nationality = nationality;
        this.seatNumber = seatNumber;
    }
    public AirPerson(AirPerson source){
        this.dateOfBirth = source.dateOfBirth;
        this.name = source.name;
        this.nationality = source.nationality;
        this.seatNumber = source.seatNumber;
    }
    public String getname(){
        return this.name;
    }
    public String getnationality(){
        return this.nationality;
    }
    public String getdateofBirth(){
        return this.dateOfBirth;
    }
    public int getseatNumber(){
        return this.seatNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setnationality(String natioinality){
        this.nationality = natioinality;
    }
    public void setdateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setseatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
    public boolean applyPassport(){
        int x = (int)(Math.random() * 2);
        if(x == 0){
            return false;
        } 
        else{
            return true;
        }
    }
    public void chooseSeat(){
        this.seatNumber = (int)(Math.random() * 11 + 1);
    }
}