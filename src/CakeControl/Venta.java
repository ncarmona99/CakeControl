package CakeControl;

import java.time.LocalDate;

/**
 *
 * @author Nicolás
 */
public class Venta {
    private static long codVenta;
    private static LocalDate fecVenta;
    private static long totalVenta;
    private static Socio socio;

    public Venta() {
    }

    public Venta(long codVenta, LocalDate fecVenta, long totalVenta, Socio socio) {
        Venta.codVenta = codVenta;
        Venta.fecVenta = fecVenta;
        Venta.totalVenta = totalVenta;
        Venta.socio = socio;
    }

    public long getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(long codVenta) {
        Venta.codVenta = codVenta;
    }

    public LocalDate getFecVenta() {
        return fecVenta;
    }

    public void setFecVenta(LocalDate fecVenta) {
        Venta.fecVenta = fecVenta;
    }

    public long getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(long totalVenta) {
        Venta.totalVenta = totalVenta;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        Venta.socio = socio;
    }

    @Override
    public String toString() {
        return "Venta{" + "codVenta=" + codVenta + ", fecVenta=" + fecVenta + ", totalVenta=" + totalVenta + ", socio=" + socio + '}';
    }
    
    
}
