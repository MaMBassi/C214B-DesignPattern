import br.inatel.cdg.impl.Observador;
import br.inatel.cdg.impl.Observavel;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteObserver {
    //Verificar se há registros de observadores
    @Test
    public void testeRegistros(){
        Observavel observavel = new Observavel();
        Observador obs1 = new Observador(1);
        observavel.registraObservador(obs1);

        assertTrue(!observavel.getLeitores().isEmpty());
    }

    //Verificar se há dois registros de observadores
    @Test
    public void testeDoisRegistros(){
        Observavel observavel = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        observavel.registraObservador(obs1);
        observavel.registraObservador(obs2);

        assertEquals(observavel.getLeitores().size(),2);
    }

    //Verificar se há remoção dos registros de observadores
    @Test
    public void testeRemoverRegistros(){
        Observavel observavel = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        observavel.registraObservador(obs1);
        observavel.registraObservador(obs2);
        observavel.removeObservador(obs1);
        observavel.removeObservador(obs2);

        assertTrue(observavel.getLeitores().isEmpty());
    }

    //Verificar se há remoção de um registro de observador
    @Test
    public void testeRemoverUmRegistros(){
        Observavel observavel = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        observavel.registraObservador(obs1);
        observavel.registraObservador(obs2);
        observavel.removeObservador(obs1);

        assertEquals(observavel.getLeitores().size(),1);
    }

}
