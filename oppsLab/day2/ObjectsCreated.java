
class ObjectsCreated {
 static int noOfObjects = 0;


    
        
    
	
   
    public ObjectsCreated()
    {
	noOfObjects+= 1;
    }


    public static void main(String args[])
    {
        ObjectsCreated t1 = new ObjectsCreated();
        ObjectsCreated t2 = new ObjectsCreated();
        ObjectsCreated t3 = new ObjectsCreated();

        
        System.out.println(t1.noOfObjects);
    }
}