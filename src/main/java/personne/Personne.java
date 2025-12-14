package personne;
public class Personne {
    String orientation;
    public Personne(){
        this.orientation = "nord";
    }
    public String tourner(int fois){
        if(fois  %4== 0){
           orientation ="nord";
        }else if(fois %4== 1){
            orientation ="est";
        }else if(fois  %4== 2){
            orientation ="sud";
        }else if (fois %4== 3){
            orientation ="ouest";
        }
    return orientation ;
    }
}
