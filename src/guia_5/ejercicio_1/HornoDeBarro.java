package guia_5.ejercicio_1;

import java.util.List;

public class HornoDeBarro extends Electrodomestico{

    public HornoDeBarro() {
    }

    @Override
    public Ingrediente preparar(List<Ingrediente> ingredientes) {
        for (int i = 0; i < ingredientes.size(); i++) {

            if(contains("Masa", ingredientes)){
                System.out.println("Cocinando por 2 minutos");
                return new Ingrediente("Pan");
            }
        }
        throw new RuntimeException("Ingredientes invalidos");
    }
}
