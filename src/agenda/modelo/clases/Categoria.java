
package agenda.modelo.clases;


public enum Categoria {
    
    TODOS("Todos","Todos"), OTROS(null,"Otros"),
    AMIGO("Amigo","Amigos"), FAMILIAR("Familiar","Familiares"),
    COMP_TRABAJO("Compañero de trabajo","Compañeros de trabajo"),
    COMP_FACU("Compañero de facultad","Compañeros de facultad"),
    ELIMINADOS("Eliminados", "Eliminados");
	
    private String singular;
    private String plural;
	
    Categoria(String s, String p){
            this.singular = s;
            this.plural = p;
    }

    public String getSingular() {
        return singular;
    }

    public String getPlural() {
        return plural;
    }

    @Override
    public String toString() {
        return this.plural;
    }
}
