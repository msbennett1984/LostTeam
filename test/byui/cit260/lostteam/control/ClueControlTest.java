/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class ClueControlTest {
    
    public ClueControlTest() {
    }

    /**
     * Test of calcVolumeOfFlask method, of class ClueControl.
     */
    @Test
    public void testCalcVolumeOfFlask() {
        System.out.println("calcVolumeOfFlask");
        
        /************************
         * Test case #1
         ************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double height = 2;
        double radius = 3;
        
        double expResult = 18.85; // expected output returned value
        
        // create instance of ClueControl class
        ClueControl instance = new ClueControl();
        
        // call function to run test
        double result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /************************
         * Test case #2
         ************************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        height = -1;
        radius = 3;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 1);
        
        /************************
         * Test case #3
         ************************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        height = 2;
        radius = -1;
        
        expResult = -2; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 1);
        
        
        /************************
         * Test case #4
         ************************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        height = 1;
        radius = 3;
        
        expResult = -3; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 1);
        
        
        /************************
         * Test case #5
         ************************/
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        height = 2;
        radius = 4;
        
        expResult = -4; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 1);
    }

    /**
     * Test of calcTrajectoryDistance method, of class ClueControl.
     */
    @Test
    public void testCalcTrajectoryDistance() {
        
        /************************
         * Test Case 1 
        ************************/
        System.out.println("\tTest Case 1 Trajectory");
        
        // input values for test case 1
        double velocity = 50.0;
        double gravity = 32.0;
        
        // expected output return value
        double expResult = 78;
        
        // create instance of ClueControl class
        ClueControl instance = new ClueControl();
        
        // call function to run test 1
        double result = instance.calcTrajectoryDistance(velocity, gravity);
        
        // compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        

        /************************
         * Test Case 2
        ************************/
        System.out.println("\tTest Case 2 Trajectory");
        
        // input values for test case 2
        velocity = -1.0;
        gravity = 32.0;
        
        // expected output return value
        expResult = -1;
        
        // call function to run test 2
        result = instance.calcTrajectoryDistance(velocity, gravity);
        
        // compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        /************************
         * Test Case 3
        ************************/
        System.out.println("\tTest Case 3 Trajectory");
        
        // input values for test case 3
        velocity = 50;
        gravity = -1;
        
        // expected output return value
        expResult = -2;
        
        // call function to run test 3
        result = instance.calcTrajectoryDistance(velocity, gravity);
        
        // compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        /************************
         * Test Case 4
        ************************/
        System.out.println("\tTest Case 4 Trajectory");
        
        // input values for test case 4
        velocity = 101;
        gravity = 31;
        
        // expected output return value
        expResult = -4;
        
        // call function to run test 4
        result = instance.calcTrajectoryDistance(velocity, gravity);
        
        // compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        /************************
         * Test Case 5
        ************************/
        System.out.println("\tTest Case 5 Trajectory");
        
        // input values for test case 5
        velocity = 1.0;
        gravity = 34.0;
        
        // expected output return value
        expResult = -3;
        
        // call function to run test 5
        result = instance.calcTrajectoryDistance(velocity, gravity);
        
        // compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        /************************
         * Test Case 6
        ************************/
        System.out.println("\tTest Case 6 Trajectory");
        
        // input values for test case 6
        velocity = 1.0;
        gravity = 1.0;
        
        // expected output return value
        expResult = 1;
        
        // call function to run test 6
        result = instance.calcTrajectoryDistance(velocity, gravity);
        
        // compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        /************************
         * Test Case 7
        ************************/
        System.out.println("\tTest Case 7 Trajectory");
        
        // input values for test case 7
        velocity = 30;
        gravity = 3.0;
        
        // expected output return value
        expResult = 300;
        
        // call function to run test 7
        result = instance.calcTrajectoryDistance(velocity, gravity);
        
        // compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
        /************************
         * Test Case 8
        ************************/
        System.out.println("\tTest Case 8 Trajectory");
        
        // input values for test case 8
        velocity = 100.0;
        gravity = 50.0;
        
        // expected output return value
        expResult = 200;
        
        // call function to run test 8
        result = instance.calcTrajectoryDistance(velocity, gravity);
        
        // compare expected return value with the actual value returned
        assertEquals(expResult, result, 0.0);
        
    }
    
}
