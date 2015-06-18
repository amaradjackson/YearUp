
public class Main extends Work
{

	public static void main(String[] args) 
	{
		Doctor Tim = new Doctor();
		Tim.MyJob();
		Tim.DoWork();
		System.out.println(".....");
		
		Doctor Carl = new Surgeon();
		Carl.MyJob();
		Carl.DoWork();
		System.out.println(".....");
		
		Lawyer Cam = new Lawyer();
		Cam.MyJob();
		Cam.DoWork();
		System.out.println(".....");
		
		WebDeveloper John = new WebDeveloper();
		John.MyJob();
		John.DoWork();
		System.out.println(".....");
		
		Programmer Mia = new Programmer();
		Mia.MyJob();
		Mia.DoWork();
		System.out.println(".....");
		
		//polymorphism
		//daniel is a surgeon
		Surgeon Daniel = new Surgeon();
		Daniel.MyJob();
		Daniel.DoWork();
		System.out.println("..Polymorphism..");
				
		//even though it says doctor, daniel is still a surgeon here
		Doctor House = Daniel;
		House.MyJob();
		House.DoWork();
		System.out.println("..Polymorphism..");
				
		//house now becomes a doctor
		House = new Doctor();
		House.MyJob();
		House.DoWork();
		System.out.println("..polymorphism..");

	}

}
