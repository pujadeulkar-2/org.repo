/**
 * 
 */
package com.app.impl;

import java.util.Scanner;

import com.app.Batch;
import com.app.CLCService;
import com.app.Cource;
import com.app.Student;
import com.app.Trainer;

/**
 * @author DELL
 *
 */
public class CLCServiceImpl implements CLCService {

	Cource cource = null;
	Batch batch = null;
	Trainer trainer = null;
	Student student = null;

	Scanner sc = new Scanner(System.in);

	@Override
	public void addCource() {

		cource = new Cource();

		System.out.println("Enter cource id : ");
		cource.setId(sc.nextInt());

		System.out.println("Enter the cource name: ");
		cource.setCname(sc.next());

	}

	@Override
	public void addBatch() {

		if (cource != null) {
		} else {
			System.out.println("cource method not found please add");
			addCource();
		}

		batch = new Batch();
		System.out.println("Enter batch id: ");

		batch.setId(sc.nextInt());

		System.out.println("Enter Batch name : ");
		batch.setBname(sc.next());
		batch.setCource(cource);

	}

	@Override
	public void addTrainer() {
		if (batch != null) {
		} else {
			System.out.println("batch method not found please add");
			addCource();
		}

		trainer = new Trainer();
		System.out.println("Enter trainer id: ");

		trainer.setId(sc.nextInt());

		System.out.println("Enter trainer name : ");
		trainer.setTname(sc.next());
		trainer.setCource(cource);

	}

	@Override
	public void addStudent() {
		if (trainer != null) {
		} else {
			System.out.println("trainer method not found please add");
			addTrainer();
		}

		student = new Student();
		System.out.println("Enter student id: ");

		student.setId(sc.nextInt());

		System.out.println("Enter trainer name : ");
		trainer.setTname(sc.next());
		trainer.setCource(cource);


	}

	@Override
	public void displayCource() {
		System.out.println("Cource Id      Cource Name ");
		System.out.println(cource.getId() + "\t\t" + cource.getCname());

	}

	@Override
	public void displayBatch() {
		if (batch != null && cource != null) {
		} else {
			System.out.println("cource is not avialable please add");
		}
		System.out.println("--------------------Id----------------------Name");
		System.out.println("Batch Details : " + batch.getId() + "\t\t" + batch.getBname());
		System.out.println("Cource Details: "+ cource.getId() + "\t\t" + cource.getCname());

	}

	@Override
	public void displayTrainer() {
		if (trainer != null && batch != null) {
		} else {
			System.out.println("batch is not avialable please add");
		}
		System.out.println(trainer.getId() + "\t\t" + trainer.getTname());
		System.out.println(batch.getBname() + "\t\t" + batch.getId());
		

	}

	@Override
	public void displayStudent() {
		if (trainer != null && batch != null) {
		} else {
			System.out.println("trainer is not avialable please add");
		}
		System.out.println(student.getId() + "\t\t" + student.getSname());
		System.out.println(trainer.getTname() + "\t\t" + batch.getId());
		

	}

}
