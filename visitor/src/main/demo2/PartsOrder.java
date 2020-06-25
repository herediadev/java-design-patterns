package main.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    private final List<AtvPart> parts;

    public PartsOrder() {
        parts = new ArrayList<>();
    }

    public void addPart(AtvPart part) {
        parts.add(part);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        parts.forEach(part -> part.accept(visitor));
        visitor.visit(this);
    }
}
