# Strategy
[Referencia](https://www.youtube.com/watch?v=GyT2IWgUILU)
## Pasos
1. Definir la Interfaz Strategy
    1. Define una interfaz común para todos los algoritmos.
    ```
    public interface FilterStrategy {
        void apply(String imageName);
    }
    ```
2. Crear estrategias concretas
    1. Implementa diferentes estrategias que cumplen con la interfaz.
    ```
    public class BlackAndWhiteFilter implements FilterStrategy {
        public void apply(String imageName) {
            System.out.println("Applying Black and White filter to " + imageName);
        }
    }

    public class SepiaFilter implements FilterStrategy {
        public void apply(String imageName) {
            System.out.println("Applying Sepia filter to " + imageName);
        }
    }

    // Más estrategias de filtrado...
    ```
3. Contexto para Utilizar las Estrategias:
    1. Crea una clase que utilice la estrategia. Esta clase recibirá cualquier implementación de la interfaz y la utilizará.
    ```
    public class ImageProcessor {
        private FilterStrategy strategy;

        public ImageProcessor(FilterStrategy strategy) {
            this.strategy = strategy;
        }

        public void setFilterStrategy(FilterStrategy strategy) {
            this.strategy = strategy;
        }

        public void applyFilter(String imageName) {
            strategy.apply(imageName);
        }
    }
    ```
### Ejemplo de uso
```
public class Main {
    public static void main(String[] args) {
        ImageProcessor processor = new ImageProcessor(new BlackAndWhiteFilter());
        processor.applyFilter("foto.jpg"); // Aplica filtro en blanco y negro

        // Cambiando a otro filtro sin modificar la clase ImageProcessor
        processor.setFilterStrategy(new SepiaFilter());
        processor.applyFilter("foto.jpg"); // Aplica filtro sepia
    }
}
```