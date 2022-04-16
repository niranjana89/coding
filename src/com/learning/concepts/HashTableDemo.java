package com.learning.concepts;

public class HashTableDemo {
		
		class LL {
			private String key;
			private String value;
			private LL next;
			public LL(String key, String value, LL next) {
				this.key = key;
				this.value = value;
				this.next = next;
			}
		}
		
		private LL[] tbl;
		
		public HashTableDemo(){
			tbl = new LL[64]; 
		}
		public HashTableDemo(int size) {
			tbl = new LL[size];
		}
		
		public void put(String key, String value) {
			//compute hash and get the bucket
			int index = getHash(key);
			
			//check if LL is empty or not in the index
			System.out.println(index);
			LL list = tbl[index];
			LL a = new LL(key, value, null);
			if(list == null) {
				tbl[index] = a;
			}
			else{
				LL temp = null;
				while(list!= null){
					temp = list;
					System.out.println(temp.key + "---"+ temp.value);
					list = list.next;
				}
				temp.next = a;
			}
		}
		
		public String lookup(String key)  {
			int index = getHash(key);
			LL list = tbl[index];
			if(list == null){
				return null;
			}
			else{
				while(list!= null){
					if(list.key.equals(key)){
						return list.value;
					}
					list = list.next;
				}
				return null;
			}
		}
		
		
		public int getHash(Object key) {
			return Math.abs(key.hashCode()) % tbl.length;
		}
		

	public static void main(String[] args) {
		
		HashTableDemo demo = new HashTableDemo(5);
		demo.put("hello","how are you");
		demo.put("lhelo","how  you");
		demo.put("lheol","how  ");
		System.out.println(demo.lookup("lhelo"));

	}

}
