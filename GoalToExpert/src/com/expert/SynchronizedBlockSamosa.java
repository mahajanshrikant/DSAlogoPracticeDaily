package com.expert;

public class SynchronizedBlockSamosa {
 
	private static  SynchronizedBlockSamosa syncBlocksamosa;

	   private SynchronizedBlockSamosa() {
			
		}
	   
	   public static SynchronizedBlockSamosa getSamosa() {
			
			if(syncBlocksamosa==null) {
				//are Raju abhi itna  he block of code synchronized hai ree baba..
				
				//are baba abhi synchronized block security guard hai
				synchronized(SynchronizedBlockSamosa.class) {
					syncBlocksamosa=new SynchronizedBlockSamosa();
				}
				
			}
			
			return syncBlocksamosa;
		}
}
