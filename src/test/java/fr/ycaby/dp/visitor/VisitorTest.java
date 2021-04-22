package fr.ycaby.dp.visitor;

import org.junit.Assert;
import org.junit.Test;

public class VisitorTest {

    @Test
    public void XmlExportTest(){
        ExportVisitor xmlExport = new XmlExportVisitor();
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();
        Assert.assertEquals(c.accept(xmlExport),"<xml>Car</xml>");
        Assert.assertEquals(b.accept(xmlExport),"<xml>Bike</xml>");
        Assert.assertEquals(t.accept(xmlExport),"<xml>Truck</xml>");
    }

    @Test
    public void JsonExportTest(){
        ExportVisitor jsonExport = new JsonExportVisitor();
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();
        Assert.assertEquals(c.accept(jsonExport),"{car:Car}");
        Assert.assertEquals(b.accept(jsonExport),"{bike:Bike}");
        Assert.assertEquals(t.accept(jsonExport),"{truck:Truck}");
    }
}
