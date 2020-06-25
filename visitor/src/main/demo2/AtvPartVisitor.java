package main.demo2;

public interface AtvPartVisitor {

    void visit(Fender oil);

    void visit(Oil oil);

    void visit(Wheel wheel);

    void visit(PartsOrder partsOrder);
}
