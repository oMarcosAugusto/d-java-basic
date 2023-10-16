

public class FormaterCepEx {
    public static void main(String[] args) {
        try{
        String cepFormated = fromatCep("2365064");
        System.out.println(cepFormated);
        } catch (CepInvalidExcpetion e){
            System.out.println("The CEP insn't correct, you need to enter the 8 digits");
        }
    }

    static String fromatCep(String cep) throws CepInvalidExcpetion{
        if(cep.length() != 8) 
        throw new CepInvalidExcpetion();

        return "23.765-064";
    } 
}
