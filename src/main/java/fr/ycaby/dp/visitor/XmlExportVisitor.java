package fr.ycaby.dp.visitor;

public class XmlExportVisitor implements ExportVisitor{
    @Override
    public String visit(Car c) {
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        sb.append(c.getClass().getSimpleName());
        sb.append("</xml>");
        return sb.toString();
    }

    @Override
    public String visit(Bike b) {
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        sb.append(b.getClass().getSimpleName());
        sb.append("</xml>");
        return sb.toString();
    }

    @Override
    public String visit(Truck t) {
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        sb.append(t.getClass().getSimpleName());
        sb.append("</xml>");
        return sb.toString();
    }
}
