package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    @Test
    public void test1() {
        FizzBuzz fb = new FizzBuzz();
        String resultat  = fb.de( 1);
        assertEquals("1",resultat, "fonction doit retourner 1");
    }
    @Test
    public void testFizz() {
        FizzBuzz fb = new FizzBuzz();
        String resultat  = fb.de( 3);
        assertEquals("Fizz",resultat, "fonction doit retourner Fizz");
    }
    @Test
    public void testBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String resultat  = fb.de( 5);
        assertEquals("Buzz",resultat, "fonction doit retourner Buzz");
    }
    @Test
    public void testFizzBuzz(){
        FizzBuzz fb = new FizzBuzz();
        String resultat  = fb.de( 15);
        assertEquals("FizzBuzz",resultat, "fonction doit retourner FizzBuzz");
    }
}