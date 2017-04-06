/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
2.) While tracking this organization, your team has found that, this
organization was started with an odd number of members. Each member
has to recruit a new member after one month of joining to the terrorist
group. That means, the number of members of this organization will be
doubled in each month. As the programmer of this team, you are assigned
to write a program to find,
 * The initial number of members in this organization and
 * The number of months this organization has been running when the
current amount of members is given as a command line argument.
*/
class OriginOfOrganization{
	public static void main(String args[]){
		if(args.length != 0 ){
			int currentMembers = Integer.parseInt(args[0]);
			int monthsGone = 0; 
			while(currentMembers % 2 == 0){// if currentMember % 2 == 1 ie current no.of Members is odd, and since on all other instances current members double, it's only possible to have an odd number of members at the origin of the organization 
				monthsGone += 1;
				currentMembers = currentMembers/2;
			}
			System.out.println("Initial number of Members : " + currentMembers);
			System.out.println("Number of months organization has been running : "  +monthsGone);
		}
		else{
			System.out.println("Please enter argument as : ");
			System.out.println("java OriginOfOrganization [no of members]");
		}
	}
}