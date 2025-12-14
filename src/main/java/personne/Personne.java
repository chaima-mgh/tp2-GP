package personne;
public class Personne {
    String orientation;
    public Personne(){
        this.orientation = "nord";
    }
    public String tourner(int fois){
        if(fois  == 0){
           orientation ="nord";
        }else if(fois == 1){
            orientation ="est";
        }else if(fois  == 2){
            orientation ="sud";
        }else if (fois  == 3){
            orientation ="ouest";
        }
    return orientation ;
    }
}
