package fr.ycaby.dp.visitor;

public class JsonExportVisitor implements ExportVisitor{
    @Override
    public String visit(Car c) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("car:").append(c.getClass().getSimpleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String visit(Bike b) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("bike:").append(b.getClass().getSimpleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String visit(Truck t) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("truck:").append(t.getClass().getSimpleName());
        sb.append("}");
        return sb.toString();
    }
}
