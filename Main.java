package soket;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Servidor servidor = new Servidor(2400);
        System.out.println("Servidor Concluído!");
    }
}
