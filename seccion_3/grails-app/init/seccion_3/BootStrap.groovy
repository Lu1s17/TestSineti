package seccion_3
import com.sineti.Ship

class BootStrap {

    def init = { servletContext ->
    	3.times {index ->
    		Ship ship = new Ship(nombre: "Ship ${index}", capacidad: 100, nacionalidad: "MX")
    		ship.save()
    	}
    }
    def destroy = {
    }
}
