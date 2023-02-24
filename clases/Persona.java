package clases;
public class Persona {
    //Atributos de la clase
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    // Constructor
    public Persona(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    //Métodos
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}