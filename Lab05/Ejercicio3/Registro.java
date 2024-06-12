import java.util.ArrayList;

public class Registro{
    private ArrayList<Turista> reg;
    public Registro(){
        this.reg = new ArrayList<Turista>();
    }

    public void addRegistro(Turista t){
        this.reg.add(t);
    }

    public String toString(){
        String text = "";
        for(Turista t : this.reg){
            text += "Turista: " +  t.toString() + "\n";
        }
        return text;
    }
}