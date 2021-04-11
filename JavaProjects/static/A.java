public class A {
    	  //static member
	  public static int staticCount = 0;

	  //instance member
	  public int instanceCount = 0;
	  
	  //no-arg constructor to update both values by one
	  public A() {
		    staticCount++;
		    this.instanceCount++;
		  }
	  
	  //Getters and Setters
	  //methods that manipulate staticCount, have the keyword static applied to them
	  
	  	  public static int getStaticCount() {
		    return A.staticCount;
		  }

		  public static void setStaticCount(int staticCount) {
			  //when setting the staticCount variable, we don't use the keyword this
			  //we use the class name as a qualifier
		    A.staticCount = staticCount;
		  }

		  public int getInstanceCount() {
		    return this.instanceCount;
		  }

		  public void setInstanceCount(int instanceCount) {
		    this.instanceCount = instanceCount;
		  }
}
