/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientproject;
import circle.client.Circle;
import circle.client.CircleService;

public class ClientProject {

    
    public static void main(String[] args) {
        
        try { // Call Web Service Operation
            Circle port = new CircleService().getCirclePort();
            double r = 10.0;
            double result = port.area(r);
            System.out.println("Result = "+ result);
            } catch (Exception ex) {
 // TODO handle custom exceptions here
                }
        // TODO code application logic here
    }
    
}
