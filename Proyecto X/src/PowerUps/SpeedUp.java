package PowerUps;

import Graficos.SpeedUpGrafico;
import Nivel.Celda;
import Personajes.Bomberman;

/**
 * Clase que representa el power up Speed Up.
 * @author Tom�s Perotti - Iv�n Petrini.
 *
 */
public class SpeedUp extends PowerUp {

	/**
	 * Constructor del Power Up SpeedUp que setea su posicion.
	 * @param Celda
	 */
	public SpeedUp(Celda c){
		grafico = new SpeedUpGrafico(c.getX(), c.getY());
		c.setPowerUp(this);
	}
	
	/**
	 * M�todo que activa el Power Up.
	 * @param bomberman
	 */
	public void activar(Bomberman b) {
		b.velocidad2X();
		System.out.println("Agarr� Power Up - Speed Up");
		grafico.desaparecer();
	}
	

}
