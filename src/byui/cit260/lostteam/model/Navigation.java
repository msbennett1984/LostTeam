/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.model;

import java.io.Serializable;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public enum Navigation implements Serializable{
    
    Continue,
    ExitGame,
    ExitView,
    WrongAnswer,
    WonGame,
    LostGame;

}
