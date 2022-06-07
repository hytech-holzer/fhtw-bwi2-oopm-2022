package assembler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractAssembler<S, T> implements Assembler<S, T> {

    @Override
    public final List<T> assemble(Collection<S> sources) {
        List<T> targets = new ArrayList<>();
        for (S source : sources) {
            targets.add(assemble(source));
        }
        return sortedList(targets);
    }

    protected List<T> sortedList(List<T> unsorted) {
        return unsorted;
    }
}
