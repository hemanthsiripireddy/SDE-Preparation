package officeManagementPortal.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

import officeManagementPortal.pojos.Manager;
import officeManagementPortal.pojos.TeamMate;
//import officeManagementPortal.pojos.TeamMate;

public class OfficeManagementPortal {
	static List<Manager> managers;
	static List<TeamMate> teamMates;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iterator
		Scanner sc = new Scanner(System.in);
		// Manager[] managers=new Manager[5];
		managers = new ArrayList<>();
		teamMates = new ArrayList<>();
		Set<TeamMate> benchEmployees = new HashSet<>();

		int c;
		do {
			System.out.println("Enter your choice:1 for manager, 2 for teammate ");
			c = sc.nextInt();
			if (c == 1) {

				System.out.println("to take input of details for manager :enter 1");
				System.out.println(" to display details of particular manager enter 2");
				System.out.println("to display details of team mates of particular manager enter 3");
				System.out.println("to add an employee to your name who are not in any team, enter 4");
				int ch = sc.nextInt();
				switch (ch) {

				case 1:
					System.out.println("Enter Manager ID");
					int id = sc.nextInt();
					System.out.println("Enter Manager Name");
					String name = sc.next();
					System.out.println("Enter Manager Department");
					String department = sc.next();
					System.out.println("Enter Manager TeamName");
					String teamName = sc.next();
					managers.add(new Manager(id, name, department, teamName));
					break;
				case 2:
					System.out.println("Select any Manager availble below");
					showManagetIDs();
					int mID = sc.nextInt();
					System.out.println("Manager Details: ");
					getManager(mID).displayDetails();
					break;
				case 3:
					System.out.println("Select any Manager availble below");
					showManagetIDs();
					mID = sc.nextInt();
					System.out.println("team Mates Details: ");
					getManager(mID).displayDetailsOfTeamMates();
					break;
				case 4:
					System.out.println("Select any Manager availble below");
					showManagetIDs();
					mID = sc.nextInt();
					System.out.println("select any employee below to add to you team");

					Iterator<TeamMate> it = benchEmployees.iterator();
					while (it.hasNext()) {
						System.out.println(it.next().getId());
					}
					int eID = sc.nextInt();
					getManager(mID).addTeamMember(getTeamMate(eID));
					benchEmployees.remove(getTeamMate(eID));
					System.out.println("Added employee to your team successfully");

				}

			} else {
				System.out.println("to take input of details for teammate :enter 1");
				System.out.println(" to display details of particular teammate enter 2");
				// System.out.println("to display details of team mates of particular manager
				// enter 3");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter ID of Employee");
					int id = sc.nextInt();
					System.out.println("Enter Name of Employee");
					String name = sc.next();
				
					TeamMate t=new TeamMate(id, name);
					teamMates.add(t);
					benchEmployees.add(t);
					break;
				case 2:
					System.out.println("enter any available EmployeeID shown below : ");
					showTeamMateIDs();
					int eID = sc.nextInt();
					System.out.println("Employee details are: ");
					getTeamMate(eID).displayDetails();
					break;

				}

			}
		} while (c != 3);

	}

	private static Manager getManager(int mID) {
		for (int i = 0; i < managers.size(); i++) {
			if (managers.get(i).getId() == mID) {
				return managers.get(i);
			}
		}
		return null;
	}

	private static TeamMate getTeamMate(int eID) {
		for (int i = 0; i < teamMates.size(); i++) {
			if (teamMates.get(i).getId() == eID) {
				return teamMates.get(i);
			}
		}
		return null;
	}

	private static void showManagetIDs() {
		for (int i = 0; i < managers.size(); i++) {
			System.out.println(managers.get(i).getId());
		}
	}

	private static void showTeamMateIDs() {
		for (int i = 0; i < teamMates.size(); i++) {
			System.out.println(teamMates.get(i).getId());
		}
	}

}
