package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantRetentionPolicyValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableServer/poa.idl
* Monday, September 24, 2012 10:58:11 AM GMT-08:00
*/


/**
	 * ServantRetentionPolicyValue can have the following 
	 * values. RETAIN - to indicate that the POA will retain 
	 * active servants in its Active Object Map. 
	 * NON_RETAIN - to indicate Servants are not retained by 
	 * the POA. If no ServantRetentionPolicy is specified at 
	 * POA creation, the default is RETAIN.
	 */
public class ServantRetentionPolicyValue implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static org.omg.PortableServer.ServantRetentionPolicyValue[] __array = new org.omg.PortableServer.ServantRetentionPolicyValue [__size];

  public static final int _RETAIN = 0;
  public static final org.omg.PortableServer.ServantRetentionPolicyValue RETAIN = new org.omg.PortableServer.ServantRetentionPolicyValue(_RETAIN);
  public static final int _NON_RETAIN = 1;
  public static final org.omg.PortableServer.ServantRetentionPolicyValue NON_RETAIN = new org.omg.PortableServer.ServantRetentionPolicyValue(_NON_RETAIN);

  public int value ()
  {
    return __value;
  }

  public static org.omg.PortableServer.ServantRetentionPolicyValue from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ServantRetentionPolicyValue (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ServantRetentionPolicyValue
