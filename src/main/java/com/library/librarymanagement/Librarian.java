package com.library.librarymanagement;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Librarian extends Person{


	
	public void blockMember(Member member)
	{
		member.setAstatus(AccountStatus.BLACKLISTED);
		System.out.println(member.getName()+"'s access blocked");
	}
	
	public void unblockMember(Member member)
	{
		member.setAstatus(AccountStatus.ACTIVE);
		System.out.println(member.getName()+"'s account activated");
	}
	
	public void printListOfMembers(List<Member> members)
	{
		for(Member mem : members)
			System.out.println(mem);
	}
	

	public void printListOfBooks(List<Books> books)
	{
		for(Books book : books)
			System.out.println(book);
	}
	public List<String> listofmembers(List<Member> members)
	{
		List<String> mems=new ArrayList<String>();
		for(Member mem : members)
			mems.add(mem.getName());
		return mems;
	}
	public List<String> listofactivemembers(List<Member> members)
	{
		List<String> active=new ArrayList<String>();
		for(Member mem : members)
			if(mem.getAstatus()==AccountStatus.ACTIVE)
				active.add(mem.getName());
		return active;
	}
}
