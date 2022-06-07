package assembler;

import java.util.Collection;
import java.util.List;

public interface Assembler<S, T> {

    T assemble(S source);
    List<T> assemble(Collection<S> sources);

}
