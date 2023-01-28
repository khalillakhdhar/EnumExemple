package listing;
enum grade
{
admin,
user,
employee
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Personne p=new Personne("Sami", "Ali", "Sfax", Gender.Homme);
//System.out.println(p.toString());
for (Gender g:Gender.values())
{
System.out.println(g);	
}
	}

}
