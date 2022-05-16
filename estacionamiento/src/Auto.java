public class Auto {
     static final String FORD = "Ford";
     static final String CHEVROLET = "Chevrolet";
     static final String BMW = "BMW";
     static final String SUBARU = "Subaru";
     static final String VOLKSWAGEN = "Volkswagen";
     static final String AUDI = "Audi";
     
     private String matricula;
     private Persona persona;
     private String modelo;
 
    public Auto(String modelo, String matricula, Persona persona) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.persona = persona;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
