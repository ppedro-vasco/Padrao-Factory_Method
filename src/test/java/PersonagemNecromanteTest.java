import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemNecromanteTest {
    @Test
    void deveCriarPersonagemNecromante(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Necromante");
        assertEquals("Necromante criado com sucesso!", personagem.criar());
    }
    @Test
    void deveDeletarPersonagemNecromante(){
        IPersonagem personagem = PersonagemFactory.obterClassePersonagem("Necromante");
        assertEquals("Necromante deletado com sucesso!", personagem.deletar());
    }
}
