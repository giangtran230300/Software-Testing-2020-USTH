/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestinghomework;
import java.util.*; 

/**
 *
 * @author oOo
 */
public class VectorUnion {
   public static Vector UnionAll (Vector a,Vector b)
{	
	int s = 0;
	
	Vector c = new Vector(a.size()+b.size());
	for(int i = 0;i<a.size();i++){
	Object x = a.get(i);
	c.add(x);
	}
	for(int i = 0; i< b.size();i++){
	Object x = b.get(i);
	c.add(x);
	}
	return c;
}
}
