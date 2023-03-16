import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemMagoTest {
    @Test
    void deveCriarPersonagemMago(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Mago");
        assertEquals("Mago criado com sucesso!", personagem.criar());
    }
    @Test
    void deveDeletarPersonagemMago(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Mago");
        assertEquals("Mago deletado com sucesso!", personagem.deletar());
    }
}
