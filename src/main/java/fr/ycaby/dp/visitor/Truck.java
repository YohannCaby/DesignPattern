package fr.ycaby.dp.visitor;

public class Truck implements Transport{

    @Override
    public String accept(ExportVisitor v) {
        return v.visit(this);
    }
}
