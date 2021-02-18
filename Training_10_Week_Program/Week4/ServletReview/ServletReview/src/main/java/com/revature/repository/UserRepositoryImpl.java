package com.revature.repository;

import java.util.Arrays;
import java.util.List;

import com.revature.model.User;

/**
 * 
 * @author ChristinaRuss
 * 
 * This repository is a dummy repository. There is no actual connection to the
 * database as our focus for this demonstration is servlets.
 *
 */
public class UserRepositoryImpl implements UserRepository{

	public List<User> findAll() {
		return Arrays.asList(
				new User(1, "johndoe@gmail.com", "password"),
				new User(2, "admin@yahoo.com", "admin"),
				new User(3, "calligraphist@revature.com", "yolo"),
				new User(4, "soulcaliber@gmail.com", "pass"),
				new User(5, "luffy@jumpforce.com", "awspass")
				);
	}

}
