
package Unidad2.Herencia.Ejercicio1;

/**
 *
 * @author 
 */
public class RedSocial extends Interes implements ILikeTiempo{
    
    private String nombreRedSocial;

    public RedSocial() {
        super();
    }

    public RedSocial(String nombreRedSocial, String usuario, String password, int tiempoConectado, int likes) {
        super(usuario, password, tiempoConectado, likes);
        this.nombreRedSocial = nombreRedSocial;
    }

    

    public String getNombreRedSocial() {
        return nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombreRedSocial=" + nombreRedSocial + '}' + " " + super.toString();
    }

    @Override
    public String visualizar() {
        return super.getUsuario() + " " + this.getNombreRedSocial();
    }

    @Override
    public int likes() {
        
        return super.getLikes() + super.getTiempoConectado();
        
    }
    
    
    
}
