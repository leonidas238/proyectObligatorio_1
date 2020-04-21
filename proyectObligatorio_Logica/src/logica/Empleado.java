
package logica;


public class Empleado extends Persona {
    
    
    protected int tipo_empleado;
    protected int sueldo_base;

    public Empleado(int tipo_empleado, int sueldo_base, int cedula, String nombre, String apellidos, String direccion, int telefono) {
        super(cedula, nombre, apellidos, direccion, telefono);
        this.tipo_empleado = tipo_empleado;
        this.sueldo_base = sueldo_base;
    }

    
    
    
   @Override
    public String toString(){
        return " Cedula: " + Integer.toString(super.getCedula()) + 
                " Nombre: " + super.getNombre() +                
                " Apellido: " + super.getApellidos() +
                " Telefono: " + super.getTelefono() +
                " Direccion: " + super.getDireccion() +
                " Sueldo Base: " + Double.toString(this.sueldo_base) +
                " Tipo Empleado: " + Integer.toString(this.tipo_empleado);
    }

    public int getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(int tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }
    
    
    public double calcularSueldo(){
        return sueldo_base ;
    
    
    }
  
    
    
}




