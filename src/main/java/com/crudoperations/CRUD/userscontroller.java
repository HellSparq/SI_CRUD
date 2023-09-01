package com.crudoperations.CRUD;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userscontroller {

	@RequestMapping("ss")
	String getData() {
		return "sparq";
	}

	ArrayList<users> ar = new ArrayList<>();

	public userscontroller() {
		ar.add(new users(101, "Weaver", 25));
		ar.add(new users(102, "Sven", 26));
		ar.add(new users(103, "Sniper", 27));
		ar.add(new users(104, "Magnus", 28));
	}

	@GetMapping("showallusers")
	public ArrayList<users> multipleRecordShow() {
		return ar;
	}

	@GetMapping("showsingleuser/{id}")
	public users singleRecordShow(@PathVariable int id) {
		users ss = new users();
		for (users users : ar) {
			if (users.id == id) {
				ss = users;
			}
		}
		return ss;
	}

	@PostMapping("insertuser")
	public ArrayList<users> insertRecord(@RequestBody users users) {
		ar.add(users);
		return ar;
	}

	@PutMapping("updateuser")
	public ArrayList<users> updateRecord(@RequestBody users users) {
		users ss = new users();
		for (users users1 : ar) {
			if (users1.id == users.id) {
				ss = users1;
			}
		}
		ss.setId(users.id);
		ss.setName(users.name);
		ss.setAge(users.age);
		return ar;
	}

	@DeleteMapping("deleteuser/{id}")
	public ArrayList<users> deleteUsers(@PathVariable int id) {
		users ss = new users();
		for (users users : ar) {
			if (users.id == id) {
				ss = users;
			}
		}
		ar.remove(ss);
		return ar;
	}
}
