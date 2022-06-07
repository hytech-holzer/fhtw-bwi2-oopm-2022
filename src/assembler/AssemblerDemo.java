package assembler;

import java.util.ArrayList;
import java.util.Collection;

public class AssemblerDemo {

    public static void main(String[] args) {
        Collection<AutoEntity> autoEntities = new ArrayList<>();
        autoEntities.add(createAutoEntity("white", "Volkswagen", 15000));
        autoEntities.add(createAutoEntity("red", "Skoda", 16000));
        autoEntities.add(createAutoEntity("brown", "Dacia", 500));

        Collection<AutoDTO> autoDTOs = AssemblerFactory.getAutoAssembler().assemble(autoEntities);
        autoDTOs.forEach(System.out::println);

        Collection<PersonEntity>  personEntities = new ArrayList<>();
        personEntities.add(createPersonEntity("Raphael", "Kelly"));
        personEntities.add(createPersonEntity("Adam", "Adams"));
        personEntities.add(createPersonEntity("Kevin", "Berta"));

        Collection<PersonDTO> personDTOs = AssemblerFactory.getPersonAssember().assemble(personEntities);
        personDTOs.forEach(System.out::println);
    }

    private static PersonEntity createPersonEntity(String vorname, String nachname) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setVorname(vorname);
        personEntity.setNachname(nachname);
        return personEntity;
    }

    private static AutoEntity createAutoEntity(String color, String brand, double price) {
        AutoEntity autoEntity = new AutoEntity();
        autoEntity.setColor(color);
        autoEntity.setBrand(brand);
        autoEntity.setPrice(price);
        return autoEntity;
    }


}
