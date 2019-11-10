public class prisionero{
    public String nombre;
    public double altura;
    public int sentencia;
    public void mensaje(){
	System.out.println("Palabras durante el arresto: \"Volveré en 3 horas, no menos 5\".");
	System.out.println("Nombre: " + nombre);
	System.out.println("Altura: " + altura);
	System.out.println("Sentencia: " + sentencia);
    }
}