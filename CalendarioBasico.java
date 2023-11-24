
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 1;
        mes = 1;
        ano = 1;
    }
    
    public String obtenerFecha(){
        String saberDia = dia + "";
        String saberMes = mes + "";
        String saberAno = ano + "";

          if(dia < 10){
            saberDia = "0" + dia;
        }
        if(mes < 10){
            saberMes = "0" + mes;
        }
        if(ano < 10){
            saberAno = "0" + ano;
        }
        return saberDia + "-" + saberMes + "-" + saberAno;
    }
    
     public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
}
