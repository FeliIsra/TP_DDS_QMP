import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class TestAPIWheather {

    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");



    // Probando si anda la clase AccuWeatherAPI
    @Test
    public void testeandoAndo(){

        System.out.println(condicionesClimaticas.get(0));
    }
}