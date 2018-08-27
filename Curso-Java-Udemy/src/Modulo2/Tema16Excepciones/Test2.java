/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema16Excepciones;

/**
 *
 * @author pablo
 */
public class Test2 {
    public static void main(String[] args) throws OperatiobExcepcion{
        try {
            int op1=Integer.parseInt(args[0]);
            int op2=Integer.parseInt(args[1]);
            Division d = new Division(op1, op2);
            d.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Hubo un error al acceder un elemento fuera de rango");
            ex.printStackTrace();
        }catch(NumberFormatException nfe){
            System.err.println("Hubo un error, uno de los argumentos no es entero");
            nfe.printStackTrace();
            
        }catch(OperatiobExcepcion oe){
            System.err.println("Hubo un error, uno de los argumentos es 0");
            oe.printStackTrace();
            
        }finally{
            System.out.println("Se terminaron de revisar las exepciones");
            
        }
    }
}
