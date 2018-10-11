package sample;

import org.junit.Before;
import org.junit.Test;

import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import netgloo.Application;

import org.junit.After;
import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class LiquibaseTest{


//    @Before
//    public void setUpStreams() throws LiquibaseException, SQLException {
//    	System.out.println("**PRE-TEST**");
//    	java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://172.21.0.2:3306/liquibase_spring?useSSL=false","root","toor"); //your openConnection logic here
//
//    	Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(connection));
//
//    	Liquibase liquibase = new Liquibase("src/main/resources/db/master.xml", new ClassLoaderResourceAccessor(), database);
//
//    	liquibase.tag("Version 1.0.0");
//    	liquibase.update(new Contexts(), new LabelExpression());
//    	
//    	
//    	
//    }
//
//    @Test
//    public void testAppConstructor() {
//        try {
//            new Application();
//        } catch (Exception e) {
//            fail("Construction failed.");
//        }
//    }
//
//
//    @After
//    public void cleanUpStreams() {
//        
//    }
}
