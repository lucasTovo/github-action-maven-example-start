import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
  public TestCalculadora(){

  }
  Calculadora calculadora = new Calculadora();

  @Test
  @DisplayName("Soma de 2 numeros inteiros positivos")
  void somaInteirosPositivos(){
    int result = calculadora.somar(5, 5);
    assertEquals( 10, result);
  }

  @Test
  @DisplayName("Soma de 2 numeros inteiros negativos")
  void somaInteirosNegativos(){
    int result = calculadora.somar(-5, -5);
    assertEquals( -10, result);
  }

  @Test
  @DisplayName("Subtração de 2 numeros inteiros positivos")
  void subtraçãoInteirosPositivos(){
    int result = calculadora.subtrair(5, 5);
    assertEquals( 0, result);
  }

  @Test
  @DisplayName("Subtração de 2 numeros inteiros negativos")
  void subtraçãoInteirosNegativos(){
    int result = calculadora.subtrair(-5, -5);
    assertEquals( 0, result);
  }

  @Test
  @DisplayName("Multiplicação de 2 numeros inteiros positivos")
  void multiplicaInteirosPositivos(){
    int result = calculadora.multiplicar(5, 5);
    assertEquals( 25, result);
  }

  @Test
  @DisplayName("Multiplicação de 2 numeros inteiros negativos")
  void multiplicaInteirosNegativos(){
    int result = calculadora.multiplicar(-5, -5);
    assertEquals( 25, result);
  }

  @Test
  @DisplayName("Divisão de 2 numeros inteiros positivos")
  void divisãoInteirosPositivos(){
    int result = calculadora.dividir(5, 5);
    assertEquals( 1, result);
  }

  @Test
  @DisplayName("Divisão de 2 numeros inteiros negativos")
  void divisãoInteirosNegativos(){
    int result = calculadora.dividir(-5, -5);
    assertEquals( 1, result);
  }

  @Test
  @DisplayName("Soma e multiplica")
  void somaEMultiplica(){
    int somaResult = calculadora.somar(6, 6);
    int result = calculadora.multiplicar(somaResult, 6);
    assertEquals( 72, result);
  }
}
