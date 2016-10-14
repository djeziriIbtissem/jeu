/**
 * Created by HP on 14/10/2016.
 */
public class joueur {
    private string pseudo;
    private int score ;
    public int calculescore (int d){
        score=score+d;
        return score;
    }
    public int getscore(){
        return this.score;
    }
    public string getPseudo(){
        return this.pseudo ;
    }
    public joueur (string pseudo){
        score=0;
        this.pseudo=pseudo;
    }
}

