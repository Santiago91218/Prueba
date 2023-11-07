import java.util.ArrayList;
public class list {
    //Crear Array list
    ArrayList<String> miArrayList = new ArrayList<>();

    //Agregar elementos al ArrayList
        miArrayList.add("Elemento 1");

    // Eliminar el primer elemento con el valor "Elemento 2"
        miArrayList.remove("Elemento 1");

    //Acceder a elementos del ArrayList
        System.out.println("Elemento en la posición 0: " + miArrayList.get(0));


    // Iterar sobre el ArrayList
        for (String elemento : miArrayList) {
        System.out.println("Elemento: " + elemento);
    }


    // Obtener la longitud del ArrayList
    int longitud = miArrayList.size();

    // Opción 1: Usar el constructor para copiar
    ArrayList<String> arrayListCopia1 = new ArrayList<>(arrayListOriginal);

    // Opción 2: Usar el método addAll() para copiar
    ArrayList<String> arrayListCopia2 = new ArrayList<>();
        arrayListCopia2.addAll(arrayListOriginal);



    // Combinar los dos ArrayLists en uno solo
    ArrayList<Integer> combinedArrayList = new ArrayList<>(arrayList1); // Copia el primer ArrayList
        combinedArrayList.addAll(arrayList2);


    // Usar un HashSet para eliminar duplicados
    HashSet<String> uniqueSet = new HashSet<>(arrayList);

    // Crear un nuevo ArrayList sin duplicados
    ArrayList<String> arrayListSinDuplicados = new ArrayList<>(uniqueSet);




}
