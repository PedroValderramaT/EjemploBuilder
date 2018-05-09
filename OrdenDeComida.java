import java.util.ArrayList;
import java.util.List;

public class OrdenDeComida {
   private List<Item> items = new ArrayList<Item>();	

   public void addItem(Item item){
      items.add(item);
   }

   public float getCost(){
      float costo = 0.0f;
      
      for (Item item : items) {
         costo += item.precio();
      }		
      return costo;
   }

   public void showItems(){
   
      for (Item item : items) {
         System.out.print("Item : " + item.nombre());
         System.out.print(", Packing : " + item.packing().pack());
         System.out.println(", Precio : " + item.precio());
      }		
   }	
}