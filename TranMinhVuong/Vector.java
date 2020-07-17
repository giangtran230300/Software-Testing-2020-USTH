public static Vector union (Vector a,Vector b)
{	
	int s = 0;
	Vector<Object> c = Vector (a.size()+b.size());
	for(int i = 0;i<a.size();i++){
	Object x = a.get(i);
	c.add(x);
	}
	for(int i = 0; i< b.size();i++){
	Object x = b.get(i);
	c.add(x);
	}
	for (int i = 0 ; i< a.size();i++){
	Object x = a.get(i);
	for (int j = 0;j< b.size();j++){
	Object y = b.get(i);
	if (x.equals(y)){
	for (int k = 0;k < c.size();k++){
	c.remove(y);
	}
	}
	}
	}
	return c;
}
// Fixed method


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