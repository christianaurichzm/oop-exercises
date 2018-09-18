package animais;

public class Canarinho extends Ave {
    
    public Canarinho(int tamanhoPasso, int alturaVoo) {
        super(tamanhoPasso, alturaVoo);
    }
    
    public String cantar() {
        return super.produzirSom() + "PIU";
    }
    

}