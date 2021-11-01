/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosRepositorio;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import juegosModelo.Game;
import juegosInterface.InterfaceGame;

/**
 *
 * @author USUARIO
 */
@Repository
public class GameRepositorio {
      @Autowired
    private InterfaceGame crud;
    

    public List<Game> getAll(){
        return (List<Game>) crud.findAll();       
    }
    
    public Optional <Game> getGame(int id){
        return crud.findById(id);
    }
    
    public Game save(Game game){
        return crud.save(game);
    }
     public void delete(Game game){
        crud.delete(game);
    }
    
}
