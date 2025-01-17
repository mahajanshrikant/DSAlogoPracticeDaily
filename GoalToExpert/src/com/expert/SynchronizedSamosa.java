package com.expert;

public class SynchronizedSamosa {
	
	private static  SynchronizedSamosa syncsamosa;

   private SynchronizedSamosa() {
		
	}
   
   //aree raju but hai to object wali line synchronized kaini hai re why we doing entire method synchronixed ?
   //kuch to galat hai rai ?/
   //aree bhai why we using method synchronization..
   //aree go with synchronized block
   public static SynchronizedSamosa getSamosa() {
	
		if(syncsamosa==null) {
			syncsamosa=new SynchronizedSamosa();
		}
		
		return syncsamosa;
	}
}
