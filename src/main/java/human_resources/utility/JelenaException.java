/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.utility;

/**
 *
 * @author Jelena
 */
public class JelenaException extends Exception {

    private String message;

    public JelenaException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
