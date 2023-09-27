
package Unidad2.Herencia.Ejercicio1;

/**
 *
 * @author 
 */
public class Television extends Interes implements ILikeTiempo{
    
    private String generoTv;

    public Television() {
        super();
    }

    public Television(String generoTv, String usuario, String password, int tiempoConectado, int likes) {
        super(usuario, password, tiempoConectado, likes);
        this.generoTv = generoTv;
    }


    public String getGeneroTv() {
        return generoTv;
    }

    public void setGeneroTv(String generoTv) {
        this.generoTv = generoTv;
    }

    @Override
    public String toString() {
        return "Television{" + "generoTv=" + generoTv + '}' + " " + super.toString();
    }

    @Override
    public String visualizar() {
        return super.getUsuario() + " " + this.getGeneroTv();
    }

   @Override
    public int likes() {
        
        return super.getLikes() + super.getTiempoConectado();
        
    }
    
    
}
