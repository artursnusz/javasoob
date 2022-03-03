package OrzelReszka;

public class GameOrzelLogic {
    int min = 0;
    int max = 1;


    public int getRandom(){
        return (int)(Math.random()*(this.max-this.min+1)+this.min);
    }

}
