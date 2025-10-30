import java.util.List;
public class ejemploEnfoqueImperativo {
    public static void main(String args[]) {
        List<Integer> numeros = List.of(11, 8, 9, 15, 39, 1, 4, 83);
        //Imperativo
        Long contador = numeros.stream().filter(num -> num > 10).count();
        System.out.println("Cantidad de numeros mayores a 10: " + contador);
    }
}