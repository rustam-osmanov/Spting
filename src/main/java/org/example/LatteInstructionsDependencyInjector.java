package org.example;

public class LatteInstructionsDependencyInjector implements CoffeeInstructionsDependencyInjection{
    @Override
    public Barista getBarista() {
        LatteInstructions instructions = new LatteInstructions();
        Barista barista = new Barista();
        barista.setLatteInstructions(instructions);
        return barista;
    }
}
