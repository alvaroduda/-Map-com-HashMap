import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        
        //a criação de um Map precisa de uma classe que a estenda, já que Map é uma interface
        //no caso a classe que estende Map é HashMap
        //dentro de <> precisam se passar dois tipos, <Chave,Valor> ou <Key,Value>
        Map <Integer,String> teste1 = new HashMap<>();

        teste1.put(1, "Álvaro");
        teste1.put(2, "Luisa");
        teste1.put(3, "Aurora");
        teste1.put(4, "Luigi");
        teste1.put(5, "teste");

        //método que retorna o valor de uma key
        System.out.println(teste1.get(1) + " ama  " + teste1.get(2));

        //método para remover um item do Map;
        teste1.remove(4);

        //método para verificar se tem uma chave no Map
        System.out.println(teste1.containsKey(6)); //vai retornar false porque não tem uma chave 6 no Map

        //método para verificar se tem uma chave no Map
        System.out.println(teste1.containsValue("Aurora")); // vai retornar true porque existe Aurora no Map

    }
}
