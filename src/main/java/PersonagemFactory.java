public class PersonagemFactory {
    public static IPersonagem obterClassePersonagem (String classePersonagem){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Personagem" + classePersonagem);
            objeto = classe.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Classe de personagem inexistente");
        } if (!(objeto instanceof IPersonagem)){
            throw new IllegalArgumentException("Classe de personagem invalida");
        }
        return (IPersonagem) objeto;
    }
}
