package fr.ycaby.dp.visitor;

public interface Transport {
    public String accept(ExportVisitor v);
}
