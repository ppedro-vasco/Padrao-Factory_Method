import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemDruidaTest {
    @Test
    void deveCriarPersonagemDruida(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Druida");
        assertEquals("Druida criado com sucesso!", personagem.criar());
    }

    @Test
    void deveDeletarPersonagemDruida(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Druida");
        assertEquals("Druida deletado com sucesso!", personagem.deletar());
    }
}
