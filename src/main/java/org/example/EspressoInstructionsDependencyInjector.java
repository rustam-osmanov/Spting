package org.example;

public class EspressoInstructionsDependencyInjector implements CoffeeInstructionsDependencyInjection{
    @Override
    public Barista getBarista() {
        EspressoInstructions instructions = new EspressoInstructions();
        Barista barista = new Barista();
        barista.setLatteInstructions(instructions);
        return barista;
    }
}
