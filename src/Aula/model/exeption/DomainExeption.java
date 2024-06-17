package Aula.model.exeption;

import java.io.Serial;

public class DomainExeption extends Exception{

    //RumTimeException não obriga o tratamento da exeção.
    @Serial
    private static final long serialVersionUID = 1L;
    public DomainExeption(String msg){
        super(msg);
    }
}
