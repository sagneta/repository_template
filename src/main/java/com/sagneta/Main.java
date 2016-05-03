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



import java.io.IOException;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;



/** <p> Main entry point for the application </p>

 *
 * <a href="mailto:Stephen.Agneta@bjondinc.com">Steve 'Crash' Agneta</a>
 *
 */
@Slf4j
public class Main  {
    
    /**
	 *  Main entry point. Takes no parameters. Just accepts stdin and outputs to
     * stdout. Old school...
	 * 
	 * @param args
	 * 
	 * @throws IOException
	 * @throws SQLException
	 */
    public static void main(String[] args) {
        log.info("Main has been executed.");
    }

}
