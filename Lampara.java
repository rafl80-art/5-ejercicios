public class Lampara {
    public boolean estado;
    public Lampara(){
        this.estado = false;
    
    }
    public void interruptor(boolean estado){
        this.estado =  estado;

    }
    public void informacion(){
        if(this.estado){
            System.out.println("la Lampara esta encendida");
        }else{
            System.out.println("la Lampara esta apagada");
        }
    }
    public static void main(String[] args) throws Exception {
        Lampara Lampara = new Lampara();
        Lampara.informacion();
        
    }
}
