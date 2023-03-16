import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemPaladinoTest {
    @Test
    void deveCriarPersonagemPaladino(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Paladino");
        assertEquals("Paladino criado com sucesso!", personagem.criar());
    }
    @Test
    void deveDeletarPersonagemPaladino(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Paladino");
        assertEquals("Paladino deletado com sucesso!", personagem.deletar());
    }
}
