package fr.ycaby.dp.visitor;

public interface ExportVisitor {
    String visit(Car c);
    String visit(Bike b);
    String visit(Truck t);
}
