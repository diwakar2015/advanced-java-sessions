package collections;

public class SSN{

	private String ssnId;
	private String name;
	private int age;
	
	public String getSsnId() {
		return ssnId;
	}
	public void setSsnId(String ssnId) {
		this.ssnId = ssnId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode()
	{
		System.out.println("Hashcode(): I am called with object "+ this);
		int prime = 37;
		int hashCode = this.ssnId.length() * prime;
		System.out.println("HashCOde generated : "+ hashCode);
		return hashCode;
			
	}
	
	
	@Override
	 public boolean equals(Object obj) {
		
		SSN ssn = (SSN)obj;
		
		System.out.println("equals() : I am called with value "+ this);
		
		if(this.ssnId.equals(ssn.ssnId))
		{
			System.out.println("SSN Id are same...so returing true");
			return true;
		}
		else
		{
			System.out.println("SSN ID is not same, returing false");
			return false;
		}
		
	}
	
	
	
	@Override
	public String toString() {

		return "SSN-Id : "+ ssnId + " Name: "+ name +  " Age : "+ age;
	}

}
