import java.util.HashMap;

public class ProveedorClimaAccuWeather implements ProveedorClima{

    AccuWeatherAPI api = new AccuWeatherAPI();

    @Override
    public double temperatura(String ciudad) {
        HashMap<String, Object> datos = (HashMap<String, Object>) api.getWeather(ciudad).get(0).get("Temperature");
        int temperatura = (int) datos.get("Value");
        return (temperatura - 32) * 5 / 9;
    }


    @Override
    public double probabilidadaPrecipitaciones(String ciudad) {
        return (double) api.getWeather(ciudad).get(0).get("PrecipitationProbability");
    }
}
