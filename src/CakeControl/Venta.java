package CakeControl;

import java.time.LocalDate;

/**
 *
 * @author Nicolás
 */
public class Venta {
    private long codVenta;
    private LocalDate fecVenta;
    private long totalVenta;
    private Socio socio;

    public Venta() {
    }

    public Venta(long codVenta, LocalDate fecVenta, long totalVenta, Socio socio) {
        this.codVenta = codVenta;
        this.fecVenta = fecVenta;
        this.totalVenta = totalVenta;
        this.socio = socio;
    }

    public long getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(long codVenta) {
        this.codVenta = codVenta;
    }

    public LocalDate getFecVenta() {
        return fecVenta;
    }

    public void setFecVenta(LocalDate fecVenta) {
        this.fecVenta = fecVenta;
    }

    public long getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(long totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Venta{" + "codVenta=" + codVenta + ", fecVenta=" + fecVenta + ", totalVenta=" + totalVenta + ", socio=" + socio + '}';
    }
    
    
}
