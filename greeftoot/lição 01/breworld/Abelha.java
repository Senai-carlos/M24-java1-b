import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizado no jogo Beeworld.
 * 
 * @author Carlos henrique
 * @version 20-04-2024
 */
public class Abelha extends Actor
{
    /**
     * Método que será executando quando o botão Act ou Run.
     * 
     */
    public void act()
    {

        move(1);
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(10);           
        }
        }
}
