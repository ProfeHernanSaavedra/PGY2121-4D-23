
package Unidad2.Herencia.Ejercicio1;

/**
 *
 * @author 
 */
public class Musica extends Interes implements ILikeTiempo{
    
    private String tipoMusica;

    public Musica() {
        super();
    }

    public Musica(String tipoMusica, String usuario, String password, int tiempoConectado, int likes) {
        super(usuario, password, tiempoConectado, likes);
        this.tipoMusica = tipoMusica;
    }

    

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return "Musica{" + "tipoMusica=" + tipoMusica + '}' + " " + super.toString();
    }
    
    public void listarMusica()
    {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Tiempo Conectado : " + super.getTiempoConectado());
        System.out.println("Tipo Musica: " + this.getTipoMusica());
    }

    @Override
    public String visualizar() {
        return super.getUsuario() + " " + this.getTipoMusica();
    }

    @Override
    public int likes() {
        
        return super.getLikes() + super.getTiempoConectado();
        
    }

   
}
