package personne;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PersonneTest {
    @Test
    public void testtournerunefois() {
        Personne per= new Personne();
        String place  = per.tourner( 1);
        assertEquals("est",place, "orientation doit etre est");
    }
    @Test
    public void testtournerdeuxfois() {
        Personne per= new Personne();
        String place  = per.tourner( 2);
        assertEquals("sud",place, "orientation doit etre sud");
    }
    @Test
    public void testtournertroisfois() {
        Personne per= new Personne();
        String place  = per.tourner( 3);
        assertEquals("ouest",place, "orientation doit etre ouest");
    }
    @Test
    public void testtournerquatrefois() {
        Personne per= new Personne();
        String place  = per.tourner( 4);
        assertEquals("nord",place, "orientation doit etre nord");
    }

    @Test
    public void testtournercinqfois() {
        Personne per= new Personne();
        String place  = per.tourner( 5);
        assertEquals("est",place, "orientation doit etre est");
    }
}
