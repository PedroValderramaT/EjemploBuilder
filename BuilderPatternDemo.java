public class BuilderPatternDemo {
   public static void main(String[] args) {
   
      GenerarOrden mealBuilder = new GenerarOrden();

      OrdenDeComida vegMeal = mealBuilder.vegetariana();
      System.out.println("Orden Vegetariana");
      vegMeal.showItems();
      System.out.println("Costo Total: " + vegMeal.getCost());

      OrdenDeComida nonVegMeal = mealBuilder.noVegetariana();
      System.out.println("\n\nOrden no vegetariana");
      nonVegMeal.showItems();
      System.out.println("Costo Total: " + nonVegMeal.getCost());
   }
}