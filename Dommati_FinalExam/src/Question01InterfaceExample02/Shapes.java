/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01InterfaceExample02;

import Question01InterfaceExample02.Lines.Line;

/**
 *
 * @author DhanushaDommati
 */
public class Shapes  implements Line, Polygon{
@Override
public void getlength() {
System.out.println(" In shapes get length");}
public void getArea() {
System.out.println("In Shapes get Area"); }
}
    


