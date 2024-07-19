package yandex.rustam;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LatteInstructions implements Instructions {
    public String getInstructions(){
        return "берем кофе, молоко, сахар и варим";
    }
    public String getCoffeName(){
        return "Латте";
    }
}
