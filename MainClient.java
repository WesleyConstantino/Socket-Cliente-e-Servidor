package socket;

import servidorzinho.src.dev.servidorzinho.Cliente;
import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {
        
        Cliente cliente = new Cliente("172.28.80.1",2400);
        System.out.println("Cliente concluido!");
        
        
    }
}
