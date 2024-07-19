package yandex.rustam;

import org.springframework.stereotype.Component;

@Component
public class EspressoInstructions implements Instructions {

    public String getInstructions(){
        return "берем 2xкофе, молоко, сахар и варим";
    }
    public String getCoffeName(){
        return "Еспрессо";
    }
}
