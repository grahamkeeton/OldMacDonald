class NamedCow extends Cow
{
	protected String myName;


	public NamedCow(String type,String name,String sound) {
		myName=name;
	}

	public String getName(){
		return myName;
	}
}