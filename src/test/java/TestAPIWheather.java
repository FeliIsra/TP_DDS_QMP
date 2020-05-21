import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class TestAPIWheather {

    TiempoAPI apiClima = new AccuWeatherAPI();



    AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();

    @Test
    public void obtieneLaTemperaturaCorrecta(){
        Assert.assertEquals(13.8,accuWeatherAPI.temperatura("Buenos Aires, Argentina"),1);
    }
}