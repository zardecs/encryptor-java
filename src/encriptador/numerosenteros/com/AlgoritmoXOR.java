package encriptador.numerosenteros.com;

public class AlgoritmoXOR implements Algoritmo{
    
    private long codigo;
    
    public AlgoritmoXOR(long codigo){
        this.codigo = codigo;
    }

    @Override
    public long encriptar(long numero) {
        return numero ^ codigo;
    }

    @Override
    public long desencriptar(long numero) {
        return numero ^ codigo;
    }

    @Override
    public String toString() {
        return "Algoritmo XOR";
    }
    
    
}
