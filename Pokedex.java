

public class Pokedex
{
   String entrenador;
   //variables del mundo
   static int agua;
   static int fuego;
   static int dragon;
   static int planta;
   static int electrico;
   static int roca;
   static int volador;
   //variables para entrenador
   private int aguas;
   private int fuegos;
   private int dragons;
   private int plantas;
   private int electricos;
   private int rocas;
   private int voladors;
   static int entrena;
  
    public Pokedex()
    {
       entrena++;
    }

   public void capturaPokemon(Pokemon P)
    {
    if (P.tipo=="agua") {
        agua++;
        aguas++;
    } else if (P.tipo=="fuego") {
        fuego++;
        fuegos++;
    } else if (P.tipo=="dragon") {
        dragon++;
        dragons++;
    } else if (P.tipo=="planta") {
        planta++;
        plantas++;
    } else if (P.tipo=="electrico") {  
        electrico++;
        electricos++;
    } else if (P.tipo=="roca") {
        roca++;
        rocas++;
    } else if (P.tipo=="volador"){
        volador++;
        voladors++;
    }
    }
  
   public void liberarPokemon(Pokemon P)
    {
      if (P.tipo=="agua") {
        aguas--;
            } else if (P.tipo=="fuego") {
        fuegos--;
    } else if (P.tipo=="dragon") {
        dragons--;
    } else if (P.tipo=="planta") {
        plantas--;
    } else if (P.tipo=="electrico") {  
        electricos--;
    } else if (P.tipo=="roca") {
        rocas++;
    } else if (P.tipo=="volador"){
        voladors--;
    }
    }
   
    public void intercambiarPokemon(Pokemon Pnuevo, Pokemon Pantiguo)
    {
    this.capturaPokemon(Pnuevo);
    this.liberarPokemon(Pantiguo);
    
    }
    
    public void reiniciarPokedex()
    {
        aguas=0;
        fuegos=0;
        dragons=0;
        plantas=0;
        electricos=0;
        rocas=0;
        voladors=0;
        
    }
   
    public void mostrarPokedex()
    {
        System.out.println ("Pokemones de aguas: " +aguas);
        System.out.println ("Pokemones de fuegos: " +fuegos);
        System.out.println ("Pokemones de dragons: " +dragons);
        System.out.println ("Pokemones de plantas: " +plantas);
        System.out.println ("Pokemones de electricos: " +electricos);
        System.out.println ("Pokemones de rocas: " +rocas);
        System.out.println ("Pokemones de voladores: " +voladors);
    }
   
    public double mediaPokemon()
    {
      return (agua+fuego+dragon+planta+electrico+roca+volador)/entrena;
    }
   
    /**Metodo de acceso a la propiedad entrenador*/
    public String getEntrenador(){
        return this.entrenador;
    }//end method getEntrenador

    /**Metodo de modificación a la propiedad entrenador*/
    public void setEntrenador(String entrenador){
        this.entrenador = entrenador;
    }//end method setEntrenador

    /**Metodo de acceso a la propiedad agua*/
    public int getAgua(){
        return this.agua;
    }//end method getAgua

    /**Metodo de modificación a la propiedad agua*/
    public void setAgua(int agua){
        this.agua = agua;
    }//end method setAgua

    /**Metodo de acceso a la propiedad fuego*/
    public int getFuego(){
        return this.fuego;
    }//end method getFuego

    /**Metodo de modificación a la propiedad fuego*/
    public void setFuego(int fuego){
        this.fuego = fuego;
    }//end method setFuego

    /**Metodo de acceso a la propiedad dragon*/
    public int getDragon(){
        return this.dragon;
    }//end method getDragon

    /**Metodo de modificación a la propiedad dragon*/
    public void setDragon(int dragon){
        this.dragon = dragon;
    }//end method setDragon

    /**Metodo de acceso a la propiedad planta*/
    public int getPlanta(){
        return this.planta;
    }//end method getPlanta

    /**Metodo de modificación a la propiedad planta*/
    public void setPlanta(int planta){
        this.planta = planta;
    }//end method setPlanta

    /**Metodo de acceso a la propiedad electrico*/
    public int getElectrico(){
        return this.electrico;
    }//end method getElectrico

    /**Metodo de modificación a la propiedad electrico*/
    public void setElectrico(int electrico){
        this.electrico = electrico;
    }//end method setElectrico

    /**Metodo de acceso a la propiedad roca*/
    public int getRoca(){
        return this.roca;
    }//end method getRoca

    /**Metodo de modificación a la propiedad roca*/
    public void setRoca(int roca){
        this.roca = roca;
    }//end method setRoca

    /**Metodo de acceso a la propiedad volador*/
    public int getVolador(){
        return this.volador;
    }//end method getVolador

    /**Metodo de modificación a la propiedad volador*/
    public void setVolador(int volador){
        this.volador = volador;
    }//end method setVolador

    /**Metodo de acceso a la propiedad aguas*/
    public int getAguas(){
        return this.aguas;
    }//end method getAguas

    /**Metodo de modificación a la propiedad aguas*/
    public void setAguas(int aguas){
        this.aguas = aguas;
    }//end method setAguas

    /**Metodo de acceso a la propiedad fuegos*/
    public int getFuegos(){
        return this.fuegos;
    }//end method getFuegos

    /**Metodo de modificación a la propiedad fuegos*/
    public void setFuegos(int fuegos){
        this.fuegos = fuegos;
    }//end method setFuegos

    /**Metodo de acceso a la propiedad dragons*/
    public int getDragons(){
        return this.dragons;
    }//end method getDragons

    /**Metodo de modificación a la propiedad dragons*/
    public void setDragons(int dragons){
        this.dragons = dragons;
    }//end method setDragons

    /**Metodo de acceso a la propiedad plantas*/
    public int getPlantas(){
        return this.plantas;
    }//end method getPlantas

    /**Metodo de modificación a la propiedad plantas*/
    public void setPlantas(int plantas){
        this.plantas = plantas;
    }//end method setPlantas

    /**Metodo de acceso a la propiedad electricos*/
    public int getElectricos(){
        return this.electricos;
    }//end method getElectricos

    /**Metodo de modificación a la propiedad electricos*/
    public void setElectricos(int electricos){
        this.electricos = electricos;
    }//end method setElectricos

    /**Metodo de acceso a la propiedad rocas*/
    public int getRocas(){
        return this.rocas;
    }//end method getRocas

    /**Metodo de modificación a la propiedad rocas*/
    public void setRocas(int rocas){
        this.rocas = rocas;
    }//end method setRocas

    /**Metodo de acceso a la propiedad voladors*/
    public int getVoladors(){
        return this.voladors;
    }//end method getVoladors

    /**Metodo de modificación a la propiedad voladors*/
    public void setVoladors(int voladors){
        this.voladors = voladors;
    }//end method setVoladors

    /**Metodo de acceso a la propiedad entrena*/
    public int getEntrena(){
        return this.entrena;
    }//end method getEntrena

    /**Metodo de modificación a la propiedad entrena*/
    public void setEntrena(int entrena){
        this.entrena = entrena;
    }//end method setEntrena

}