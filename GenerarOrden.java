public class GenerarOrden {

	   public OrdenDeComida vegetariana (){
		  OrdenDeComida orden = new OrdenDeComida();
	      orden.addItem(new HamburguesaVegetariana());
	      orden.addItem(new Gaseosa());
	      return orden;
	   }   

	   public OrdenDeComida noVegetariana (){
		   OrdenDeComida orden = new OrdenDeComida();
	      orden.addItem(new HamburguesaPollo());
	      orden.addItem(new Cerveza());
	      return orden;
	   }
	}