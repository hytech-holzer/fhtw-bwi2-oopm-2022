package assembler;

public class AssemblerFactory {

    public static Assembler<AutoEntity, AutoDTO> getAutoAssembler() {
        return new AutoAssembler();
    }

    public static Assembler<PersonEntity, PersonDTO> getPersonAssember() {
        return new PersonAssembler();
    }

}
