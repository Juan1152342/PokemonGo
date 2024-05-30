
public class Pokemon
{
    String nombre;
    String tipo;
    
    public Pokemon()
    {
      
    }

    //metodos
    
    public void mostrarPokemon()
    {
      System.out.println ("El pokemos es:"+nombre + "Y es de tipo: " + tipo );
    }
    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad tipo*/
    public String getTipo(){
        return this.tipo;
    }//end method getTipo

    /**Metodo de modificación a la propiedad tipo*/
    public void setTipo(String tipo){
        this.tipo = tipo;
    }//end method setTipo

}