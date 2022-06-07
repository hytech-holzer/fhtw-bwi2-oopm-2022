package assembler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AutoAssembler extends AbstractAssembler<AutoEntity, AutoDTO>{

    @Override
    public AutoDTO assemble(AutoEntity source) {
        AutoDTO autoDTO = new AutoDTO();
        autoDTO.setColor(source.getColor());
        autoDTO.setBrand(source.getBrand());
        autoDTO.setPrice(source.getPrice());
        return autoDTO;
    }

    @Override
    protected List<AutoDTO> sortedList(List<AutoDTO> unsorted) {
        Collections.sort(unsorted);
        return unsorted;
    }
}
