/* Copyright (C) 2003 Vladimir Roubtsov. All rights reserved.
 * 
 * This program and the accompanying materials are made available under
 * the terms of the Common Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/cpl-v10.html
 * 
 * $Id: //DTV/MP_BR/DTV_X_IDTV0801_002298_3_001/android/kk-4.x/external/emma/core/java12/com/vladium/jcd/opcodes/IOpcodeVisitor.java#1 $
 */
package com.vladium.jcd.opcodes;

// ----------------------------------------------------------------------------
/**
 * @author Vlad Roubtsov, (C) 2003
 */
public
interface IOpcodeVisitor
{
    // public: ................................................................
    
    void visit (int opcode, boolean wide, int offset, Object ctx);

} // end of interface
// ----------------------------------------------------------------------------
