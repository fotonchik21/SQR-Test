import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class MainTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void numberSquaresInRange(int minValue, int maxValue, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSquares(minValue, maxValue);
        Assertions.assertEquals(expected, actual);
    }
}
