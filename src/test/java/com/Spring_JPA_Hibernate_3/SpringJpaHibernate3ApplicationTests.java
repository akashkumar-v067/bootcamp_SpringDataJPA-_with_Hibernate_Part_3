package com.Spring_JPA_Hibernate_3;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class SpringJpaHibernate3ApplicationTests {

	@Autowired
	AuthorRepository authRepo;

	@Test
	void contextLoads() {

	}



	//OnetoOne demonstrate
	@Ignore
    @Test
	void test1(){
		Book b=new Book();
		b.setBookName("java core concepts");

		Author a=new Author();
		a.setId(123);
		a.setName("akash");

		b.setAuthorId(a);

		//bookRepo.save(b);


	}
	@Test
	void test2(){

		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		Book b4=new Book();
		b1.setBookName("java core concepts");

		b2.setBookName("Spring core concepts");

		b3.setBookName("hibernate core concepts");

		b4.setBookName("spring security core concepts");


		Author a=new Author();
		a.setId(125);
		a.setName("thapliyal");
		a.updateBooks(b1);
		a.updateBooks(b2);
		a.updateBooks(b3);
		a.updateBooks(b4);
		authRepo.save(a);


	}
}
