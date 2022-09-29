// Suma de las compras
package tp2;
public class compras {
    double cantproductos;
    frutas fr = new frutas();
        verduras vr = new verduras();
        abarrotes ab = new abarrotes();
        double total;
    public compras(){    
        System.out.println("FACTURA"); 
        System.out.println("Manzanas: "+fr.manzanas +" precio c/u Q"+fr.preciomanzanas+".00 costo Q"+fr.subman+".00");
        System.out.println("Peras: "+fr.peras +"   precio c/u Q"+fr.precioperas+".00    costo Q"+fr.subper+".00");
        System.out.println("Uvas: "+fr.uvas +"    precio c/u Q"+fr.preciouvas+".00     costo Q"+fr.subuva);
        System.out.println("Bananos: "+fr.bananos +" precio c/u Q"+fr.preciobananos+".00  costo Q"+fr.subban);
        System.out.println("Sandias: "+fr.sandias +" precio c/u Q"+fr.preciosandia+".00   costo Q"+fr.subsan+".00");
        System.out.println("Tomates: "+vr.tomates +" precio c/u Q"+vr.preciotomate+".00    costo Q"+vr.subtomates);
        System.out.println("Zanahorias: "+vr.zanahorias +" precio c/u Q"+vr.preciozanahorias+".00 costo Q"+vr.subzanahorias+".00");
        System.out.println("Elotes: "+vr.elotes +"  precio c/u Q"+vr.precioelotes+".00   costo Q"+vr.subelotes+".00");
        System.out.println("Cebollas: "+vr.cebollas +" precio c/u Q"+vr.preciocebollas+".00 costo Q"+vr.subcebollas);
        System.out.println("Papas: "+vr.papas +"   precio c/u Q"+vr.preciopapas+".00    costo Q"+vr.subpapas);
        System.out.println("Papel de banyo: "+ab.papel +"   precio c/u Q"+ab.preciopapel+".00    costo Q"+ab.subpapel+".00");
        System.out.println("Jabon de trastes: "+ab.jabon +"   precio c/u Q"+ab.preciojabon+".00    costo Q"+ab.subjabon+".00");
        System.out.println("Galletas: "+ab.galletas+" precio c/u Q"+ab.preciogalletas+".00 costo Q"+ab.subgalletas+".00");
        System.out.println("Arroz: "+ab.arroz +" precio c/u Q"+ab.precioarroz+".00 costo Q"+ab.subarroz+".00");
        System.out.println("Margarina: "+ab.margarina +" precio c/u Q"+ab.preciomargarina+".00 costo Q"+ab.submargarina+".00");
        System.out.println("Jamon: "+ab.jamon +" precio c/u Q"+ab.preciojamon+".00 costo Q"+ab.subjamon+".00");
        System.out.println("Queso: "+ab.queso +" precio c/u Q"+ab.precioqueso+".00 costo Q"+ab.subqueso+".00");
       
        total = fr.totalfrutas+vr.totalverduras+ab.totalabarrotes;
        cantproductos=fr.manzanas+fr.peras+fr.uvas+fr.bananos+fr.sandias+vr.tomates+vr.zanahorias+vr.cebollas+vr.papas+ab.papel+ab.galletas+ab.arroz+ab.margarina+ab.jamon+ab.queso;
    }
}
