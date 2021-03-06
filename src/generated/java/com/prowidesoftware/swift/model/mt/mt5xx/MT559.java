/*******************************************************************************
 * Copyright (c) 2016 Prowide Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as 
 *     published by the Free Software Foundation, either version 3 of the 
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 *     
 *     Check the LGPL at <http://www.gnu.org/licenses/> for more details.
 *******************************************************************************/
package com.prowidesoftware.swift.model.mt.mt5xx;



import com.prowidesoftware.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.utils.Lib;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;

/**
 * <h1>MT 559 - Paying Agent's Claim</h1>
 * <h3>SWIFT MT559 (ISO 15022) message structure:</h3>
 *
 <div class="scheme"><ul>
<li class="field">Field 19  (M)</li>
<li class="field">Field 23  (M)</li>
<li class="field">Field 53 A,C,D (O)</li>
<li class="field">Field 57 A,B,D (O)</li>
<li class="field">Field 72  (O)</li>
<li class="sequence">
Sequence _A (M) (repetitive)<ul><li class="field">Field 20  (M)</li>
<li class="field">Field 35 A (M)</li>
<li class="field">Field 35 B (M)</li>
<li class="field">Field 35 C,D (O)</li>
<li class="field">Field 35 E (O)</li>
<li class="field">Field 35 U (O)</li>
<li class="field">Field 31 E (O)</li>
<li class="field">Field 31 L (O)</li>
<li class="field">Field 31 C (O)</li>
<li class="field">Field 31 S (O)</li>
<li class="field">Field 80 C (O)</li>
<li class="field">Field 33 T (O)</li>
<li class="field">Field 35 L (O)</li>
<li class="field">Field 32 M (O)</li>
<li class="field">Field 32 G (O)</li>
<li class="field">Field 71 C (O)</li>
<li class="field">Field 71 B (O)</li>
<li class="field">Field 36  (O)</li>
<li class="field">Field 34 A (M)</li>
<li class="field">Field 75  (O)</li>
<li class="field">Field 72  (O)</li>
</ul></li>
</ul></div>

 <style>
.scheme, .scheme ul, .scheme li {
     position: relative;
}
.scheme ul {
    list-style: none;
    padding-left: 32px;
}
.scheme li::before, .scheme li::after {
    content: "";
    position: absolute;
    left: -12px;
}
.scheme li::before {
    border-top: 1px solid #000;
    top: 9px;
    width: 8px;
    height: 0;
}
.scheme li::after {
    border-left: 1px solid #000;
    height: 100%;
    width: 0px;
    top: 2px;
}
.scheme ul > li:last-child::after {
    height: 8px;
}</style>

 *
 * <p>This source code is specific to release <strong>SRU 2017</strong></p> 
 * <p>For additional resources check <a href="http://www.prowidesoftware.com/resources">http://www.prowidesoftware.com/resources</a></p>
 *
 * @author www.prowidesoftware.com
 */
@Generated
public class MT559 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2017;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT559.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "559";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value A 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsA.A
	* @see com.prowidesoftware.swift.SchemeConstantsA#A
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String A = "A";

	/**
	* Constant for qualifier with value BON 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsB.BON
	* @see com.prowidesoftware.swift.SchemeConstantsB#BON
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String BON = "BON";

	/**
	* Constant for qualifier with value CER 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CER
	* @see com.prowidesoftware.swift.SchemeConstantsC#CER
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CER = "CER";

	/**
	* Constant for qualifier with value CPN 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CPN
	* @see com.prowidesoftware.swift.SchemeConstantsC#CPN
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CPN = "CPN";

	/**
	* Constant for qualifier with value F 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.F
	* @see com.prowidesoftware.swift.SchemeConstantsF#F
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String F = "F";

	/**
	* Constant for qualifier with value FMT 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FMT
	* @see com.prowidesoftware.swift.SchemeConstantsF#FMT
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FMT = "FMT";

	/**
	* Constant for qualifier with value M 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsM.M
	* @see com.prowidesoftware.swift.SchemeConstantsM#M
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String M = "M";

	/**
	* Constant for qualifier with value MSC 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsM.MSC
	* @see com.prowidesoftware.swift.SchemeConstantsM#MSC
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String MSC = "MSC";

	/**
	* Constant for qualifier with value OPC 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsO.OPC
	* @see com.prowidesoftware.swift.SchemeConstantsO#OPC
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String OPC = "OPC";

	/**
	* Constant for qualifier with value OPS 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsO.OPS
	* @see com.prowidesoftware.swift.SchemeConstantsO#OPS
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String OPS = "OPS";

	/**
	* Constant for qualifier with value PRC 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsP.PRC
	* @see com.prowidesoftware.swift.SchemeConstantsP#PRC
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String PRC = "PRC";

	/**
	* Constant for qualifier with value PRS 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsP.PRS
	* @see com.prowidesoftware.swift.SchemeConstantsP#PRS
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String PRS = "PRS";

	/**
	* Constant for qualifier with value Q 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsQ.Q
	* @see com.prowidesoftware.swift.SchemeConstantsQ#Q
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String Q = "Q";

	/**
	* Constant for qualifier with value RTE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsR.RTE
	* @see com.prowidesoftware.swift.SchemeConstantsR#RTE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String RTE = "RTE";

	/**
	* Constant for qualifier with value RTS 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsR.RTS
	* @see com.prowidesoftware.swift.SchemeConstantsR#RTS
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String RTS = "RTS";

	/**
	* Constant for qualifier with value S 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsS.S
	* @see com.prowidesoftware.swift.SchemeConstantsS#S
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String S = "S";

	/**
	* Constant for qualifier with value SHS 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsS.SHS
	* @see com.prowidesoftware.swift.SchemeConstantsS#SHS
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String SHS = "SHS";

	/**
	* Constant for qualifier with value UNT 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsU.UNT
	* @see com.prowidesoftware.swift.SchemeConstantsU#UNT
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String UNT = "UNT";

	/**
	* Constant for qualifier with value WTS 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsW.WTS
	* @see com.prowidesoftware.swift.SchemeConstantsW#WTS
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String WTS = "WTS";

	/**
	* Constant for qualifier with value X 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsX.X
	* @see com.prowidesoftware.swift.SchemeConstantsX#X
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String X = "X";

// end qualifiers constants	

	/**
	 * Creates an MT559 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT559 content
	 */
	public MT559(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT559 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT559 content, the parameter can not be <code>null</code>
	 * @see #MT559(String)
	 */
	public MT559(MtSwiftMessage m) {
		this();
		super.m = super.getSwiftMessageNotNullOrException();
		sanityCheck(super.m);
	}
	
	/**
	 * Creates an MT559 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT559 content
	 * @return the created object or <code>null</code> if the parameter is <code>null</code>
	 * @see #MT559(String)
	 * @since 7.7
	 */
	public static MT559 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT559(m.message());
	}
	
	/**
	 * Creates and initializes a new MT559 input message setting TEST BICS as sender and receiver.<br />
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT559() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT559 input message from sender to receiver.<br />
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT559(final String sender, final String receiver) {
		super(559, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	* 
	* @see #MT559(String, String)
	* @deprecated Use instead <code>new MT559(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public MT559(final int messageType, final String sender, final String receiver) {
		super(559, sender, receiver);
		com.prowidesoftware.deprecation.DeprecationUtils.phase2(getClass(), "MT559(int, String, String)", "Use the constructor MT559(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT559 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT559(final String fin) {
		super();
		if (fin != null) {
			final SwiftMessage parsed = read(fin);
			if (parsed != null) {
				super.m = parsed;
				sanityCheck(parsed);
			}
		}
    }
    
    private void sanityCheck(final SwiftMessage param) {
    	if (param.isServiceMessage()) {
			log.warning("Creating an MT559 object from FIN content with a Service Message. Check if the MT559 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT559 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT559 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter cannot be parsed, the returned MT559 will have its internal message object
	 * initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be <code>null</code> in which case this method returns null</em>
	 * @return a new instance of MT559 or null if fin is null 
	 * @since 7.7
	 */
	public static MT559 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT559(fin);
    }
    
    /**
	 * Creates a new MT559 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT559(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT559 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT559 or null if stream is null or the message cannot be parsed 
	 * @since 7.7
	 */
	public static MT559 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT559(stream);
    }
    
    /**
	 * Creates a new MT559 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT559(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT559 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT559 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @since 7.7
	 */
	public static MT559 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT559(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "559";
	}
	
	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT559 append(final SwiftTagListBlock block) {
		super.append(block);
		return this;
	}
	
	/**
	 * Add all tags to the end of the block4.
	 *
	 * @param tags to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT559 append(final Tag ... tags) {
		super.append(tags);
		return this;
	}
	
	/**
	 * Add all the fields to the end of the block4.
	 *
	 * @param fields to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT559 append(final Field ... fields) {
		super.append(fields);
		return this;
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 19, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 19 at MT559 is expected to be the only one.
	 * 
	 * @return a Field19 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field19 getField19() {
		final Tag t = tag("19");
		if (t != null) {
			return new Field19(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23 at MT559 is expected to be the only one.
	 * 
	 * @return a Field23 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23 getField23() {
		final Tag t = tag("23");
		if (t != null) {
			return new Field23(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53A at MT559 is expected to be the only one.
	 * 
	 * @return a Field53A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53A getField53A() {
		final Tag t = tag("53A");
		if (t != null) {
			return new Field53A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53C at MT559 is expected to be the only one.
	 * 
	 * @return a Field53C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53C getField53C() {
		final Tag t = tag("53C");
		if (t != null) {
			return new Field53C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53D at MT559 is expected to be the only one.
	 * 
	 * @return a Field53D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53D getField53D() {
		final Tag t = tag("53D");
		if (t != null) {
			return new Field53D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57A at MT559 is expected to be the only one.
	 * 
	 * @return a Field57A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57A getField57A() {
		final Tag t = tag("57A");
		if (t != null) {
			return new Field57A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57B at MT559 is expected to be the only one.
	 * 
	 * @return a Field57B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57B getField57B() {
		final Tag t = tag("57B");
		if (t != null) {
			return new Field57B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57D at MT559 is expected to be the only one.
	 * 
	 * @return a Field57D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57D getField57D() {
		final Tag t = tag("57D");
		if (t != null) {
			return new Field57D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 20 at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field20 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field20> getField20() {
		final List<Field20> result = new ArrayList<Field20>();
		final Tag[] tags = tags("20");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field20(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35A at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35A> getField35A() {
		final List<Field35A> result = new ArrayList<Field35A>();
		final Tag[] tags = tags("35A");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field35A(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35B at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35B> getField35B() {
		final List<Field35B> result = new ArrayList<Field35B>();
		final Tag[] tags = tags("35B");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field35B(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35C at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35C> getField35C() {
		final List<Field35C> result = new ArrayList<Field35C>();
		final Tag[] tags = tags("35C");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field35C(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35D at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35D> getField35D() {
		final List<Field35D> result = new ArrayList<Field35D>();
		final Tag[] tags = tags("35D");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field35D(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35E at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35E> getField35E() {
		final List<Field35E> result = new ArrayList<Field35E>();
		final Tag[] tags = tags("35E");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field35E(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35U, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35U at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35U objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35U> getField35U() {
		final List<Field35U> result = new ArrayList<Field35U>();
		final Tag[] tags = tags("35U");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field35U(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 31E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 31E at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field31E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field31E> getField31E() {
		final List<Field31E> result = new ArrayList<Field31E>();
		final Tag[] tags = tags("31E");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field31E(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 31L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 31L at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field31L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field31L> getField31L() {
		final List<Field31L> result = new ArrayList<Field31L>();
		final Tag[] tags = tags("31L");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field31L(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 31C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 31C at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field31C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field31C> getField31C() {
		final List<Field31C> result = new ArrayList<Field31C>();
		final Tag[] tags = tags("31C");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field31C(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 31S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 31S at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field31S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field31S> getField31S() {
		final List<Field31S> result = new ArrayList<Field31S>();
		final Tag[] tags = tags("31S");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field31S(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 80C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 80C at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field80C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field80C> getField80C() {
		final List<Field80C> result = new ArrayList<Field80C>();
		final Tag[] tags = tags("80C");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field80C(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 33T, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 33T at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field33T objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field33T> getField33T() {
		final List<Field33T> result = new ArrayList<Field33T>();
		final Tag[] tags = tags("33T");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field33T(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 35L at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35L> getField35L() {
		final List<Field35L> result = new ArrayList<Field35L>();
		final Tag[] tags = tags("35L");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field35L(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 32M, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 32M at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field32M objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field32M> getField32M() {
		final List<Field32M> result = new ArrayList<Field32M>();
		final Tag[] tags = tags("32M");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field32M(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 32G, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 32G at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field32G objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field32G> getField32G() {
		final List<Field32G> result = new ArrayList<Field32G>();
		final Tag[] tags = tags("32G");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field32G(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 71C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 71C at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field71C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field71C> getField71C() {
		final List<Field71C> result = new ArrayList<Field71C>();
		final Tag[] tags = tags("71C");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field71C(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 71B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 71B at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field71B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field71B> getField71B() {
		final List<Field71B> result = new ArrayList<Field71B>();
		final Tag[] tags = tags("71B");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field71B(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 36, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 36 at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field36 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field36> getField36() {
		final List<Field36> result = new ArrayList<Field36>();
		final Tag[] tags = tags("36");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field36(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 34A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 34A at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field34A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field34A> getField34A() {
		final List<Field34A> result = new ArrayList<Field34A>();
		final Tag[] tags = tags("34A");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field34A(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 75, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 75 at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field75 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field75> getField75() {
		final List<Field75> result = new ArrayList<Field75>();
		final Tag[] tags = tags("75");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field75(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 72, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 72 at MT559 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field72 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field72> getField72() {
		final List<Field72> result = new ArrayList<Field72>();
		final Tag[] tags = tags("72");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field72(tags[i].getValue()));
		}
		return result;
	}
	



}
