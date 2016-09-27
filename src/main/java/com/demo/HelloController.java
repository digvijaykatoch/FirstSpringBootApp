package com.demo;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public String login(String userId, String password){
		String token="abc123";
		return token;
	}

	@RequestMapping(value="/social", method = RequestMethod.POST)
	public String social(String userlinkedInId, String linkedInToken){
		String token="abc123";
		return token;
	}

	@RequestMapping("/listPrograms")
	public List<Program> listPrograms(String userId, String req){
		List<Program> list = new ArrayList<>();
	    Program p1 = new Program("Program1","Institution1","Mentor1");
	    Program p2 = new Program("Program2","Institution2","Mentor2");
	    Program p3 = new Program("Program3","Institution3","Mentor3");
	    list.add(p1);
	    list.add(p2);
	    list.add(p3);
		return list;
	}

	@RequestMapping("/listInstitutions")
	public List<Institutions> listInstitutions(String userId, String req){
		List<Institutions> list = new ArrayList<>();
		Institutions inst1 = new Institutions("Insti1", "parent1", "abc", "city1", "state1", 12345, 1800, "a@b.com");
		list.add(inst1);
		return list;
	}

	@RequestMapping("/GetCurrentProgram")
	public Program currentProgram(String userId, String token){
		Program prog= new Program("Program1", "Institution1", "Mentor1");
		return prog;		
	}

	@RequestMapping("/inviteProfessionals")
	public int inviteProfessional(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/getActivities")
	public List<Activities> getActivities(String userId, String req){
		List <Activities> list=new ArrayList<>();
		Activities act1=new Activities(1, new Timestamp(new Date().getTime()), "action performed");
		Activities act2=new Activities(1, new Timestamp(new Date().getTime()), "action performed 2");
		list.add(act1);
		list.add(act2);
		return list;
	}

	@RequestMapping("/getMenteeRequests")
	public List<User> menteeRequest(String userId, String req){
		User usr1=new User("fname", "lname", "role", "school", "company", "prog", "intro", "pic", "terms", "sign", "parSign", 10000, "a@b.com", 1800, "skypeId", "performance", "P");
		List<User> list = new ArrayList<>();
		list.add(usr1);
		return list;
	}

	@RequestMapping("/findMatch")
	public User findMatch(String userId, String locale){
		User user = new User("fname", "lname", "role", "school", "company", "prog", "intro", "pic", "terms", "sign", "parSign", 10000, "a@b.com", 1800, "skypeId", "performance", "P");
		return user;
	}

	@RequestMapping("/getGoals")
	public List<Goals> getGoals(String userId, String req){
		List<Goals> list = new ArrayList<>();
		Goals goal1 = new Goals(1, 1, "Sub 1", "Getting it done",2, 25, "category", new Timestamp(0));
		Goals goal2 = new Goals(2, 2, "Sub 2", "Getting it done again",3, 50, "category", new Timestamp(0));
		list.add(goal1);
		list.add(goal2);
		return list;
	}

	@RequestMapping("/getTasks")
	public List<Tasks> getTasks(String userId, String req){
		List<Tasks> list = new ArrayList<>();
		Tasks task1=new Tasks(1, 1, "description", 2, "taskAssignment", 0);
		Tasks task2=new Tasks(2, 2, "description", 3, "taskAssignment", 1);
		list.add(task1);
		list.add(task2);
		return list;
	}

	@RequestMapping("/getMeetings")
	public List<Meetings> getMeetings(String userId, String req){
		List<Meetings> list = new ArrayList<>();
		Meetings meeting1=new Meetings(1, 1, new Timestamp(new Date().getTime()), new Timestamp(new Date().getTime()), "description");
		Meetings meeting2=new Meetings(2, 2, new Timestamp(new Date().getTime()), new Timestamp(new Date().getTime()), "description2");
		list.add(meeting1);
		list.add(meeting2);
		return list;
	}

	@RequestMapping("/addInstitutions")
	public int addInstitutions(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/addUser")
	public int addUser(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/addEvent")
	public int addEvent(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/createProfile")
	public int createProfile(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/ManageProgramGoal")
	public int manageProgramGoal(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/sendConsentMail")
	public int sendConsentMail(String userId, String req){
		int status=0;
		return status;
	}


	@RequestMapping("/editProfile")
	public int editProfile(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/updateInstitutions")
	public int updateInstitutions(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/updateUser")
	public int updateUser(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/deleteEvent")
	public int deleteEvent(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/deleteUser")
	public int delete(String userId, String req){
		int status=0;
		return status;
	}

	@RequestMapping("/getProgsByInstitution")
	public List<Program> getProgsByInstitution(String instituteId){
		List<Program> list = new ArrayList<>();
		Program p1 = new Program("Program1","Institution1","Mentor1");
	    Program p2 = new Program("Program2","Institution2","Mentor2");
	    Program p3 = new Program("Program3","Institution3","Mentor3");
	    list.add(p1);
	    list.add(p2);
	    list.add(p3);
		return list;		
	}

	@RequestMapping("/getAllMentorsOrMentees")
	public List<User> getAll(String userType){
		List<User> list = new ArrayList<>();
		User usr1=new User("fname", "lname", "role", "school", "company", "prog", "intro", "pic", "terms", "sign", "parSign", 10000, "a@b.com", 1800, "skypeId", "performance", "P");
		User usr2=new User("fname", "lname", "role", "school", "company", "prog", "intro", "pic", "terms", "sign", "parSign", 10000, "a@b.com", 1800, "skypeId", "performance", "P");
		User usr3=new User("fname", "lname", "role", "school", "company", "prog", "intro", "pic", "terms", "sign", "parSign", 10000, "a@b.com", 1800, "skypeId", "performance", "P");
		list.add(usr1);
		list.add(usr2);
		list.add(usr3);
		return list;		
	}

	@RequestMapping("/getAllMentByInsti")
	public List<User> getAllMentByInsti(String userId, String userType, String instiution){
		List<User> list = new ArrayList<>();
		User usr1=new User("fname", "lname", "role", "school", "company", "prog", "intro", "pic", "terms", "sign", "parSign", 10000, "a@b.com", 1800, "skypeId", "performance", "P");
		list.add(usr1);
		return list;		
	}

	@RequestMapping("/getUser")
	public User getUser(String req){
		User user=new User("fname", "lname", "role", "school", "company", "prog", "intro", "pic", "terms", "sign", "parSign", 10000, "a@b.com", 1800, "skypeId", "performance", "P");
		return user;		
	}

	@RequestMapping("/reassign")
	public int reassign(String userId, String details){
		int status=0;
		return status;
	}

	@RequestMapping("/approve")
	public int approve(String userId, String details){
		int status=0;
		return status;
	}

	@RequestMapping("/getCalByInsti")
	public List<Calendar> getCalByInsti(String userId, String instiution){
		List<Calendar> list = new ArrayList<>();
		Calendar cal1 = Calendar.getInstance();
        cal1.set(Integer.parseInt("2016"), Integer.parseInt("12") - 1, Integer.parseInt("25"));
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Integer.parseInt("2016"), Integer.parseInt("12") - 1, Integer.parseInt("29"));
		list.add(cal1);
		list.add(cal2);
        return list;		
	}

}