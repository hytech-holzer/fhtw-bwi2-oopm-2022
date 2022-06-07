package assembler;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonAssembler extends AbstractAssembler<PersonEntity, PersonDTO> {

    @Override
    public PersonDTO assemble(PersonEntity source) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setVorname(source.getVorname());
        personDTO.setNachname(source.getNachname());
        return personDTO;
    }

    @Override
    protected List<PersonDTO> sortedList(List<PersonDTO> unsorted) {
        Collections.sort(unsorted);
        return unsorted;
    }
}
