import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Nossa destinada a fazer parte do jogo Beeworld.
 * 
 * @author Carlos henrique
 * @version (a version number or a date)
 */
public class Mosca extends Actor
{
    /**
     * Método Act é executado sempre que apertarmos o botão Act ou
     * ficará em execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (isAtEdge()) {
        turn(180);
        }
        
    }
}
