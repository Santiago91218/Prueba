public class Clases {


    // Atributos de la clase
     String nombre;
    private int edad;

    // Constructor de la clase
    public MiClase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }




    public static void main(String[] args) {
        // Crear un objeto de la clase
        MiClase miObjeto = new MiClase("Juan", 30);

        // Llamar a los métodos del objeto
        miObjeto.saludar();
        miObjeto.cumplirAnios();
        miObjeto.saludar();
    }


}
