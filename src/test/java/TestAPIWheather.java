import org.junit.Assert;
import org.junit.Test;


public class TestAPIWheather {

    ProveedorClima proveedorClima = new ProveedorClimaAccuWeather();

        @Test
        public void obtieneLaTemperaturaCorrecta() {
            Assert.assertEquals(13.8, proveedorClima.temperatura("Buenos Aires, Argentina"), 1);
        }

}