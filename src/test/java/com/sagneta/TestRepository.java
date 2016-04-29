/*  Copyright (c) 2016
 *  by Stephen Agneta, Boston, MA
 *
 *  This software is furnished under a license and may be used only in
 *  accordance with the terms of such license.  This software may not be
 *  provided or otherwise made available to any other party.  No title to
 *  nor ownership of the software is hereby transferred.
 *
 *  This software is the intellectual property of Bjönd Health, Inc.,
 *  and is protected by the copyright laws of the United States of America.
 *  All rights reserved internationally.
 *
 */

package com.sagneta;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/** JUnit Test Suite TestBrigid
 *
 * @version 0.001 10/16/15
 * @author Stephen Agneta
 * @since Build 1.000
 *
 */
@Slf4j
public class TestRepository {
 
    /////////////////////////////////////////////////////////////////////////
    //                      Unit Tests below this point                    //
    /////////////////////////////////////////////////////////////////////////

    @Test
    public void sanityCheck() throws Exception {
        Assert.assertTrue("I ran ok!", true);
        System.out.println("This is a test"); // You should see this in the html report in stdout.
        log.info("Slf4j test");
    }


    
}

