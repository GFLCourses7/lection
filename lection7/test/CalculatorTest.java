package test;

import org.junit.jupiter.api.Test;
import service.Calculator;
import service.MathUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        // Створюємо мок MathUtils
        MathUtils mathUtils = mock(MathUtils.class);

        // Встановлюємо поведінку мока для методу add
        when(mathUtils.add(1, 2)).thenReturn(3);

        // Створюємо об'єкт Calculator з моком mathUtils
        Calculator calculator = new Calculator(mathUtils);

        // Викликаємо метод calculate() для перевірки, чи правильно він викликає метод add() у mathUtils
        assertEquals(3, calculator.calculate(1, 2, '+'));

        // Перевіряємо, чи метод add був викликаний з параметрами 1 та 2
        verify(mathUtils).add(1, 2);
    }
}