class Hash{
	public static void main(String[] args){
		StringBuffer s =new StringBuffer("Scaler");
		StringBuffer n =new StringBuffer("Scaler");
		StringBuffer m =new StringBuffer("Neee");
		StringBuffer q =new StringBuffer("New");
		System.out.println(s.equals(n));
		System.out.println(n.hashCode());
		System.out.println(s.hashCode());
		System.out.println(m.hashCode());
		System.out.println(q.hashCode());
	}
}