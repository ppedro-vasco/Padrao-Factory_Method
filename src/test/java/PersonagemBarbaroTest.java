import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonagemBarbaroTest {
    @Test
    void deveCriarPersonagemBarbaro(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Barbaro");
        assertEquals("Barbaro criado com sucesso!", personagem.criar());
    }

    @Test
    void deveDeletarPersonagemBarbaro(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Barbaro");
        assertEquals("Barbaro deletado com sucesso!", personagem.deletar());
    }
}
